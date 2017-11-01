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
import com.jo.jingou.model.bean.NewBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class NewRecyclerviewAdapter extends RecyclerView.Adapter<NewRecyclerviewAdapter.ViewHolder> {
    private Context context;
    private List<NewBean.GoodsListBean> newlist;

    public NewRecyclerviewAdapter(Context context, List<NewBean.GoodsListBean> newlist) {
        this.context = context;
        this.newlist = newlist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.new_main, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NewBean.GoodsListBean bean = newlist.get(position);
        Glide.with(context).load(bean.hd_thumb_url).into(holder.i_imagename);
        holder.t_goodname.setText(bean.goods_name);
        int b = (int) bean.market_price;
        holder.t_Price.setText("￥" + (double) b / 100);
        ObjectAnimator anim = ObjectAnimator.ofFloat(holder.itemView, "alpha", 0.0f, 1.0f);
        anim.start();
    }

    @Override
    public int getItemCount() {
        return newlist == null ? 0 : newlist.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.image_name)
        ImageView i_imagename;
        @BindView(R.id.t_price)
        TextView t_Price;
        @BindView(R.id.goode_name)
        TextView t_goodname;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
