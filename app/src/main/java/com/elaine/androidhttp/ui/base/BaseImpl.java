package com.elaine.androidhttp.ui.base;

import android.content.Context;

import com.elaine.androidhttp.bean.BaseBean;
import com.elaine.androidhttp.bean.SubjectsBean;
import com.elaine.androidhttp.http.HttpUtil;
import com.elaine.androidhttp.http.net.MyObserver;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * 请求实现
 *
 * @author elaine
 * @date 2020/3/23
 */
public class BaseImpl implements IBase {
    @Override
    public void getFilmList(Context context, boolean isShow, String start, String count, final GetFilmListListener listener) {
        HttpUtil.getInstance().getFilmList(start, count)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MyObserver<BaseBean>(context, isShow) {
                    @Override
                    public void onMyNext(String jsonStr) {
                        List<SubjectsBean> list = new Gson().fromJson(jsonStr, new TypeToken<List<SubjectsBean>>() {
                        }.getType());
                        listener.onFilmListSuccess(list);
                    }

                    @Override
                    public void onMyFailed(String msg) {
                        listener.onFailed(msg);
                    }
                });
    }
}
