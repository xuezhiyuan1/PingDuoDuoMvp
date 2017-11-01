package com.jo.jingou.view.fragment;

import android.annotation.SuppressLint;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.jo.jingou.R;
import com.jo.jingou.adpater.HaiTaoAdapter;
import com.jo.jingou.count.SnapUpCountDownTimerView;
import com.jo.jingou.model.bean.HaiTaoBean;
import com.jo.jingou.presenter.ConfigPresenterImpl;
import com.jo.jingou.view.ConfigViewInterface;
import com.liaoinstan.springview.container.MeituanFooter;
import com.liaoinstan.springview.container.MeituanHeader;
import com.liaoinstan.springview.widget.SpringView;
import com.loonggg.bottomsheetpopupdialoglib.ShareBottomPopupDialog;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class TaoBaoFragment extends BaseFragment implements View.OnClickListener, ConfigViewInterface<HaiTaoBean> {
    @BindView(R.id.RushBuyCountDownTimerView)
    SnapUpCountDownTimerView snapUpCountDownTimerView;
    //TODO 配置控件
    @BindView(R.id.imageLogin)
    ImageView iamgeLogin;
    @BindView(R.id.all_layout)
    LinearLayout all_layouts;
    @BindView(R.id.spring)
    SpringView springView;
    //    @BindView(R.id.li_group)
//    LinearLayout T_activity;
//    @BindView(R.id.jin_group)
//    LinearLayout J_activity;
    private List<HaiTaoBean.GoodsListBeanX> list = new ArrayList<>();
    private List<HaiTaoBean.HomeRecommendSubjectsBean> subList = new ArrayList<>();
    //TODO 配置下拉刷效果
    private int[] pullAnimSrcs = new int[]{R.drawable.sku_loding, R.drawable.ic_loading, R.drawable.ic_chat_image_loading};
    private int[] refreshAnimSrcs = new int[]{R.drawable.b1, R.drawable.c1, R.drawable.e1, R.drawable.f1, R.drawable.h1, R.drawable.i1, R.drawable.k1, R.drawable.l1};
    private int[] loadingAnimSrcs = new int[]{R.drawable.mt_loading01, R.drawable.mt_loading02};
    //TODO 接口回调
    private ConfigPresenterImpl configPresenter;
    //TODO  RecyclerView
    @BindView(R.id.re_view)
    RecyclerView recyclerview;
    private static volatile TaoBaoFragment intance = null;

    @SuppressLint("ValidFragment")
    private TaoBaoFragment() {
    }

    @Override
    public void initListener() {
    }

    @Override
    public void initView() {
        ButterKnife.bind(getActivity());
        snapUpCountDownTimerView.setTime(1, 55, 3);
        snapUpCountDownTimerView.start();
        //TODO 弹框
        iamgeLogin.setOnClickListener(this);
//        T_activity.setOnClickListener(this);
//        J_activity.setOnClickListener(this);
        //TODO 下拉刷新
        iniSpring();
        initData();
    }

    private void initData() {
        configPresenter = new ConfigPresenterImpl(this);
        configPresenter.loadHaiTao();
    }

    @Override
    public int getLayoutID() {
        return R.layout.taobao;
    }

    public static TaoBaoFragment getIntance() {
        if (intance == null) {
            synchronized (TaoBaoFragment.class) {
                if (intance == null) {
                    intance = new TaoBaoFragment();
                }
            }
        }
        return intance;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageLogin:
                INit();
                break;
            case R.id.li_group:
                //TODO 跳转到邻里
                break;
            case R.id.jin_group:
                //TODO 跳转到精选
                break;
            default:
                break;
        }
    }

    //TODO 底部弹框
    public void INit() {
        View dialogView = LayoutInflater.from(getActivity()).inflate(R.layout.share_bottom_dialog, null);
        final ShareBottomPopupDialog shareBottomPopupDialog = new ShareBottomPopupDialog(getActivity(), dialogView);
        shareBottomPopupDialog.showPopup(all_layouts);
        ImageButton share_qq_btn = (ImageButton) dialogView.findViewById(R.id.share_qq_btn);
        share_qq_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareBottomPopupDialog.dismiss();
            }
        });
        ImageButton share_weixin_btn = (ImageButton) dialogView.findViewById(R.id.share_weixin_btn);
        share_weixin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareBottomPopupDialog.dismiss();
            }
        });
        ImageButton share_to_weibo = (ImageButton) dialogView.findViewById(R.id.share_to_weibo);
        share_to_weibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareBottomPopupDialog.dismiss();
            }
        });
        ImageButton share_to_qq_zone_btn = (ImageButton) dialogView.findViewById(R.id.share_to_qq_zone_btn);
        share_to_qq_zone_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareBottomPopupDialog.dismiss();
            }
        });
        Button share_pop_cancle_btn = (Button) dialogView.findViewById(R.id.share_pop_cancle_btn);
        share_pop_cancle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareBottomPopupDialog.dismiss();
            }
        });
    }

    //TODO 下拉样式
    public void iniSpring() {
        springView.setType(SpringView.Type.FOLLOW);
        springView.setListener(new SpringView.OnFreshListener() {
            @Override
            public void onRefresh() {
                springView.onFinishFreshAndLoad();
            }

            @Override
            public void onLoadmore() {
                springView.onFinishFreshAndLoad();
            }
        });
        springView.setHeader(new MeituanHeader(getActivity(), pullAnimSrcs, refreshAnimSrcs));
        springView.setFooter(new MeituanFooter(getActivity(), loadingAnimSrcs));

    }

    @Override
    public void showOrHideProgress(boolean flag) {

    }

    @Override
    public void showOrHideErrorView(boolean flag) {

    }

    @Override
    public void refreshView(HaiTaoBean haiTaoBean) {
        list.addAll(haiTaoBean.goods_list);
        subList.addAll(haiTaoBean.home_recommend_subjects);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(linearLayoutManager);
        if (list != null && list.size() > 0 && subList != null && subList.size() > 0){
            HaiTaoAdapter adapter = new HaiTaoAdapter(getActivity(),list,subList);
            recyclerview.setAdapter(adapter);
        }
    }
}
