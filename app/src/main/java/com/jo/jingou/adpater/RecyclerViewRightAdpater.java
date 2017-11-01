package com.jo.jingou.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.jo.jingou.R;
import com.jo.jingou.model.bean.LeftBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public class RecyclerViewRightAdpater extends RecyclerView.Adapter<RecyclerViewRightAdpater.ViewHolder> {
    private Context context;
    private List<LeftBean> list;
    public RecyclerViewRightAdpater(Context context, List<LeftBean> list) {
        this.context = context;
        this.list = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.righ_recyclerview_main,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
          LeftBean bean = list.get(position);
          GridViewAdpater adpater = new GridViewAdpater(bean.children,context);
          holder.right_grid.setAdapter(adpater);
          holder.te_op_name.setText(bean.opt_name);
    }
    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.right_opt_name)
        TextView te_op_name;
        @BindView(R.id.right_gridview)
        GridView right_grid;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
