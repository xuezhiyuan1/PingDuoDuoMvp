package com.jo.jingou.model.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class JinBeanItem
{

    /**
     * second_name :
     * goods_list : [{"normal_price":3080,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/5346ed5fc35d51381b104e57baccf31a.jpeg","event_type":0,"sales":5866,"goods_id":37140,"short_name":"【教育部推荐书目】8册青少年儿童版名著系列鲁滨逊漂流记 假如给我三天光明 钢铁是怎样炼成的小王子世界文学名著小说","quantity":2586,"logo":"","is_app":0,"price":2190,"market_price":12500,"goods_name":"【教育部推荐书目】8册青少年儿童版名著系列鲁滨逊漂流记 假如给我三天光明 钢铁是怎样炼成的小王子世界文学名著小说","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/5aeaeb5d350359bd38d0c210c2848b64.jpeg","customer_num":2,"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/05fabd14e4d3bf22352e7fb92ea59811.jpeg","is_onsale":1},{"normal_price":1680,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/09b78c27eaad0299f5e5170ebb375249.jpeg","event_type":0,"sales":1048,"goods_id":73364070,"short_name":"【开学必备】5件套正版新编新华字典 新华词典 成语词典 英汉小词典 同义近义反义词组词造句词典学生工具书【小学用至大学】","quantity":82537,"logo":"","is_app":0,"price":1580,"market_price":5120,"goods_name":"【开学必备】5件套正版新编新华字典 新华词典 成语词典 英汉小词典 同义近义反义词组词造句词典学生工具书【小学用至大学】","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-25/a38342694aa3607c162f2853a5c4bd40.jpeg","customer_num":2,"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/cffa9108fd45761d476f1f6563569548.jpeg","is_onsale":1},{"normal_price":3980,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-08/e854885e36f79389eb290db0b7fde20f.jpeg","event_type":0,"sales":9441,"goods_id":6597383,"short_name":"【名师推荐】全10册我在为自己读书一二三年级课外必读故事书注音版6-12岁小学生课外阅读书籍少儿图书儿童文学读物","quantity":8559,"logo":"","is_app":0,"price":2890,"market_price":16800,"goods_name":"【名师推荐】全10册我在为自己读书一二三年级课外必读故事书注音版6-12岁小学生课外阅读书籍少儿图书儿童文学读物","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-08/dc6302c8a8d183511986c95f72bb84f9.jpeg","customer_num":2,"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-08/2450c6f0f298dc929d764ef1cb082996.jpeg","is_onsale":1},{"normal_price":1780,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/1e8ff7e0dd4110ce0f6fdc1f8609a701.jpeg","event_type":0,"sales":1693,"goods_id":1997812,"short_name":"2017秋宇轩图书1-6年级上阳光同学课时优化作业 语文数学英语人教版小学生一年级二年级三年级四年级五年级六年级课堂同步","quantity":16810,"logo":"","is_app":0,"price":1380,"market_price":8040,"goods_name":"2017秋宇轩图书1-6年级上阳光同学课时优化作业 语文数学英语人教版小学生一年级二年级三年级四年级五年级六年级课堂同步","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/b6f7ab78c028fc8a70f0881e77210be0.jpeg","customer_num":2,"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/fc49d93c942495c5c8f147238b095d3a.jpeg","is_onsale":1},{"normal_price":1180,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/c0705666edaaf6f510a1f43ef38fe0fa.jpeg","event_type":0,"sales":3197,"goods_id":7078005,"short_name":"2017秋1-6年级上册 黄冈小状元作业本达标卷 语文数学英语口算 小学一年级二年级三年级四年级五年级六年级上册同步全解","quantity":96361,"logo":"","is_app":0,"price":1080,"market_price":13660,"goods_name":"2017秋1-6年级上册 黄冈小状元作业本达标卷 语文数学英语口算 小学一年级二年级三年级四年级五年级六年级上册同步全解","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/7b6be3afad0a29429407081e278abba5.jpeg","customer_num":2,"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/5f81489d7cdde2196e448b7b843a813d.jpeg","is_onsale":1},{"normal_price":3280,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/3ba4f2f8b4fd20a745da50302756232b.jpeg","event_type":0,"sales":1640,"goods_id":43876075,"short_name":"【买一赠12限量抢】全10册班主任推荐开学课外必读 爸妈不是我的佣人 学习可以很快乐 少年成长读物 2017最新版","quantity":8354,"logo":"","is_app":0,"price":1980,"market_price":10800,"goods_name":"【买一赠12限量抢】全10册班主任推荐开学课外必读 爸妈不是我的佣人 学习可以很快乐 少年成长读物 2017最新版","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/bceb4065cb2ff05ff89bfccd2e293110.jpeg","customer_num":2,"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/269b7e4086b61f99a73502cef90cafdd.jpeg","is_onsale":1},{"normal_price":2080,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/pjcD2orM9mh7U1Qjq4hNuerUDi1wwWz8.jpg","event_type":0,"sales":930,"goods_id":40074465,"short_name":"【优惠价17.8/10本/件 抢1000件】黄冈作文小学生3-4-6年级满分作文书四五六年级日记起步小学作文优秀作文素材","quantity":397,"logo":"","is_app":0,"price":1780,"market_price":2980,"goods_name":"【优惠价17.8/10本/件 抢1000件】黄冈作文小学生3-4-6年级满分作文书四五六年级日记起步小学作文优秀作文素材","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/3zhTvZmNFLLtXx3iVsSbMiEX814FKFLQ.jpg","customer_num":2,"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/BpD6GEwdRtNO5Gtn3GNb3v1L4BJqzVGD.jpg","is_onsale":1},{"normal_price":1990,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-28/8c54f3a4d8da47f1dc8141fb42862f11.jpeg","event_type":0,"sales":31571,"goods_id":14175716,"short_name":"女人受用一生的口才课口才训练书籍 说话技巧的书 幽默口才青春励志畅销书排行榜沟通技巧说话的艺术 图书平装16开288页","quantity":5733,"logo":"","is_app":0,"price":1860,"market_price":3680,"goods_name":"女人受用一生的口才课口才训练书籍 说话技巧的书 幽默口才青春励志畅销书排行榜沟通技巧说话的艺术 图书平装16开288页","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-28/09e15d237904ad929361518af17b557b.jpeg","customer_num":2,"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-28/2031299ca6db2c38db092905e7ef50a4.jpeg","is_onsale":1},{"normal_price":2290,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-03-30/116d18b2c1fc96358ce4729df64250f2.jpeg","event_type":0,"sales":9929,"goods_id":1630581,"short_name":"40册儿童早教故事书宝宝睡前故事绘本0-3-6周岁注音版幼儿图书经典童话故事幼儿园绘本幼儿会说话的早教有声故事书宝宝书籍","quantity":30071,"logo":"","is_app":0,"price":1790,"market_price":20000,"goods_name":"40册儿童早教故事书宝宝睡前故事绘本0-3-6周岁注音版幼儿图书经典童话故事幼儿园绘本幼儿会说话的早教有声故事书宝宝书籍","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-03-30/1504abc86189d86a7233c52ff8e8c95b.jpeg","customer_num":2,"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-03-30/c5b352ebfda05db2d790acc622f22e9d.jpeg","is_onsale":1},{"normal_price":2280,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1608098740681475/EQ6Hb2Ymne4pCkhocJBBuGI8ZNgLVHrz.jpg","event_type":0,"sales":6942,"goods_id":389821,"short_name":"10册小学生作文大全/黄冈作文书3-6年级小学教辅书籍 三年级作文辅导书四五六年级满分作文小学生课外阅读书籍","quantity":9058,"logo":"","is_app":0,"price":1680,"market_price":10000,"goods_name":"10册小学生作文大全/黄冈作文书3-6年级小学教辅书籍 三年级作文辅导书四五六年级满分作文小学生课外阅读书籍","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1608098740681475/Swk3aKXY1UAAFGIAIhAnJRTtq9lBEuS2.jpg","customer_num":2,"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/850708/4LAx1hbUyZvTME914fDYhjYD84djkORQ.jpg","is_onsale":1}]
     * home_banner_width : 1000
     * goods_num : 58
     * sales : 393816
     * home_banner_height_2 : 375
     * position : 0
     * home_banner_height : 547
     * home_banner_2 : http://omsproductionimg.yangkeduo.com/images/goods/0/ZkqN6KQLPHsEYH3CXozsmnQhNltmDd54.jpg
     * rank_subject_priority : 5856
     * home_banner_width_2 : 1000
     * start_time : 1480608000
     * subject : 童心悦读绘本，书香润泽童年
     * home_banner : http://omsproductionimg.yangkeduo.com/images/goods/0/BRiOy4qT16ouKDzDCgui1YsN4EwVU1KD.jpg
     * column_num : 2
     * share_image :
     * desc : 童心悦读绘本，书香润泽童年
     * type : rank_recommend
     * subject_id : 985
     */

    public String second_name;
    public int home_banner_width;
    public int goods_num;
    public int sales;
    public int home_banner_height_2;
    public int position;
    public int home_banner_height;
    public String home_banner_2;
    public int rank_subject_priority;
    public int home_banner_width_2;
    public int start_time;
    public String subject;
    public String home_banner;
    public int column_num;
    public String share_image;
    public String desc;
    public String type;
    public int subject_id;
    public List<GoodsListBean> goods_list;

    public static JinBeanItem objectFromData(String str) {

        return new Gson().fromJson(str, JinBeanItem.class);
    }

    public static class GoodsListBean {
        /**
         * normal_price : 3080
         * thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-07-21/5346ed5fc35d51381b104e57baccf31a.jpeg
         * event_type : 0
         * sales : 5866
         * goods_id : 37140
         * short_name : 【教育部推荐书目】8册青少年儿童版名著系列鲁滨逊漂流记 假如给我三天光明 钢铁是怎样炼成的小王子世界文学名著小说
         * quantity : 2586
         * logo :
         * is_app : 0
         * price : 2190
         * market_price : 12500
         * goods_name : 【教育部推荐书目】8册青少年儿童版名著系列鲁滨逊漂流记 假如给我三天光明 钢铁是怎样炼成的小王子世界文学名著小说
         * hd_thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-07-21/5aeaeb5d350359bd38d0c210c2848b64.jpeg
         * customer_num : 2
         * country :
         * image_url : http://omsproductionimg.yangkeduo.com/images/2017-07-21/05fabd14e4d3bf22352e7fb92ea59811.jpeg
         * is_onsale : 1
         */

        public int normal_price;
        public String thumb_url;
        public int event_type;
        public int sales;
        public int goods_id;
        public String short_name;
        public int quantity;
        public String logo;
        public int is_app;
        public int price;
        public int market_price;
        public String goods_name;
        public String hd_thumb_url;
        public int customer_num;
        public String country;
        public String image_url;
        public int is_onsale;

        public static GoodsListBean objectFromData(String str) {

            return new Gson().fromJson(str, GoodsListBean.class);
        }
    }
}
