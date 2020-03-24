package com.elaine.androidhttp.ui.base;

import com.elaine.androidhttp.bean.SubjectsBean;

import java.util.List;

/**
 * @author elaine
 * @date 2020/3/23
 */
public interface GetFilmListListener extends BaseListener {
    void onFilmListSuccess(List<SubjectsBean> subjectsBeanList);
}
