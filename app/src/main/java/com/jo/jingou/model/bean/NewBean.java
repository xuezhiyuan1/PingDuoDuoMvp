package com.jo.jingou.model.bean;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class NewBean {

    /**
     * ver : 1504698300001
     * goods_list : [{"normal_price":58800,"cnt":86,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-04/097aa690a4985f5a7611204e8197120c.jpeg","event_type":0,"market_price":268800,"region_limit":1,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-04/6626c932f831014c2fd9613379e91e45.jpeg","goods_name":"2017新款12寸华硕八核平板电脑 全网通 128G机身内存 6G运行 WIFI上网 4G双卡双待通话 送蓝牙通话耳机","country":"","goods_id":50960118,"short_name":"2017新款12寸华硕八核平板电脑 全网通 128G机身内存 6G运行 WIFI上网 4G双卡双待通话 送蓝牙通话耳机","group":{"customer_num":2,"price":56800},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,30,31,32","time":1504678850,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-04/f2680d2b672648be19bf5522bd3fd7c2.jpeg","is_app":0},{"normal_price":3590,"cnt":12,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-30/ed8bab6e7d96a95f5c15ed96a8690ea4.jpeg","event_type":0,"market_price":4500,"region_limit":0,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-25/920a74b308f539e09767d85b756f6b0c.jpeg","goods_name":"【棉花内胆 手工制作】婴儿手工棉花棉服罩衣防水羽绒服面料秋冬季新生儿棉衣衣服儿童外套男宝宝冬装加厚棉袄女","country":"","goods_id":63751828,"short_name":"【棉花内胆 手工制作】婴儿手工棉花棉服罩衣防水羽绒服面料秋冬季新生儿棉衣衣服儿童外套男宝宝冬装加厚棉袄女","group":{"customer_num":2,"price":3390},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1504675338,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-30/dfecfbe99aff36b4b508735ab23679d8.jpeg","is_app":0},{"normal_price":1100,"cnt":3803,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-21/557cbfd6830c51cb9755515491180933.jpeg","event_type":0,"market_price":3000,"region_limit":1,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-09/d18c543de3b229e9b2dfaf493f30e864.jpeg","goods_name":"无蔗糖木糖醇粗粮饼干 500克等多规格可选 早餐 下午茶 休闲零食","country":"","goods_id":7836698,"short_name":"无蔗糖木糖醇粗粮饼干 500克等多规格可选 早餐 下午茶 休闲零食","group":{"customer_num":2,"price":890},"allowed_region":"2,3,10,11,12,13,14,15,16,17,18,22,23,25,31,32","time":1504693229,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-21/960fa450f802cab3731872e02630e734.jpeg","is_app":0},{"normal_price":3500,"cnt":28,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/8a3a1024df231c1e3d2ccf90a7ce7297.jpeg","event_type":0,"market_price":39900,"region_limit":0,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-27/c3150391f3d15ce5c19da63ec5527d00.jpeg","goods_name":"妈妈装秋装长袖连衣裙2017时尚中老年妈妈装秋季新品花色亮片中长款连衣裙聚酯纤维面料穿着舒适圆领长袖针织衫【全国包邮】","country":"","goods_id":65490156,"short_name":"妈妈装秋装长袖连衣裙2017时尚中老年妈妈装秋季新品花色亮片中长款连衣裙聚酯纤维面料穿着舒适圆领长袖针织衫【全国包邮】","group":{"customer_num":2,"price":2990},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1504693301,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/22ea56dd20aa95624ca74e68f51146c0.jpeg","is_app":0},{"normal_price":2600,"cnt":0,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/4f96273981e989a462f6d96c072f228c.jpeg","event_type":0,"market_price":36800,"region_limit":0,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/aace0a322e3f20cdf16b80e1f1f2203b.jpeg","goods_name":"【送试用装】【夏日拒绝油腻】【两瓶装400mlx2】笛梵毛囊净化強根洗发水洗发乳+蜗牛原液补水修护发膜护发素笛梵洗护套装","country":"","goods_id":70226791,"short_name":"【送试用装】【夏日拒绝油腻】【两瓶装400mlx2】笛梵毛囊净化強根洗发水洗发乳+蜗牛原液补水修护发膜护发素笛梵洗护套装","group":{"customer_num":2,"price":2500},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1504689715,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/96774b65c7a3927a784f1e8da06ce758.jpeg","is_app":0},{"normal_price":4300,"cnt":2490,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-18/a46a30e9eeb8a36db52555855c6bf274.jpeg","event_type":0,"market_price":8900,"region_limit":1,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-18/e8ad080af42af675b0b10110c0a77ed1.jpeg","goods_name":"【源于古方 当天缩紧】私处紧致阴道紧缩产后松弛修复缩阴恢复护理养阴收阴私密处粉嫩美白洗液产品","country":"","goods_id":55197488,"short_name":"【源于古方 当天缩紧】私处紧致阴道紧缩产后松弛修复缩阴恢复护理养阴收阴私密处粉嫩美白洗液产品","group":{"customer_num":2,"price":4200},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22,23,25,26,27,31,32,21,30,24,28,29","time":1504326245,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-18/1d77cd6ccccce84065f640e6de160595.jpeg","is_app":0},{"normal_price":3500,"cnt":0,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/d175c73ccdc0ec38396528523f92ec11.jpeg","event_type":0,"market_price":3800,"region_limit":1,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/a457d001e9d00e78e616c438747cae64.jpeg","goods_name":"日式可爱学生分格塑料餐盒饭盒日本儿童卡通便当盒可微波炉餐盒","country":"","goods_id":73260539,"short_name":"日式可爱学生分格塑料餐盒饭盒日本儿童卡通便当盒可微波炉餐盒","group":{"customer_num":2,"price":2500},"allowed_region":"2,3,4,6,7,8,10,11,12,13,14,15,16,17,18,22,23,24,25,26,27,30,31,32","time":1504686032,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/764a99ece35c7b3ce2aa5336d8358fab.jpeg","is_app":0},{"normal_price":4690,"cnt":0,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/6166ba6b76a63b725324d37549d70e78.jpeg","event_type":0,"market_price":9390,"region_limit":0,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/76faed76eee65109410d646e4894e41d.jpeg","goods_name":"童装春装2017新款女童衬衫7宝宝白色衬衣春秋儿童长袖1-3-4-5-6岁","country":"","goods_id":73177732,"short_name":"童装春装2017新款女童衬衫7宝宝白色衬衣春秋儿童长袖1-3-4-5-6岁","group":{"customer_num":2,"price":4390},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1504689636,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/8ac7b6b733a29731acf1bf691ad859b0.jpeg","is_app":0},{"normal_price":6900,"cnt":4145,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/ff894bc7af22a43585c0bebb3199b952.jpeg","event_type":0,"market_price":7900,"region_limit":1,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/2dc4b9db699f09312c0b621d4f5aa07d.jpeg","goods_name":"【亏本促销】【升级款洗涤瓶放水口】加强杆+3个拖把头+钢篮+钢盘旋转拖把双驱动甩干拖布自动免手洗拖把桶拖地家用墩布好神拖","country":"","goods_id":68760372,"short_name":"【亏本促销】【升级款洗涤瓶放水口】加强杆+3个拖把头+钢篮+钢盘旋转拖把双驱动甩干拖布自动免手洗拖把桶拖地家用墩布好神拖","group":{"customer_num":2,"price":2990},"allowed_region":"2,3,5,6,7,9,10,11,12,13,14,15,16,17,18,19,20,22,23,24,25,26,30,31,32,4,27","time":1504333259,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/b2d4a631d74efbc0793fd8ad2fda1101.jpeg","is_app":0},{"normal_price":3500,"cnt":117,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-21/e29dd7f03c60fa234f024d8e2750e616.jpeg","event_type":0,"market_price":9900,"region_limit":0,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-21/b61f0b94cc9c59632172410f3bfc54d0.jpeg","goods_name":"2017秋装新款韩版简约修身弹力中袖针织衫圆领套头纯色女士打底衫   均码","country":"","goods_id":59971013,"short_name":"2017秋装新款韩版简约修身弹力中袖针织衫圆领套头纯色女士打底衫   均码","group":{"customer_num":2,"price":2980},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1504678925,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-21/99265d824e88f57f1061e62814d381c5.jpeg","is_app":0},{"normal_price":1580,"cnt":11615,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/37951112a03c6c8985871d73d83a341f.jpeg","event_type":0,"market_price":8800,"region_limit":0,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/0b8396f870d851af29468feeefc4b79e.jpeg","goods_name":"【i-ears耳朵清洁器】耳勺软头成人儿童电动吸耳屎电动掏耳器挖耳勺洁耳器采耳挖耳掏耳神器安全震动","country":"","goods_id":69038394,"short_name":"【i-ears耳朵清洁器】耳勺软头成人儿童电动吸耳屎电动掏耳器挖耳勺洁耳器采耳挖耳掏耳神器安全震动","group":{"customer_num":2,"price":1280},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1504228924,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/0cb8659895ca54243205e072a85f4001.jpeg","is_app":0},{"normal_price":6500,"cnt":2505,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/1be3aedbdd1b5ce2347f74e6624314c7.jpeg","event_type":0,"market_price":19800,"region_limit":0,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/572429c3b5fad11070e008c2941bd79d.jpeg","goods_name":"【秋冬保暖衬衣】大码秋冬新款长袖格子衬衣女士加厚保暖打底衫中长款休闲外套","country":"","goods_id":70056141,"short_name":"【秋冬保暖衬衣】大码秋冬新款长袖格子衬衣女士加厚保暖打底衫中长款休闲外套","group":{"customer_num":2,"price":4990},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1504336861,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/b8052727602fc956928b3bfd936c6ec3.jpeg","is_app":0},{"normal_price":3290,"cnt":70,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/3fa22e16ed3ad3eb4ae1d72801079fdc.jpeg","event_type":0,"market_price":12800,"region_limit":1,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/29ee37224ea3677954043a24c021ba72.jpeg","goods_name":"【柔软舒适、环保无味、活动送礼】客厅拼接泡沫地板垫儿童房间宝宝爬行茶几地毯卧室装饰床边脚垫满铺客厅地垫大号60cm*6片","country":"","goods_id":66947061,"short_name":"【柔软舒适、环保无味、活动送礼】客厅拼接泡沫地板垫儿童房间宝宝爬行茶几地毯卧室装饰床边脚垫满铺客厅地垫大号60cm*6片","group":{"customer_num":2,"price":3190},"allowed_region":"2,3,4,5,6,7,8,9,10,11,13,14,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1504678816,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/0745b280936a98ded4b1c98f07884723.jpeg","is_app":0},{"normal_price":3900,"cnt":0,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/8f855348d852888d0c75ed8cce0bc1c6.jpeg","event_type":0,"market_price":4500,"region_limit":0,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/74746a67d2279b1ef0780458e8d08259.jpeg","goods_name":"儿童牛仔大PP裤16韩版秋款男女童黑色垮裤哈伦裤宝宝收脚长裤子潮","country":"","goods_id":73168026,"short_name":"儿童牛仔大PP裤16韩版秋款男女童黑色垮裤哈伦裤宝宝收脚长裤子潮","group":{"customer_num":2,"price":3590},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1504678823,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/244f8c7535511e70187a6a34fd768552.jpeg","is_app":0},{"normal_price":4500,"cnt":0,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-10/769e9a704a3483ea395ad1dd76d75da3.jpeg","event_type":0,"market_price":19900,"region_limit":0,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-10/8e59400d08ff73966b9251e41486abf5.jpeg","goods_name":"夏季新款 运动短裤女 翘臀可爱防走光跑步休闲时尚健身瑜伽透气宽松大码马拉松裤","country":"","goods_id":52909099,"short_name":"夏季新款 运动短裤女 翘臀可爱防走光跑步休闲时尚健身瑜伽透气宽松大码马拉松裤","group":{"customer_num":2,"price":3900},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1504689614,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-10/50993f2351b6c329c890ef8bb62f1ad0.jpeg","is_app":0},{"normal_price":1300,"cnt":5126,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/a4fe77893a148ee975645d28eab5e0ab.jpeg","event_type":0,"market_price":4100,"region_limit":0,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-25/51e72ba8e46f042883095b9c56444094.jpeg","goods_name":"【快抢两盆装 赠营养液 托盘 挂钩】55株绿萝盆栽  大叶绿箩 室内吸除甲醛 花卉植物 吊兰水培绿植苗","country":"","goods_id":63680617,"short_name":"【快抢两盆装 赠营养液 托盘 挂钩】55株绿萝盆栽  大叶绿箩 室内吸除甲醛 花卉植物 吊兰水培绿植苗","group":{"customer_num":2,"price":980},"allowed_region":"2,3,4,6,7,8,9,10,11,12,13,14,15,16,17,18,22,23,24,25,26,27,30,31,32,5,19,20,21,28,29","time":1504412473,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/163365a9ce1ce40c7aac0c9f23741144.jpeg","is_app":0},{"normal_price":5100,"cnt":0,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/fd435c42e9cd84b5af72a04794e34684.jpeg","event_type":0,"market_price":16800,"region_limit":0,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/0a989e9547dd56f061e6cb775f131a82.jpeg","goods_name":"【送硅胶粉扑】正品传澄恒温袜光发热超弹力打底裤女胖妹妹可穿2017秋冬高腰显瘦收腹保暖裤传承恒温袜这个冬天不太冷 均码","country":"","goods_id":73304142,"short_name":"【送硅胶粉扑】正品传澄恒温袜光发热超弹力打底裤女胖妹妹可穿2017秋冬高腰显瘦收腹保暖裤传承恒温袜这个冬天不太冷 均码","group":{"customer_num":2,"price":5000},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1504693284,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/88a43202115e7f9bbdc97ce26358b42c.jpeg","is_app":0},{"normal_price":1590,"cnt":2,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/a895e075628897f6aec48cbfec89d0ae.jpeg","event_type":0,"market_price":3990,"region_limit":1,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/015e29d1dbc8dc49df588cbe51be2768.jpeg","goods_name":"【10枚蟑螂屋+送10包蟑螂药粉】蟑螂捕捉器灭蟑螂贴粉除杀蟑螂药贴粘板胶饵家用全窝端环保无毒蟑螂饵灭蟑螂药蟑螂屋进口神器","country":"","goods_id":73331649,"short_name":"【10枚蟑螂屋+送10包蟑螂药粉】蟑螂捕捉器灭蟑螂贴粉除杀蟑螂药贴粘板胶饵家用全窝端环保无毒蟑螂饵灭蟑螂药蟑螂屋进口神器","group":{"customer_num":2,"price":1390},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,28,29,30,31,32","time":1504693254,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/990db189f8ba303a21ae294e6ec7bed8.jpeg","is_app":0},{"normal_price":5500,"cnt":0,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/2f3e80d916421927c3d196492d6882e7.jpeg","event_type":0,"market_price":12800,"region_limit":0,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/51dedecf644a397464b5db5ad1f179ad.jpeg","goods_name":"欧洲站2017女秋装修身显瘦气质长袖新款女装连衣裙两件套时尚套装","country":"","goods_id":70535953,"short_name":"欧洲站2017女秋装修身显瘦气质长袖新款女装连衣裙两件套时尚套装","group":{"customer_num":2,"price":5200},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1504689697,"hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/6020bf4d9fc334b74a786baa0febe30e.jpeg","is_app":0}]
     * server_time : 1504698550
     */

    public long ver;
    public int server_time;
    public List<GoodsListBean> goods_list;

    public static NewBean objectFromData(String str) {

        return new Gson().fromJson(str, NewBean.class);
    }

    public static NewBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), NewBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static class GoodsListBean {
        /**
         * normal_price : 58800
         * cnt : 86
         * thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-08-04/097aa690a4985f5a7611204e8197120c.jpeg
         * event_type : 0
         * market_price : 268800
         * region_limit : 1
         * image_url : http://omsproductionimg.yangkeduo.com/images/2017-08-04/6626c932f831014c2fd9613379e91e45.jpeg
         * goods_name : 2017新款12寸华硕八核平板电脑 全网通 128G机身内存 6G运行 WIFI上网 4G双卡双待通话 送蓝牙通话耳机
         * country :
         * goods_id : 50960118
         * short_name : 2017新款12寸华硕八核平板电脑 全网通 128G机身内存 6G运行 WIFI上网 4G双卡双待通话 送蓝牙通话耳机
         * group : {"customer_num":2,"price":56800}
         * allowed_region : 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,30,31,32
         * time : 1504678850
         * hd_thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-08-04/f2680d2b672648be19bf5522bd3fd7c2.jpeg
         * is_app : 0
         */

        public int normal_price;
        public int cnt;
        public String thumb_url;
        public int event_type;
        public int market_price;
        public int region_limit;
        public String image_url;
        public String goods_name;
        public String country;
        public int goods_id;
        public String short_name;
        public GroupBean group;
        public String allowed_region;
        public int time;
        public String hd_thumb_url;
        public int is_app;

        public static GoodsListBean objectFromData(String str) {

            return new Gson().fromJson(str, GoodsListBean.class);
        }

        public static GoodsListBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), GoodsListBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static class GroupBean {
            /**
             * customer_num : 2
             * price : 56800
             */

            public int customer_num;
            public int price;

            public static GroupBean objectFromData(String str) {

                return new Gson().fromJson(str, GroupBean.class);
            }

            public static GroupBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), GroupBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }
        }
    }
}
