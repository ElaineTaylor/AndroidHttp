package com.elaine.androidhttp.ui.base;

import com.elaine.androidhttp.bean.SubjectsBean;

import java.util.List;

/**
 * 请求数据监听
 *
 * @author elaine
 * @date 2020/3/23
 */
public interface GetFilmListListener extends BaseListener {
    void onFilmListSuccess(List<SubjectsBean> subjectsBeanList);
}
