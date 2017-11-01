package com.jo.jingou.presenter;

/**
 * Data:
 * Author: 付明
 * Des:
 */
//Presenter:作为View与Model交互的中间纽带，处理与用户交互的负责逻辑。
public interface ConfigPresenterInterface<T> {

    //可操作的业务逻辑。手指头触发的。
    void loadData(String sid);
    void loadDatas(String sid);
    void loadHaiTao();
    void loadHom(String sid);
    void detachView();
}
