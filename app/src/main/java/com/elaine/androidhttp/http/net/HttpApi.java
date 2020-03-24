package com.elaine.androidhttp.http.net;

import com.elaine.androidhttp.http.HttpService;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.elaine.androidhttp.http.HttpUrl.BASE_URL;

/**
 * @author elaine
 * @date 2020/3/23
 */
public class HttpApi {
    private static HttpApi httpApi;
    private HttpService httpService;

    private HttpApi() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .addInterceptor(new LogInterceptor())
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        httpService = retrofit.create(HttpService.class);
    }

    public static HttpApi getHttpApi() {
        synchronized (HttpApi.class) {
            if (httpApi == null) {
                httpApi = new HttpApi();
            }
        }
        return httpApi;
    }

    public HttpService getHttpService() {
        return httpService;
    }

    /**
     * 可用于切换debug和release环境切换
     */
    public static void clearHttpApi() {
        if (httpApi != null) {
            httpApi = null;
        }
    }
}
