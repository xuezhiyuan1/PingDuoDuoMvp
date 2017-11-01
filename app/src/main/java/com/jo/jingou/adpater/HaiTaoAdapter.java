package com.jo.jingou.adpater;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.jo.jingou.R;
import com.jo.jingou.model.bean.HaiTaoBean;

import java.util.List;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class HaiTaoAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<HaiTaoBean.GoodsListBeanX> list;
    private List<HaiTaoBean.HomeRecommendSubjectsBean> homeRecommendSubjectsBeen;

    public HaiTaoAdapter(Context context, List<HaiTaoBean.GoodsListBeanX> list, List<HaiTaoBean.HomeRecommendSubjectsBean> homeRecommendSubjectsBeen) {
        this.context = context;
        this.list = list;
        this.homeRecommendSubjectsBeen = homeRecommendSubjectsBeen;
    }

    private final int FIRST = 0;
    private final int SECOND = 1;
    private int myPosintion;
    private int p;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        RecyclerView.ViewHolder holder = null;
        switch (viewType) {
            case FIRST:
                view = LayoutInflater.from(context).inflate(R.layout.htao_main, parent, false);
                holder = new IViewHolder(view);
                break;
            case SECOND:
                view = LayoutInflater.from(context).inflate(R.layout.horizontal_item, parent, false);
                holder = new HorizontalViewHolder(view);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof IViewHolder) {
            IViewHolder iViewHolder = (IViewHolder) holder;
            Glide.with(context).load(list.get(p).image_url).into(iViewHolder.hImageUrl);
            iViewHolder.hTitle.setText(list.get(p).goods_name);
            iViewHolder.hCount.setText(list.get(p).cnt + "");
            iViewHolder.hPrice.setText(list.get(p).group.price + "");
            iViewHolder.btnPD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "" + p, Toast.LENGTH_SHORT).show();
                }
            });
            p++;
        } else if (holder instanceof HorizontalViewHolder) {
            HorizontalViewHolder hViewHolder = (HorizontalViewHolder) holder;
            String imageurl = homeRecommendSubjectsBeen.get(myPosintion).goods_list.get(myPosintion).image_url;
            System.out.println("imageurl = " + imageurl);
            LinearLayout linear = new LinearLayout(context);
            linear.setOrientation(LinearLayout.VERTICAL);
            linear.setPadding(10, 10, 10, 0);

            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(170, 170));
            Glide.with(context).load(imageurl).into(imageView);

            TextView textView = new TextView(context);
            textView.setTextColor(Color.RED);
            textView.setTextSize(20f);
            textView.setGravity(Gravity.CENTER);
            textView.setText("￥" + (double) (homeRecommendSubjectsBeen.get(myPosintion).goods_list.get(myPosintion).normal_price / 100));

            linear.addView(imageView);
            linear.addView(textView);

            hViewHolder.horizontalLinear.addView(linear);
            myPosintion++;
        }
    }

    @Override
    public int getItemCount() {
        int count = list.size() + homeRecommendSubjectsBeen.size();
        return 23;
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 4 == 3) {
            return SECOND;
        }
        return FIRST;
    }

    static class IViewHolder extends RecyclerView.ViewHolder {
        ImageView hImageUrl;
        TextView hTitle;
        TextView hCount;
        TextView hPrice;
        Button btnPD;

        public IViewHolder(View itemView) {
            super(itemView);
            hImageUrl = (ImageView) itemView.findViewById(R.id.h_imageurl);
            hTitle = (TextView) itemView.findViewById(R.id.h_title);
            hCount = (TextView) itemView.findViewById(R.id.h_count);
            hPrice = (TextView) itemView.findViewById(R.id.h_price);
            btnPD = (Button) itemView.findViewById(R.id.btn_pd);
        }
    }

    static class HorizontalViewHolder extends RecyclerView.ViewHolder {
        LinearLayout horizontalLinear;
        public HorizontalViewHolder(View itemView) {
            super(itemView);
            horizontalLinear = (LinearLayout) itemView.findViewById(R.id.horizontal_linear);
        }
    }
}
