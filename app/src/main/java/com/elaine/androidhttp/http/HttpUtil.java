package com.elaine.androidhttp.http;

import com.elaine.androidhttp.bean.BaseBean;
import com.elaine.androidhttp.http.net.HttpApi;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;

import static com.elaine.androidhttp.http.PublicData.API_KEY;
import static com.elaine.androidhttp.http.PublicData.API_KEY_VALUE;

/**
 * 请求具体实现
 * 1.公共参数
 * 2.特殊参数
 *
 * @author elaine
 * @date 2020/3/23
 */
public class HttpUtil {
    private static HttpUtil instance;

    private HttpService mHttpService;

    private HttpUtil() {
        mHttpService = HttpApi.getHttpApi().getHttpService();
    }

    public static HttpUtil getInstance() {
        synchronized (HttpUtil.class) {
            if (instance == null) {
                instance = new HttpUtil();
            }
        }
        return instance;
    }

    /**
     * 可用于切换debug和release环境切换
     */
    public static void clearHttpUtil() {
        if (instance != null) {
            instance = null;
        }
    }

    /**
     * 公共参数
     * 例如版本号等
     *
     * @return map
     */
    private static Map<String, String> getBasicMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put(API_KEY_VALUE, API_KEY);
        return map;
    }

    public Observable<BaseBean> getFilmList(String start, String count) {
        Map<String, String> map = getBasicMap();
        map.put("start", start);
        map.put("count", count);
        return mHttpService.getFilmList(map);
    }

}
