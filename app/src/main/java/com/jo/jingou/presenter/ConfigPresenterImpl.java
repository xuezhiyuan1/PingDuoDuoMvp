package com.jo.jingou.presenter;

import com.jo.jingou.core.CallBackListener;
import com.jo.jingou.model.HomeService;
import com.jo.jingou.model.bean.BaseBean;
import com.jo.jingou.model.bean.HaiTaoBean;
import com.jo.jingou.model.bean.LeftBean;
import com.jo.jingou.model.bean.NewBean;
import com.jo.jingou.view.ConfigViewInterface;

import java.util.ArrayList;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class ConfigPresenterImpl implements ConfigPresenterInterface {
    private ConfigViewInterface configView;

    public ConfigPresenterImpl() {
    }

    public ConfigPresenterImpl(ConfigViewInterface configView) {
        this.configView = configView;
    }
    //加载
    @Override
    public void loadData(String sid) {
        HomeService.getInstance().getConfig(sid, new CallBackListener<NewBean>() {
            @Override
            public void onNetStart() {
                showOrHiderProgress(true);
            }

            @Override
            public void onNetSuccess(NewBean configResponse) {
                if (configResponse != null) {
                    configView.refreshView(configResponse);
                }
            }

            @Override
            public void onNetFail(NewBean s) {

            }


        });
    }
    //加载
    @Override
    public void loadDatas(String sid) {
        HomeService.getInstance().getConfigs(sid, new CallBackListener<ArrayList<LeftBean>>() {
            @Override
            public void onNetStart() {

            }
            @Override
            public void onNetSuccess(ArrayList<LeftBean> leftBeen) {
                if (leftBeen != null) {
                    configView.refreshView(leftBeen);
                }
            }
            @Override
            public void onNetFail(ArrayList<LeftBean> leftBeen) {

            }
        });
    }

    @Override
    public void loadHaiTao() {
        HomeService.getInstance().getHaiTaoConfig(new CallBackListener<HaiTaoBean>() {
            @Override
            public void onNetStart() {

            }

            @Override
            public void onNetSuccess(HaiTaoBean haiTaoBean) {

                configView.refreshView(haiTaoBean);
            }

            @Override
            public void onNetFail(HaiTaoBean haiTaoBean) {

            }
        });
    }
     //Base
     @Override
     public void loadHom(String sid) {
         HomeService.getInstance().getConfigHom(new CallBackListener<ArrayList<BaseBean>>() {
             @Override
             public void onNetStart() {

             }

             @Override
             public void onNetSuccess(ArrayList<BaseBean> baseBeen) {
                 if (baseBeen!=null){
                     configView.refreshView(baseBeen);
                 }
             }

             @Override
             public void onNetFail(ArrayList<BaseBean> baseBeen) {

             }
         });
     }

    private void showOrHiderProgress(boolean flag) {
        if (configView != null) {
            configView.showOrHideProgress(flag);
        }
    }
    @Override
    public void detachView() {
        if (configView != null) {
            configView = null;
        }
    }
}
