package com.jo.jingou.adpater;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jo.jingou.R;
import com.jo.jingou.model.bean.LiNiBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Data:
 * Author: 付明
 * Des:
 */
public class LinNiAdpater extends RecyclerView.Adapter<LinNiAdpater.ViewHolder> {
    private Context context;
    private List<LiNiBean.GoodsListBean> list;
    public LinNiAdpater(Context context, List<LiNiBean.GoodsListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.lin_main,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        LiNiBean.GoodsListBean bean = list.get(position);
        Glide.with(context).load(bean.thumb_url).into(holder.thImage);
        holder.thname.setText(bean.goods_name);
        int b = (int) bean.market_price;
        holder.thcount.setText("以拼"+bean.cnt+"件  "+"市场价￥"+(double)b/100);
        int c = (int) bean.normal_price;
        holder.tprice.setText("￥:"+(double)c/100);
        ObjectAnimator anim = ObjectAnimator.ofFloat(holder.itemView, "alpha", 0.0f, 1.0f);
        anim.start();
    }

    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.th_image)
        ImageView thImage;
        @BindView(R.id.th_name)
        TextView  thname;
        @BindView(R.id.th_count)
        TextView thcount;
        @BindView(R.id.th_price)
        TextView tprice;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
