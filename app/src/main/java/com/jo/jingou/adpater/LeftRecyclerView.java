package com.jo.jingou.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
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

public class LeftRecyclerView extends RecyclerView.Adapter<LeftRecyclerView.ViewHolders> implements View.OnLongClickListener, View.OnClickListener{
    private Context context;
    private List<LeftBean> list;
    private int count = 0;
    public OnRecyclerViewItemClickListener mOnItemClickListener = null;//点击
    public OnRecyclerViewLongItemClickListener mOnLongItemClickListener = null;//长按
    public LeftRecyclerView(Context context, List<LeftBean> list) {
        this.context = context;
        this.list = list;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    public void setOnLongItemClickListener(OnRecyclerViewLongItemClickListener listener) {
        this.mOnLongItemClickListener = listener;
    }
    @Override
    public ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view  = LayoutInflater.from(context).inflate(R.layout.left_recyclerview_main,parent,false);
        View inflate = View.inflate(context, R.layout.left_recyclerview_main, null);
        ViewHolders holder = new ViewHolders(inflate);
        inflate.setOnClickListener(this);
        inflate.setOnLongClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolders holder, int position) {
        holder.t_opt_name.setText(list.get(position).opt_name);
        if (position == count) {
            holder.t_opt_name.setTextColor(context.getResources().getColor(R.color.read));
            Glide.with(context).load(list.get(position).selected_url).into(holder.im_select_image);
//            vh.searchLinearSelect.setBackgroundColor(context.getResources().getColor(R.color.white));
        } else {
            holder.t_opt_name.setTextColor(context.getResources().getColor(R.color.heise));
            Glide.with(context).load(list.get(position).unselected_url).into(holder.im_select_image);
//            vh.searchLinearSelect.setBackgroundColor(context.getResources().getColor(R.color.whitesmoke));
        }
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(v, (Integer) v.getTag());
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (mOnLongItemClickListener != null) {
            mOnLongItemClickListener.onLongItemClick(v, (Integer) v.getTag());
        }
        return true;
    }

    class ViewHolders extends RecyclerView.ViewHolder {
        @BindView(R.id.t_opt_name)
        TextView t_opt_name;
        @BindView(R.id.im_select_image)
        ImageView im_select_image;

        public ViewHolders(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
    public interface OnRecyclerViewLongItemClickListener {
        void onLongItemClick(View view, int position);
    }

    public interface OnRecyclerViewItemClickListener {
        void onItemClick(View view, int position);
    }
}
