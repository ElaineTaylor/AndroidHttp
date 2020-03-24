package com.elaine.androidhttp.http.loading;

import android.content.Context;

import com.elaine.androidhttp.R;

public class LoadingDialogUtil {
    private LoadingDialog loadingDialog;

    private static LoadingDialogUtil instance;

    public LoadingDialogUtil() {

    }

    public static LoadingDialogUtil getInstance() {
        if (instance == null) {
            synchronized (LoadingDialogUtil.class) {
                if (instance == null) {
                    instance = new LoadingDialogUtil();
                }
            }
        }
        return instance;
    }

    public void showLoadingDialog(Context context) {
        loadingDialog = new LoadingDialog(context, R.style.LoadingDialog);
        loadingDialog.setCancelable(true);
        loadingDialog.setCanceledOnTouchOutside(false);
        loadingDialog.show();
    }

    public void dismissLoadingDialog() {
        if (loadingDialog != null) {
            if (loadingDialog.isShowing()) {
                loadingDialog.dismiss();
            }
        }
    }
}
