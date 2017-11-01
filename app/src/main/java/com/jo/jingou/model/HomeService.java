package com.jo.jingou.model;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jo.jingou.core.CallBackListener;
import com.jo.jingou.model.bean.BaseBean;
import com.jo.jingou.model.bean.HaiTaoBean;
import com.jo.jingou.model.bean.LeftBean;
import com.jo.jingou.model.bean.NewBean;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class HomeService {
    private static volatile HomeService instance;

    private HomeService() {
    }

    public static HomeService getInstance() {
        if (instance == null) {
            synchronized (HomeService.class) {
                if (instance == null) {
                    instance = new HomeService();
                }
            }
        }
        return instance;
    }

    //获取配置数据
    public void getConfig(String sid, final CallBackListener callBackListener) {
        //网络请求开始
        callBackListener.onNetStart();
        Call<String> call = ApiHome.getIntance().getConfigFromServer(sid);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Gson gson = new Gson();
                if (response.isSuccessful()) {
                    String ss = response.body().toString();
                    NewBean configResponse = gson.fromJson(ss, NewBean.class);
//                    Log.d("ssss","co = "+configResponse);
                    callBackListener.onNetSuccess(configResponse);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                callBackListener.onNetFail("失败");
            }
        });
    }

    //获取配置数据
    public void getConfigs(String sid, final CallBackListener<ArrayList<LeftBean>> callBackListener) {
        //网络请求开始
        callBackListener.onNetStart();
        Call<String> call = ApiHome.getIntance().getConfigFromServers(sid);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Gson gson = new Gson();
                if (response.isSuccessful()) {
                    String ss = response.body().toString();
                    ArrayList<LeftBean> configResponse = gson.fromJson(ss, new TypeToken<List<LeftBean>>() {
                    }.getType());
//                    Log.d("ssss","co = "+configResponse);
                    callBackListener.onNetSuccess(configResponse);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                callBackListener.onNetFail(null);
            }
        });
    }

    //获取海淘页面数据
    public void getHaiTaoConfig(final CallBackListener<HaiTaoBean> listener) {
        listener.onNetStart();
        Call<String> call = ApiHome.getIntance().getHaiTaoBeanFromServer();
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Gson gson = new Gson();
                if (response != null && response.isSuccessful()){
                    String result = response.body().toString();
                    HaiTaoBean haiTaoBean = gson.fromJson(result,HaiTaoBean.class);
                    listener.onNetSuccess(haiTaoBean);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }
    //Base
    public void getConfigHom(final CallBackListener<ArrayList<BaseBean>> baselistener) {
        baselistener.onNetStart();
        Call<String> call = ApiHome.getIntance().getHomBeanFromServerbase();
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Gson gson = new Gson();
                if (response != null && response.isSuccessful()){
                    String result = response.body().toString();
                    ArrayList<BaseBean> bean = gson.fromJson(result, new TypeToken<ArrayList<BaseBean>>() {
                    }.getType());
                    Log.d("bean",bean+"");
//                    HaiTaoBean haiTaoBean = gson.fromJson(result,HaiTaoBean.class);
                    baselistener.onNetSuccess(bean);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }
}