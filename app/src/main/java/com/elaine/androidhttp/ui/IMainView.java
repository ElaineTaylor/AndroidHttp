package com.elaine.androidhttp.ui;

import com.elaine.androidhttp.bean.SubjectsBean;

import java.util.List;

/**
 * 数据成功的返回接口
 *
 * @author elaine
 * @date 2020/3/23
 */
public interface IMainView extends IBaseView {
    void onFilmListSuccess(List<SubjectsBean> subjectsBeanList);
}
