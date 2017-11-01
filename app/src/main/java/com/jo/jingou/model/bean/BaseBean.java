package com.jo.jingou.model.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class BaseBean {

    /**
     * opt_id : 14
     * id : 14
     * opt_name : 服饰
     * children : [{"opt_id":45,"opt_name":"女装","id":45,"home_man_priority":1,"home_priority":1,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-06/002216dbb20fb111c63c7b7d4af5319f.png"},{"opt_id":305,"opt_name":"套装","id":305,"home_man_priority":2,"home_priority":2,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-13/35486e2c17905400944d2c845b5cb9ba.png"},{"opt_id":52,"opt_name":"女裤","id":52,"home_man_priority":3,"home_priority":3,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-25/95e9f63138325ade3ed893d535c34c68.png"},{"opt_id":610,"opt_name":"内衣裤袜","id":610,"home_man_priority":4,"home_priority":4,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-13/93025dd21801ebee5614678172369750.png"},{"opt_id":48,"opt_name":"女鞋","id":48,"home_man_priority":5,"home_priority":5,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/4714cb3b092bc216a326fe6be6a1b3de.png"},{"opt_id":307,"opt_name":"裙子","id":307,"home_man_priority":6,"home_priority":6,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-13/9d878eff95e60bb842f7f34b0030acb2.png"},{"opt_id":485,"opt_name":"大码女装","id":485,"home_man_priority":7,"home_priority":7,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-13/4a4c6d63c9d51d0d81820a4ff0d3f43f.png"}]
     * home_man_priority : 5
     * home_priority : 1
     * image_url : http://omsproductionimg.yangkeduo.com/goods/5635bbe762/730/100/6bce5c6db8e6bf1a41b2544d453a255c.jpg
     */

    public int opt_id;
    public int id;

    @Override
    public String toString() {
        return "BaseBean{" +
                "opt_id=" + opt_id +
                ", id=" + id +
                ", opt_name='" + opt_name + '\'' +
                ", home_man_priority=" + home_man_priority +
                ", home_priority=" + home_priority +
                ", image_url='" + image_url + '\'' +
                ", children=" + children +
                '}';
    }

    public String opt_name;
    public int home_man_priority;
    public int home_priority;
    public String image_url;
    public List<ChildrenBean> children;

    public static BaseBean objectFromData(String str) {

        return new Gson().fromJson(str, BaseBean.class);
    }

    public static class ChildrenBean {
        /**
         * opt_id : 45
         * opt_name : 女装
         * id : 45
         * home_man_priority : 1
         * home_priority : 1
         * image_url : http://omsproductionimg.yangkeduo.com/images/2017-07-06/002216dbb20fb111c63c7b7d4af5319f.png
         */

        public int opt_id;
        public String opt_name;
        public int id;
        public int home_man_priority;
        public int home_priority;
        public String image_url;

        public static ChildrenBean objectFromData(String str) {

            return new Gson().fromJson(str, ChildrenBean.class);
        }
    }
}
