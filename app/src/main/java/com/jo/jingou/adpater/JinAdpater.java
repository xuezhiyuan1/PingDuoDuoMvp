package com.jo.jingou.adpater;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

public class JinAdpater extends RecyclerView.Adapter<JinAdpater.ViewHolder>{
    private Context context;
    private List<JinBeanItem>  dlist;
    private List<JinBeanItem.GoodsListBean> list;
    public JinAdpater(Context context, List<JinBeanItem> dlist, List<JinBeanItem.GoodsListBean> list) {
        this.context = context;
        this.dlist = dlist;
        this.list = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.jinitem,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        holder.recyclerView.setLayoutManager(manager);
        JinAdpaterItem item = new JinAdpaterItem(context,dlist.get(position).goods_list);
        holder.recyclerView.setAdapter(item);
        holder.desc.setText(dlist.get(position).desc);
        int c = (int)list.get(position).sales;
        holder.count.setText(dlist.get(position).goods_num+"件商品,累计已拼"+(double)c/100+"万次");
    }

    @Override
    public int getItemCount() {
        return dlist==null?0:dlist.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
       @BindView(R.id.t_desc)
        TextView desc;
        @BindView(R.id.t_count)
        TextView count;
        @BindView(R.id.li_recy)
        RecyclerView recyclerView;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
