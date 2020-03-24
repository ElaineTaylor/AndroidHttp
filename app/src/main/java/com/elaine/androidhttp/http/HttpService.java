package com.elaine.androidhttp.http;

import com.elaine.androidhttp.bean.BaseBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import static com.elaine.androidhttp.http.HttpUrl.GET_FILM_LIST;

public interface HttpService {

    @FormUrlEncoded
    @POST(GET_FILM_LIST)
    Observable<BaseBean> getFilmList(@FieldMap Map<String, String> map);

}
