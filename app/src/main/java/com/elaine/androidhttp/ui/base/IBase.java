package com.elaine.androidhttp.ui.base;

import android.content.Context;

/**
 * @author elaine
 * @date 2020/3/23
 */
public interface IBase {
    void getFilmList(Context context, boolean isShow, String start, String count, GetFilmListListener listener);
}
