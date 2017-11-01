package com.jo.jingou.view.fragment;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.jo.jingou.R;
import com.jo.jingou.adpater.NewRecyclerviewAdapter;
import com.jo.jingou.model.bean.NewBean;
import com.jo.jingou.presenter.ConfigPresenterImpl;
import com.jo.jingou.view.ConfigViewInterface;
import com.jo.jingou.view.newproduct.JinXuanActivity;
import com.jo.jingou.view.newproduct.LinniActivity;
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

public class NewProductFragment extends BaseFragment implements View.OnClickListener, ConfigViewInterface<NewBean> {
    private static volatile NewProductFragment intance = null;
    public NewProductFragment(){

    }
    //TODO 配置控件
    @BindView(R.id.imageLogin)
    ImageView iamgeLogin;
    @BindView(R.id.all_layout)
    RelativeLayout all_layouts;
    @BindView(R.id.spring)
    SpringView springView;
    @BindView(R.id.li_group)
    LinearLayout T_activity;
    @BindView(R.id.jin_group)
    LinearLayout J_activity;
    //TODO 配置下拉刷效果
    private int[] pullAnimSrcs = new int[]{R.drawable.sku_loding, R.drawable.ic_loading, R.drawable.ic_chat_image_loading};
    private int[] refreshAnimSrcs = new int[]{R.drawable.b1, R.drawable.c1, R.drawable.e1, R.drawable.f1, R.drawable.h1, R.drawable.i1, R.drawable.k1, R.drawable.l1};
    private int[] loadingAnimSrcs = new int[]{R.drawable.mt_loading01, R.drawable.mt_loading02};
    //TODO 接口回调
    private ConfigPresenterImpl configPresenter;
    //TODO  RecyclerView
    @BindView(R.id.re_view)
    RecyclerView recyclerview;
    //TODO   Adpater
    private NewRecyclerviewAdapter adapter;
    //TODO 集合
    private List<NewBean.GoodsListBean> list = new ArrayList<>();
    //TODO 展示
    private GridLayoutManager manager;
    private int page = 1;

    @Override
    public void initListener() {
    }

    @Override
    public void initView() {
        ButterKnife.bind(getActivity());
        //TODO 弹框
        iamgeLogin.setOnClickListener(this);
        T_activity.setOnClickListener(this);
        J_activity.setOnClickListener(this);
        //TODO 下拉刷新
        iniSpring();
        //TODO 数据加载
        initData();
    }


    @Override
    public int getLayoutID() {
        return R.layout.newproduct;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageLogin:
                INit();
                break;
            case R.id.li_group:
                //TODO 跳转到邻里
                startActivity(new Intent(getActivity(), LinniActivity.class));
                break;
            case R.id.jin_group:
                //TODO 跳转到精选
                startActivity(new Intent(getActivity(), JinXuanActivity.class));
                break;
            default:
                break;
        }
    }

    private void initData() {
        configPresenter = new ConfigPresenterImpl(this);
        configPresenter.loadData("newlist?size=20&ver=1504437600014&pdduid=&page=" + page);
        manager = new GridLayoutManager(getActivity(), 2);
        recyclerview.setLayoutManager(manager);
        adapter = new NewRecyclerviewAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);

    }

    @Override
    public void showOrHideProgress(boolean flag) {

    }

    @Override
    public void showOrHideErrorView(boolean flag) {

    }

    @Override
    public void refreshView(NewBean configResponse) {
        if (configResponse != null) {
            list.clear();
            list.addAll(configResponse.goods_list);
            adapter.notifyDataSetChanged();
        }
    }

    public static NewProductFragment getIntance() {
        if (intance == null) {
            synchronized (NewProductFragment.class) {
                if (intance == null) {
                    intance = new NewProductFragment();
                }
            }
        }
        return intance;
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
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onLoadmore() {
                springView.onFinishFreshAndLoad();
                page++;
                configPresenter.loadData("newlist?size=20&ver=1504437600014&pdduid=&page=" + page);
                adapter.notifyDataSetChanged();
            }
        });
        springView.setHeader(new MeituanHeader(getActivity(), pullAnimSrcs, refreshAnimSrcs));
        springView.setFooter(new MeituanFooter(getActivity(), loadingAnimSrcs));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        configPresenter.detachView();
    }
}
