package com.elaine.androidhttp.http.loading;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.TextView;

import com.elaine.androidhttp.R;
import com.wang.avi.AVLoadingIndicatorView;

/**
 * 加载中的对话框(仿ios风格)
 *
 * @author elaine
 * @date 2020/3/23
 */
public class LoadingDialog extends AlertDialog {

    private AVLoadingIndicatorView avi;
    private TextView mTvTip;

    LoadingDialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.setContentView(R.layout.layout_loading_dialog);
        avi = this.findViewById(R.id.avi);
        mTvTip = this.findViewById(R.id.tv_tip);
    }

    public void setTip(String tip) {
        mTvTip.setText(tip);
    }

    @Override
    public void show() {
        super.show();
        if (avi != null) {
            avi.smoothToShow();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        if (avi != null) {
            avi.smoothToHide();
        }
    }
}
