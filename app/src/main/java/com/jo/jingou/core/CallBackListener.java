package com.jo.jingou.core;

/**
 * Data:
 * Author: 付明
 * Des:
 */
//网络请求
public interface CallBackListener<T> {
    //网络请求开始
    public void onNetStart();
    //网络请求成功
    public void onNetSuccess(T t);
    //网络请求失败
    public void onNetFail(T t);
}
