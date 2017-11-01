package com.jo.jingou.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jo.jingou.R;
import com.jo.jingou.model.bean.JinBeanItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class JinAdpaterItem extends RecyclerView.Adapter<JinAdpaterItem.ViewHolder>{
    private Context context;
    private List<JinBeanItem.GoodsListBean> list;
    public JinAdpaterItem(Context context, List<JinBeanItem.GoodsListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.jin_main,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        JinBeanItem.GoodsListBean bean = list.get(position);
        Glide.with(context).load(bean.hd_thumb_url).into(holder.imageUrl);
        holder.t_goods_name.setText(bean.goods_name);
        int c = (int) bean.price;
        holder.t_price.setText("￥:"+(double)c/100);
    }

    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
       @BindView(R.id.im_thur_url)
        ImageView imageUrl;
        @BindView(R.id.goods_name)
        TextView t_goods_name;
        @BindView(R.id.t_tprice)
        TextView t_price;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
