package com.jo.jingou.view.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.jo.jingou.R;
import com.jo.jingou.adpater.LeftRecyclerView;
import com.jo.jingou.adpater.RecyclerViewRightAdpater;
import com.jo.jingou.model.bean.LeftBean;
import com.jo.jingou.presenter.ConfigPresenterImpl;
import com.jo.jingou.view.ConfigViewInterface;
import com.jo.jingou.view.newproduct.ShareBottomPopupDialog;
import com.jo.jingou.view.search.SqlActivity;
import com.liaoinstan.springview.container.MeituanFooter;
import com.liaoinstan.springview.container.MeituanHeader;
import com.liaoinstan.springview.widget.SpringView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class SearchFragment extends BaseFragment implements View.OnClickListener, ConfigViewInterface<ArrayList<LeftBean>> {
    private static volatile SearchFragment intance = null;
    //TODO 底部弹框
    @BindView(R.id.imageLogin)
    ImageView imagelogin;
    @BindView(R.id.search_li)
    LinearLayout search_li;
    @BindView(R.id.rela_login)
    RelativeLayout re_login;
    //TODO 接口回调
    private ConfigPresenterImpl configPresenter;
    @BindView(R.id.left_recy)
    RecyclerView leftRecycler;
    private LeftRecyclerView leftRecyclerView;
    private LinearLayoutManager manager;
    private LinearLayoutManager managers;
    private List<LeftBean> list;
    @BindView(R.id.rightspring)
    SpringView rightspring;
    @BindView(R.id.righ_clerview)
    RecyclerView rightre;
    private RecyclerViewRightAdpater adpaters;
    public int lastPosition = 0;
    //TODO 配置下拉刷效果
    private int[] pullAnimSrcs = new int[]{R.drawable.sku_loding, R.drawable.ic_loading, R.drawable.ic_chat_image_loading};
    private int[] refreshAnimSrcs = new int[]{R.drawable.b1, R.drawable.c1, R.drawable.e1, R.drawable.f1, R.drawable.h1, R.drawable.i1, R.drawable.k1, R.drawable.l1};
    private int[] loadingAnimSrcs = new int[]{R.drawable.mt_loading01, R.drawable.mt_loading02};

    @SuppressLint("ValidFragment")
    private SearchFragment() {
    }

    public static SearchFragment getIntance() {
        if (intance == null) {
            synchronized (SearchFragment.class) {
                if (intance == null) {
                    intance = new SearchFragment();
                }
            }
        }
        return intance;
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initView() {
        ButterKnife.bind(getActivity());
        imagelogin.setOnClickListener(this);
        re_login.setOnClickListener(this);
        initData();
    }

    @Override
    public int getLayoutID() {
        return R.layout.search;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageLogin:
                INit();
                break;
            case R.id.rela_login:
                startActivity(new Intent(getActivity(), SqlActivity.class));
                //跳转到搜索界面
                break;
            default:
                break;
        }
    }

    //TODO 底部弹框
    public void INit() {
        View dialogView = LayoutInflater.from(getActivity()).inflate(R.layout.share_bottom_dialog, null);
        final ShareBottomPopupDialog shareBottomPopupDialog = new ShareBottomPopupDialog(getActivity(), dialogView);
        shareBottomPopupDialog.showPopup(search_li);
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

    public void initData() {
        list = new ArrayList<>();
        configPresenter = new ConfigPresenterImpl(this);
        configPresenter.loadDatas("operations?pdduid=");
        manager = new LinearLayoutManager(getActivity());
        leftRecycler.setLayoutManager(manager);
        managers = new LinearLayoutManager(getActivity());
        rightre.setLayoutManager(managers);
        initSpr();

        rightre.addOnScrollListener(new RecyclerView.OnScrollListener() {
            int lastFirstVisibleItemPosition = 0;
            int po;

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                po = managers.findFirstVisibleItemPosition();
                //手指向下滑动，判断如果上一个条目变成了第一个可见条目，和左边的列表联动
                //手指向上滑动，判断如果下一个条目变成了第一个可见条目，和左边的列表联动
                if (po != lastFirstVisibleItemPosition) {
                    //自动滑动左边的列表到指定条目
                    manager.scrollToPosition(po);
                    //改变指定条目的背景
                    leftRecyclerView.setCount(po);
                    leftRecyclerView.notifyDataSetChanged();
                    lastFirstVisibleItemPosition = po;
                }
            }
        });
    }

    @Override
    public void showOrHideProgress(boolean flag) {

    }

    @Override
    public void showOrHideErrorView(boolean flag) {

    }

    @Override
    public void refreshView(ArrayList<LeftBean> leftBean) {
        if (leftBean != null) {
            for (LeftBean bean : leftBean) {
                list.add(bean);
            }
            if (leftRecyclerView == null) {
                leftRecyclerView = new LeftRecyclerView(getActivity(), list);
                leftRecycler.setAdapter(leftRecyclerView);
            } else {
                leftRecyclerView.notifyDataSetChanged();
            }
            leftRecyclerView.setOnItemClickListener(new LeftRecyclerView.OnRecyclerViewItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    //自动滑动左边的列表到指定条目
                    if (lastPosition > position) {
                        managers.scrollToPosition(position);
                        lastPosition = position;
                    } else {
                        managers.scrollToPosition(position+2);
                        lastPosition = position;
                    }
                    leftRecyclerView.setCount(position);
                    leftRecyclerView.notifyDataSetChanged();
                }
            });
            if (adpaters == null) {
                adpaters = new RecyclerViewRightAdpater(getActivity(), list);
                rightre.setAdapter(adpaters);
            } else {
                adpaters.notifyDataSetChanged();
            }
        }
    }

    public void initSpr() {
        rightspring.setType(SpringView.Type.FOLLOW);
        rightspring.setListener(new SpringView.OnFreshListener() {
            @Override
            public void onRefresh() {
                rightspring.onFinishFreshAndLoad();
            }

            @Override
            public void onLoadmore() {
                rightspring.onFinishFreshAndLoad();
            }
        });
        rightspring.setHeader(new MeituanHeader(getActivity(), pullAnimSrcs, refreshAnimSrcs));
        rightspring.setFooter(new MeituanFooter(getActivity(), loadingAnimSrcs));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        configPresenter.detachView();
    }

}
