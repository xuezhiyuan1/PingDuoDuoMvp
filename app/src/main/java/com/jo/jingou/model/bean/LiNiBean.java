package com.jo.jingou.model.bean;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class LiNiBean implements Serializable {

    /**
     * goods_list : [{"normal_price":9990,"cnt":722574,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-05/b2b264228a8ca81cabbb8d24259a7416.jpeg","event_type":0,"market_price":10000,"goods_name":"【闪电直充】100元全国移动联通电信话费充值","goods_id":6319711,"short_name":"【闪电直充】100元全国移动联通电信话费充值","group":{"customer_num":2,"price":9950},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-05/0be85f8053a819c24554f0580d7df6ef.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-05/cfb7df2b09db6956d42bc4139accee99.jpeg","is_app":0},{"normal_price":5000,"cnt":64338,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/fecc615c2a9dd6f574672af71ca195f5.jpeg","event_type":0,"market_price":26800,"goods_name":"【即将涨价！】三防电霸老人机【威信qq收音机手电筒双卡双待】移动联通军工三防路虎老人手机","goods_id":11848491,"short_name":"【即将涨价！】三防电霸老人机【威信qq收音机手电筒双卡双待】移动联通军工三防路虎老人手机","group":{"customer_num":2,"price":4500},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-13/30457260a4958010c44638850b975d3a.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/c398bd6aa1761988735724cf0b8bfa3b.jpeg","is_app":0},{"normal_price":3900,"cnt":162204,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/b56486ace70005dd3f5af44c409d2a44.jpeg","event_type":0,"market_price":16800,"goods_name":"韩版百搭情侣运动鞋女厚底休闲鞋透气网纱系带跑步旅游男鞋","goods_id":56284855,"short_name":"韩版百搭情侣运动鞋女厚底休闲鞋透气网纱系带跑步旅游男鞋","group":{"customer_num":2,"price":1690},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-16/07a7088ad548b1733df6fde7e6d0f557.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/add6a958293312007d4fdfabbbdd5963.jpeg","is_app":0},{"normal_price":6900,"cnt":2017592,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/e0309e800cad807db3531ee77446c977.jpeg","event_type":0,"market_price":18800,"goods_name":"百纯萃健淫羊藿软胶囊60粒【男人补肾固精 提升战斗力圣品】不硬？你试试！！【买2瓶减2元】【3瓶一周期】","goods_id":1383800,"short_name":"百纯萃健淫羊藿软胶囊60粒【男人补肾固精 提升战斗力圣品】不硬？你试试！！【买2瓶减2元】【3瓶一周期】","group":{"customer_num":2,"price":2480},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-05/9b26237809e567ba71e9aa77fe320969.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/4e646a56c4bdd3db7d84ded8168d699a.jpeg","is_app":0},{"normal_price":1500,"cnt":1218745,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/cf23313b42abb89304986ab7b5f7b1e7.jpeg","event_type":0,"market_price":3630,"goods_name":"【30包20包10包】香约金装系列3层100抽300张/包原木抽纸面巾纸纸巾孕婴可用软抽餐巾纸卫生纸整箱包邮","goods_id":12426890,"short_name":"【30包20包10包】香约金装系列3层100抽300张/包原木抽纸面巾纸纸巾孕婴可用软抽餐巾纸卫生纸整箱包邮","group":{"customer_num":2,"price":1190},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-30/c99bc13f58e352859301dda121906367.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/2974ccf6243aae7f39c1904e03e80f72.jpeg","is_app":0},{"normal_price":3500,"cnt":1502107,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-04-07/6d63d9ee8dde0a1eb5c49e7cacff795e.jpeg","event_type":0,"market_price":9900,"goods_name":"【足足10斤】语衣甘蓝熏衣草香氛洗衣液2瓶装+2袋/1瓶+3袋装 护衣亮色 低泡易漂【无荧光剂 纯天然】","goods_id":2143014,"short_name":"【足足10斤】语衣甘蓝熏衣草香氛洗衣液2瓶装+2袋/1瓶+3袋装 护衣亮色 低泡易漂【无荧光剂 纯天然】","group":{"customer_num":2,"price":1690},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-04-07/fe32a2ce2f61d7ac114d08f247c706ea.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-27/4bd17ae6c7152258e585a5ced4de8526.jpeg","is_app":0},{"normal_price":12900,"cnt":9979,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-23/a173011212d61e972c2556fb154f2b93.jpeg","event_type":0,"market_price":29800,"goods_name":"中年女装春秋装女外套潮中老年女装妈妈装40-50岁30时尚休闲大码女装中长款风衣外套上衣连帽卫衣女春秋中老年女装外套衣服","goods_id":62497814,"short_name":"中年女装春秋装女外套潮中老年女装妈妈装40-50岁30时尚休闲大码女装中长款风衣外套上衣连帽卫衣女春秋中老年女装外套衣服","group":{"customer_num":2,"price":7500},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/01e3bbbd7fa1fb0df5ece8ad1046d6d1.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-23/9457430a1eb44df23b812d55cd14d5c1.jpeg","is_app":0},{"normal_price":950,"cnt":59322,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/ac785a8fe43de98238975710e3b1fdcc.jpeg","event_type":0,"market_price":9800,"goods_name":"【北极绒家纺】单件床单斜纹简约加厚亲肤磨毛床单四季通用多规格","goods_id":70076688,"short_name":"【北极绒家纺】单件床单斜纹简约加厚亲肤磨毛床单四季通用多规格","group":{"customer_num":2,"price":650},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/7125010c743f46022b5fcb43c3930068.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/229aa8203daf3dc12f8f653e81838f5c.jpeg","is_app":0},{"normal_price":5900,"cnt":8921,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/f128a211cf93afe75d41bb76dde531d0.jpeg","event_type":0,"market_price":19900,"goods_name":"【百搭2件一套 超级划算】【衣服+裤子】秋冬季卫衣运动套装男青少年印花立领外套韩版修身大码休闲男潮","goods_id":67154416,"short_name":"【百搭2件一套 超级划算】【衣服+裤子】秋冬季卫衣运动套装男青少年印花立领外套韩版修身大码休闲男潮","group":{"customer_num":2,"price":4290},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/bff889f829be01367c820dc9aefdba26.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/19437414b4cf0deba3fd0f05260adbd4.jpeg","is_app":0},{"normal_price":5800,"cnt":155386,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-03/58e569b7477111bb1cc9cfb6b93fbd41.jpeg","event_type":0,"market_price":29900,"goods_name":"蓝牙成人智能手机手表 独立插卡打电话手表手机 苹果安卓触屏拍照手表 男女学生儿童智能手表新款手环生活防水定位防丢","goods_id":2089057,"short_name":"蓝牙成人智能手机手表 独立插卡打电话手表手机 苹果安卓触屏拍照手表 男女学生儿童智能手表新款手环生活防水定位防丢","group":{"customer_num":2,"price":3900},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-20/a2d5a7577ae6e60869fd67c54292dd38.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-28/e5deac2abfe68e721d05389fe6077d80.jpeg","is_app":0},{"normal_price":1090,"cnt":628912,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/f383c957c315176a485a9fa11607b771.jpeg","event_type":0,"market_price":8900,"goods_name":"猴头菇饼干 猴菇饼干500克、1000克送手提收纳箱猴菇饼干曲奇饼干养胃早餐办公室下午茶","goods_id":9998928,"short_name":"猴头菇饼干 猴菇饼干500克、1000克送手提收纳箱猴菇饼干曲奇饼干养胃早餐办公室下午茶","group":{"customer_num":2,"price":750},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/84fa50f5f851e863be4b10d6cf82cda1.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/16a352cd912d69bb09359e20308e50ae.jpeg","is_app":0},{"normal_price":2590,"cnt":558590,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-13/9e1929a0797ef8ee4efc11fd53feba5d.jpeg","event_type":0,"market_price":26989,"goods_name":"蒸锅不锈钢三层加厚汤锅火锅3层二2层多层蒸笼家用电磁炉锅具26cm/28cm/30cm","goods_id":1891682,"short_name":"蒸锅不锈钢三层加厚汤锅火锅3层二2层多层蒸笼家用电磁炉锅具26cm/28cm/30cm","group":{"customer_num":2,"price":1390},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-30/cfeb23a70f976c6dffb810fa4f0a814f.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-27/834906751f3077421cf4fc072f6dabe5.jpeg","is_app":0},{"normal_price":2500,"cnt":328409,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1610139483996502/Vsg6PZHAwPmDCufb0qFr2FNkTI2HkHl2.jpg","event_type":0,"market_price":2800,"goods_name":"【整箱90根】金锣好口福火腿肠整箱22g*90根 整箱批发烧烤香肠休闲零食小吃 全国包邮","goods_id":852907,"short_name":"【整箱90根】金锣好口福火腿肠整箱22g*90根 整箱批发烧烤香肠休闲零食小吃 全国包邮","group":{"customer_num":2,"price":1690},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1610139483996502/7BA2ysN7qzhh4epcby1pYrJFJGyV9Unh.jpg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/50da0e7baa77845484403ec310a11258.jpeg","is_app":0},{"normal_price":9800,"cnt":31342,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/6a78bfa381f2dd97bdee93558dc175fa.jpeg","event_type":0,"market_price":69800,"goods_name":"花花公子贵宾【加绒加厚】【防风防雪】秋冬季加绒加厚男士运动休闲保暖棉衣棉服外套","goods_id":11639659,"short_name":"花花公子贵宾【加绒加厚】【防风防雪】秋冬季加绒加厚男士运动休闲保暖棉衣棉服外套","group":{"customer_num":2,"price":6990},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/daafa679e14eb2619ffab22f53fd1c81.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/2bda895bcb15c608c3619bff210b8b08.jpeg","is_app":0},{"normal_price":6500,"cnt":254097,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/6df2a3598db742464af7bc16db020ef7.jpeg","event_type":0,"market_price":18800,"goods_name":"【22万消费者的选择】非转基因物理压榨克里斯贝尔特级初榨橄榄调和油5L装 橄榄油【送洗碗擦】","goods_id":852914,"short_name":"【22万消费者的选择】非转基因物理压榨克里斯贝尔特级初榨橄榄调和油5L装 橄榄油【送洗碗擦】","group":{"customer_num":2,"price":4920},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1610187676721996/HDiCl2glj2Kh49p8D5YWWRrkAr81rhdm.jpg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/219a1899944c9425e64655bb7d0bde5c.jpeg","is_app":0},{"normal_price":12900,"cnt":71168,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-15/1f1733fa20d3311e0b4a776c80532047.jpeg","event_type":0,"market_price":15900,"goods_name":"【亏完涨价!】【买一送五】大容量智能充电宝20000毫安移动电源兼容安卓苹果小米oppo华为手机通用 液晶数字显示","goods_id":11318441,"short_name":"【亏完涨价!】【买一送五】大容量智能充电宝20000毫安移动电源兼容安卓苹果小米oppo华为手机通用 液晶数字显示","group":{"customer_num":2,"price":5990},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-24/0688c02860d60737a92b58f8539b7356.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-28/44793787f3f169fb204457cb312f55bd.jpeg","is_app":0},{"normal_price":7900,"cnt":55637,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-28/9dc4c5369a4be1690369025a987a8d1d.jpeg","event_type":0,"market_price":16900,"goods_name":"【花花公子VIP贵宾】【正品】2017春秋长袖男士T恤立领长袖棉T男装长袖打底衫休闲男士纯色上衣新款男士体恤衫","goods_id":15608803,"short_name":"【花花公子VIP贵宾】【正品】2017春秋长袖男士T恤立领长袖棉T男装长袖打底衫休闲男士纯色上衣新款男士体恤衫","group":{"customer_num":2,"price":2990},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/53030a17e9d26e1a28d5738e69dda7db.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-28/36443e0426a8a88ba2334a1495d6ae6c.jpeg","is_app":0},{"normal_price":3200,"cnt":496569,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-27/d2049a3a2dc723c870b576e9d9181839.jpeg","event_type":0,"market_price":10000,"goods_name":"【台湾进口】【买2盒送1盒】脂流茶减肥茶高效瘦身甩脂肪 月瘦20斤 七天平小腹 120g/盒","goods_id":10834259,"short_name":"【买2盒送1盒】脂流茶减肥茶高效瘦身甩脂肪 月瘦20斤 七天平小腹 120g/盒","group":{"customer_num":2,"price":2230},"country":"台湾","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-15/6b99086fd2e3552bfeb54d1a604ccfb4.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/0f148e00ae7f8442668f8cf30831216d.jpeg","is_app":0},{"normal_price":9900,"cnt":76491,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/7c8c941091c469d0b4af57925ac0d0f4.jpeg","event_type":0,"market_price":23900,"goods_name":"【花花公子贵宾正品】春秋装男士长袖T恤韩版修身圆领体恤青少年男装打底衫潮流学生秋衣","goods_id":20690282,"short_name":"【花花公子贵宾正品】春秋装男士长袖T恤韩版修身圆领体恤青少年男装打底衫潮流学生秋衣","group":{"customer_num":2,"price":2990},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-18/a5493c0f38dccfbbf144d1b6afd8878f.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/41672adeca2678880901a7263ab9d3aa.jpeg","is_app":0},{"normal_price":10900,"cnt":41207,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/8367d0f1f7a6d234870446e96c756dc7.jpeg","event_type":0,"market_price":39900,"goods_name":"【马上涨价】【美的旗舰店】 Midea 30cm电饼铛 双面悬浮加热 煎烤机 多功能JHN30F","goods_id":1855924,"short_name":"【马上涨价】【美的旗舰店】 Midea 30cm电饼铛 双面悬浮加热 煎烤机 多功能JHN30F","group":{"customer_num":2,"price":9800},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/4qYCyW7AUD4D0sqFDC3tLf3JQMOGjqG7.jpg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/079e4eb45633bababedd1011e98b8edb.jpeg","is_app":0},{"normal_price":5500,"cnt":16242,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/85b6d7abbfece6de8dc7f4586e4f076b.jpeg","event_type":0,"market_price":19800,"goods_name":"【南极人正品】女士加厚加大秋冬法兰绒睡衣可爱珊瑚绒睡衣","goods_id":70842204,"short_name":"【南极人正品】女士加厚加大秋冬法兰绒睡衣可爱珊瑚绒睡衣","group":{"customer_num":2,"price":3390},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/7a10a1a14dea415df54cb7f2d628c1ea.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/7cf2e24d0a43f7c00fe81d23dc910e9d.jpeg","is_app":0},{"normal_price":5500,"cnt":360363,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-27/6ed08f3038857fca5fe98fd9bd7d2164.jpeg","event_type":0,"market_price":49900,"goods_name":"【即将涨价！】【品康】电加热盐袋海盐粗盐热敷包天然大粒艾灸暖宫包理疗热敷袋盐包 定时温控","goods_id":2830663,"short_name":"【即将涨价！】【品康】电加热盐袋海盐粗盐热敷包天然大粒艾灸暖宫包理疗热敷袋盐包 定时温控","group":{"customer_num":2,"price":4290},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-04/43a34e5f395f668975e7a0814cad5ef0.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/a3610facaa6277bab2096d2a50a455dc.jpeg","is_app":0},{"normal_price":12900,"cnt":88407,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-28/eacc1b855bfadc5a6b4f6c20fbeca936.jpeg","event_type":0,"market_price":28900,"goods_name":"【花花公子贵宾正品】2017秋季新款男士夹克薄款春装男潮外套花夹克","goods_id":20473708,"short_name":"【花花公子贵宾正品】2017秋季新款男士夹克薄款春装男潮外套花夹克","group":{"customer_num":2,"price":4390},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-11/65b6d809e24299d76d7dc8ad3b9932a8.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-28/26e74a0c05dec9ac1122ff023d98ce1a.jpeg","is_app":0},{"normal_price":9900,"cnt":91308,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-09/d1b1ddbe2ae32c604b649e1027fbf532.jpeg","event_type":0,"market_price":18900,"goods_name":"【南极人】【颈椎理疗仪】智能颈椎按摩仪电磁理疗仪器电动颈椎治疗仪多功能颈部按摩器","goods_id":13396277,"short_name":"【南极人】【颈椎理疗仪】智能颈椎按摩仪电磁理疗仪器电动颈椎治疗仪多功能颈部按摩器","group":{"customer_num":2,"price":4900},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-23/12be299c0e6b78bdcf8f72f4f18bcaca.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/490190fdb1506f06a93924666b453e79.jpeg","is_app":0},{"normal_price":2990,"cnt":72913,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-26/f0b36cf6dd1828c3df85fd7cb370c613.jpeg","event_type":0,"market_price":12800,"goods_name":"【洋酒组合套餐】洋酒威士忌700ML+嘉仕华白兰地500ML两瓶组合、三瓶组合可选","goods_id":13473119,"short_name":"【洋酒组合套餐】洋酒威士忌700ML+嘉仕华白兰地500ML两瓶组合、三瓶组合可选","group":{"customer_num":2,"price":2700},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-26/2bcc73db4f939d756225c76845b1b350.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-26/3a59cfaa924ce9d472b52efde3e628a7.jpeg","is_app":0},{"normal_price":6990,"cnt":50571,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/cbc49a1c68784b0a67d4d9d40937ffb2.jpeg","event_type":0,"market_price":19900,"goods_name":"【北极绒正品】法兰绒套装家居服睡衣女秋冬加厚珊瑚绒秋冬长袖开衫圆领韩版可爱大码套装","goods_id":21449812,"short_name":"【北极绒正品】法兰绒套装家居服睡衣女秋冬加厚珊瑚绒秋冬长袖开衫圆领韩版可爱大码套装","group":{"customer_num":2,"price":3390},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-12/a12562e84d63f158adf2376fafd97a27.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/1c78572418f7899f772da171a56fb97a.jpeg","is_app":0},{"normal_price":2990,"cnt":27945,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/db4d18003ae740fc9acac615a678cc1b.jpeg","event_type":0,"market_price":4990,"goods_name":"【20款可选】【0-6岁】【精选纯棉】2017秋冬季儿童家居服两件套内衣套装婴儿宝宝宝宝秋衣秋裤中小童0-6岁","goods_id":63240467,"short_name":"【20款可选】【0-6岁】【精选纯棉】2017秋冬季儿童家居服两件套内衣套装婴儿宝宝宝宝秋衣秋裤中小童0-6岁","group":{"customer_num":2,"price":1490},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/78f700e395792e90eb5d67df2fe46ffd.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/57c80700ad4d09fe13a9972279de06dd.jpeg","is_app":0},{"normal_price":3390,"cnt":79233,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/57b1fc3733285524f379df5f371b13ba.jpeg","event_type":0,"market_price":18900,"goods_name":"【买5送5共10双】【北极绒正品】棉质吸汗防臭中筒男袜 男士抗菌防臭袜 四季款棉质运动袜男袜","goods_id":61396461,"short_name":"【买5送5共10双】【北极绒正品】棉质吸汗防臭中筒男袜 男士抗菌防臭袜 四季款棉质运动袜男袜","group":{"customer_num":2,"price":1450},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-22/a1c8396ac706da62c9b90989dc7e7c49.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/54de49dbe2bd97499eb3f2c77f3c3bc1.jpeg","is_app":0},{"normal_price":5800,"cnt":223541,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-14/ff89f50761b80eb1e7419139aa12d600.jpeg","event_type":0,"market_price":39800,"goods_name":"涌金盐袋粗盐热敷包电加热艾盐包海盐温灸暖宫包理疗热敷袋盐包","goods_id":2152517,"short_name":"涌金盐袋粗盐热敷包电加热艾盐包海盐温灸暖宫包理疗热敷袋盐包","group":{"customer_num":2,"price":4090},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-23/954baabf2f770030d7c6e63bdca60258.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-20/f956711932aa6a8b92848806e5bda417.jpeg","is_app":0},{"normal_price":4000,"cnt":99513,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-19/586771229a3f2555cb599df6320d5845.jpeg","event_type":0,"market_price":32800,"goods_name":"【何老师推荐】【开学必备】新款智能电话手表能打电话彩屏触摸屏微聊儿童电话手表定位防丢失","goods_id":58693903,"short_name":"【何老师推荐】【开学必备】新款智能电话手表能打电话彩屏触摸屏微聊儿童电话手表定位防丢失","group":{"customer_num":2,"price":3880},"country":"","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-19/7558123b68094fcd304f9d815c81097e.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-22/560497218a854708164cf8a78b1f2b3b.jpeg","is_app":0}]
     * server_time : 1504742312
     */

    public int server_time;
    public List<GoodsListBean> goods_list;

    public static LiNiBean objectFromData(String str) {

        return new Gson().fromJson(str, LiNiBean.class);
    }

    public static class GoodsListBean {
        /**
         * normal_price : 9990
         * cnt : 722574
         * thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-05-05/b2b264228a8ca81cabbb8d24259a7416.jpeg
         * event_type : 0
         * market_price : 10000
         * goods_name : 【闪电直充】100元全国移动联通电信话费充值
         * goods_id : 6319711
         * short_name : 【闪电直充】100元全国移动联通电信话费充值
         * group : {"customer_num":2,"price":9950}
         * country :
         * image_url : http://omsproductionimg.yangkeduo.com/images/2017-05-05/0be85f8053a819c24554f0580d7df6ef.jpeg
         * hd_thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-05-05/cfb7df2b09db6956d42bc4139accee99.jpeg
         * is_app : 0
         */

        public int normal_price;
        public int cnt;
        public String thumb_url;
        public int event_type;
        public int market_price;
        public String goods_name;
        public int goods_id;
        public String short_name;
        public GroupBean group;
        public String country;
        public String image_url;
        public String hd_thumb_url;
        public int is_app;

        public static GoodsListBean objectFromData(String str) {

            return new Gson().fromJson(str, GoodsListBean.class);
        }

        public static class GroupBean {
            /**
             * customer_num : 2
             * price : 9950
             */

            public int customer_num;
            public int price;

            public static GroupBean objectFromData(String str) {

                return new Gson().fromJson(str, GroupBean.class);
            }
        }
    }
}