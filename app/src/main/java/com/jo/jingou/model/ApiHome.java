package com.jo.jingou.model;

import com.jo.jingou.baseurl.Constonse;
import com.jo.jingou.core.ApiGenerator;
import com.jo.jingou.core.BaseService;

import retrofit2.Call;

/**
 * Data:
 * Author: 付明
 * Des:
 */
//Model:负责存储、检索、操纵数据(有时也实现一个Model interface用来降低耦合);
public class ApiHome {
    //静态
    private static volatile ApiHome intance = null;
    //调用请求方式beaseRequest
    private BaseService baseService;

    //调用Retrofir请求方式
    private ApiHome() {
        baseService = ApiGenerator.getBaseNetServer();
    }

    public static ApiHome getIntance() {
        if (intance == null) {
            synchronized (ApiHome.class) {
                if (intance == null) {
                    intance = new ApiHome();
                }
            }
        }
        return intance;
    }

    //获取配置数据网络的Url
//    http://apiv3.yangkeduo.com/v5/newlist?size=20&ver=1504437600014&pdduid=&page=
    public Call<String> getConfigFromServer(String sid) {
        if (baseService == null) {
            baseService = ApiGenerator.getBaseNetServer();
        }
        return baseService.baseGetRequest(getConfigUrl(sid));
    }

    private String getConfigUrl(String sid) {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(Constonse.New_url)
                .append(sid);
        return stringbuffer.toString();
    }

    //获取配置数据网络的Url
//    http://apiv3.yangkeduo.com/v5/newlist?size=20&ver=1504437600014&pdduid=&page=
    public Call<String> getConfigFromServers(String sid) {
        if (baseService == null) {
            baseService = ApiGenerator.getBaseNetServer();
        }
        return baseService.baseGetRequest(getConfigUrls(sid));
    }
    private String getConfigUrls(String sid) {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(Constonse.Left_Url)
                .append(sid);
        return stringbuffer.toString();
    }

    //http://apiv4.yangkeduo.com/v2/haitaov2?page=1&size=20&pdduid=
    public Call<String> getHaiTaoBeanFromServer() {
        if (baseService == null) {
            baseService = ApiGenerator.getBaseNetServer();
        }
        return baseService.baseGetRequest(getConfigHaiTao());
    }
    private String getConfigHaiTao() {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(Constonse.HT_URL).append("haitaov2?page=1&size=20&pdduid=");
        return stringbuffer.toString();
    }
    //base    home_operations?pdduid
    public Call<String> getHomBeanFromServerbase() {
        if (baseService == null) {
            baseService = ApiGenerator.getBaseNetServer();
        }
        return baseService.baseGetRequest(getConfigHom());
    }
    private String getConfigHom() {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(Constonse.BASE_URL).append("home_operations?pdduid");
        return stringbuffer.toString();
    }
}
