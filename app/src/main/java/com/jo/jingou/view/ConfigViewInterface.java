package com.jo.jingou.view;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public interface ConfigViewInterface<T> {
    //隐藏进度
    void showOrHideProgress(boolean flag);
    //错误进度
    void showOrHideErrorView(boolean flag);
    void refreshView(T t);

}
