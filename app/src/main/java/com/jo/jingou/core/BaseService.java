package com.jo.jingou.core;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Data:
 * Author: 付明
 * Des:
 */
//抽取Base请求方式
public interface BaseService {
    @GET
    Call<String> baseGetRequest(@Url String url);
}
