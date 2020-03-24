package com.elaine.androidhttp.ui;

import com.elaine.androidhttp.bean.SubjectsBean;

import java.util.List;

/**
 * @author elaine
 * @date 2020/3/23
 */
public interface IMainView extends IBaseView {
    void onFilmListSuccess(List<SubjectsBean> subjectsBeanList);
}
