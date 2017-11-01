package com.jo.jingou.view.newproduct;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jo.jingou.R;
import com.jo.jingou.adpater.JinAdpater;
import com.jo.jingou.model.bean.JinBeanItem;
import com.jo.jingou.view.fragment.NewProductFragment;
import com.liaoinstan.springview.container.MeituanFooter;
import com.liaoinstan.springview.container.MeituanHeader;
import com.liaoinstan.springview.widget.SpringView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class JinXuanActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.re_image)
    ImageView reimage;
    @BindView(R.id.login)
    ImageView imaelogin;
    @BindView(R.id.li_recy)
    RecyclerView lirecyclerview;
    @BindView(R.id.lispring)
    SpringView lispring;
    @BindView(R.id.re_all)
    LinearLayout lieAll;
    //TODO 配置下拉刷效果
    private int[] pullAnimSrcs = new int[]{R.drawable.sku_loding, R.drawable.ic_loading, R.drawable.ic_chat_image_loading};
    private int[] refreshAnimSrcs = new int[]{R.drawable.b1, R.drawable.c1, R.drawable.e1, R.drawable.f1, R.drawable.h1, R.drawable.i1, R.drawable.k1, R.drawable.l1};
    private int[] loadingAnimSrcs = new int[]{R.drawable.mt_loading01, R.drawable.mt_loading02};
    //TODO 集合
    private List<JinBeanItem> list = new ArrayList<>();
    private List<JinBeanItem.GoodsListBean> dlist = new ArrayList<>();
    private LinearLayoutManager manager;
    private JinAdpater adpater;
    private String urlpath = "http://apiv4.yangkeduo.com/rank_subjects?size=10&pdduid=&page=";
    private int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jin_xuan);
        ButterKnife.bind(this);
        reimage.setOnClickListener(this);
        imaelogin.setOnClickListener(this);
        manager = new LinearLayoutManager(this);
        lirecyclerview.setLayoutManager(manager);
        //加载Spring
        initSpr();
        //加载网络
         initData();

    }

    public void initData() {
        OkHttpClient client = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(urlpath + page)
                .build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response != null && response.isSuccessful()) {
                    Gson gson = new Gson();
                    String result = response.body().string();
                     List<JinBeanItem>  beans = gson.fromJson(result, new TypeToken<List<JinBeanItem>>() {
                    }.getType());
                    for (JinBeanItem bean :beans){
                        list.add(bean);
                        dlist.addAll(bean.goods_list);
                    }
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            adpater = new JinAdpater(JinXuanActivity.this,list,dlist);
                            lirecyclerview.setAdapter(adpater);
                            adpater.notifyDataSetChanged();                        }
                    });
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.re_image:
                getSupportFragmentManager().beginTransaction().replace(R.id.re_image,new NewProductFragment());
//                startActivity(new Intent(this, NewProductFragment.class));
                break;
            case R.id.login:
                INit();
                break;
            default:
                break;
        }

    }

    public void initSpr() {
        lispring.setType(SpringView.Type.FOLLOW);
        lispring.setListener(new SpringView.OnFreshListener() {
            @Override
            public void onRefresh() {
                lispring.onFinishFreshAndLoad();
                adpater.notifyDataSetChanged();
            }

            @Override
            public void onLoadmore() {
                lispring.onFinishFreshAndLoad();
                lirecyclerview.addOnScrollListener(new RecyclerView.OnScrollListener() {
                    @Override
                    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                        super.onScrollStateChanged(recyclerView, newState);
                        if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                            int lastVisiblePosition = manager.findLastVisibleItemPosition();
                            if (lastVisiblePosition >= manager.getItemCount() - 1) {
                                System.out.print("加载更多");
                                list.clear();
                                page++;
                                initData();
                                adpater.notifyDataSetChanged();
                            }
                        }
                    }
                });
            }
        });
        lispring.setHeader(new MeituanHeader(this, pullAnimSrcs, refreshAnimSrcs));
        lispring.setFooter(new MeituanFooter(this, loadingAnimSrcs));

    }

    //TODO 底部弹框
    public void INit() {
        View dialogView = LayoutInflater.from(this).inflate(R.layout.share_bottom_dialog, null);
        final ShareBottomPopupDialog shareBottomPopupDialog = new ShareBottomPopupDialog(this, dialogView);
        shareBottomPopupDialog.showPopup(lieAll);
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
}
