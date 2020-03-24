package com.elaine.androidhttp.ui;

import android.content.Context;

import com.elaine.androidhttp.bean.SubjectsBean;
import com.elaine.androidhttp.ui.base.BaseImpl;
import com.elaine.androidhttp.ui.base.GetFilmListListener;
import com.elaine.androidhttp.ui.base.IBase;

import java.util.List;

/**
 * 请求presenter
 *
 * @author elaine
 * @date 2020/3/23
 */
public class MainPresenter {
    private IBase iBase;
    private IMainView iMainView;

    public MainPresenter(IMainView iMainView) {
        this.iMainView = iMainView;
        iBase = new BaseImpl();
    }

    public void getFilmList(Context context, boolean isShow, String start, String count) {
        iBase.getFilmList(context, isShow, start, count, new GetFilmListListener() {
            @Override
            public void onFilmListSuccess(List<SubjectsBean> subjectsBeanList) {
                iMainView.onFilmListSuccess(subjectsBeanList);
            }

            @Override
            public void onFailed(String msg) {
                iMainView.onFailed(msg);
            }
        });
    }

}
