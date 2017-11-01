package com.jo.jingou.core;

import com.jo.jingou.baseurl.Constonse;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class ApiGenerator {
    //提供静态Retrofit
    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Constonse.New_url)//网络请求
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();
     public static BaseService getBaseNetServer(){
         return retrofit.create(BaseService.class);

     }
     //search
     //提供静态Retrofit
     static Retrofit retrofits = new Retrofit.Builder()
             .baseUrl(Constonse.Left_Url)//网络请求
             .addConverterFactory(ScalarsConverterFactory.create())
             .build();
    public static BaseService getBaseNetServers(){
        return retrofits.create(BaseService.class);
    }
    //海淘
    //search
    //提供静态Retrofit
    static Retrofit retrofitss = new Retrofit.Builder()
            .baseUrl(Constonse.HT_URL)//网络请求
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();
    public static BaseService getBaseNetServerss(){
        return retrofits.create(BaseService.class);
    }

    //提供静态Retrofit
    static Retrofit retrofitbase = new Retrofit.Builder()
            .baseUrl(Constonse.BASE_URL)//网络请求
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();
    public static BaseService getBaseNetServerbase(){
        return retrofitbase.create(BaseService.class);

    }

}
