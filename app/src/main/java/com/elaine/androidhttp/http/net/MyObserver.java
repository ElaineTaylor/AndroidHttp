package com.elaine.androidhttp.http.net;

import android.content.Context;
import android.util.Log;

import com.elaine.androidhttp.bean.BaseBean;
import com.elaine.androidhttp.http.loading.LoadingDialogUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonParseException;

import org.json.JSONException;

import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.ParseException;

import io.reactivex.observers.DisposableObserver;
import retrofit2.HttpException;

public abstract class MyObserver<T> extends DisposableObserver<T> {
    private static ObjectMapper objectMapper;
    private boolean isShowDialog = false;
    private Context context;
    private LoadingDialogUtil loadingDialogUtil;

    @Override
    protected void onStart() {
        super.onStart();
        if (isShowDialog) {
            if (loadingDialogUtil != null) {
                loadingDialogUtil.showLoadingDialog(context);
            }
        }
    }

    public MyObserver() {
        objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
    }

    public MyObserver(Context context, boolean isShowDialog) {
        this.isShowDialog = isShowDialog;
        this.context = context;
        objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        loadingDialogUtil = LoadingDialogUtil.getInstance();
    }

    @Override
    public void onNext(T t) {
        if (BaseBean.class.isInstance(t)) {
            BaseBean result = (BaseBean) t;
            String jsonStr = null;
            try {
                jsonStr = objectMapper.writeValueAsString(result.getSubjects());
                onMyNext(jsonStr);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                onMyFailed("数据解析错误");
            }
        } else {
            try {
                String jsonStr = objectMapper.writeValueAsString(t);
                onMyNext(jsonStr);
                Log.i("原始数据", "原始数据" + jsonStr);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                onMyFailed("数据解析错误");
            }
        }
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        if (e instanceof HttpException) {
            onMyFailed("HTTP错误");
        } else if (e instanceof ConnectException
                || e instanceof UnknownHostException
                || e instanceof SocketTimeoutException) {
            onMyFailed("网络连接错误");
        } else if (e instanceof InterruptedIOException) {
            onMyFailed("网络连接超时");
        } else if (e instanceof JsonParseException
                || e instanceof JSONException
                || e instanceof ParseException) {
            onMyFailed("数据解析错误");
        } else {
            onMyFailed(e.toString());
        }
        if (isShowDialog) {
            if (loadingDialogUtil != null) {
                loadingDialogUtil.dismissLoadingDialog();
            }
        }
    }

    @Override
    public void onComplete() {
        if (isShowDialog) {
            if (loadingDialogUtil != null) {
                loadingDialogUtil.dismissLoadingDialog();
            }
        }
    }

    protected abstract void onMyNext(String object);

    public abstract void onMyFailed(String msg);
}
