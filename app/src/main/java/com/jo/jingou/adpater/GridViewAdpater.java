package com.jo.jingou.adpater;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jo.jingou.R;
import com.jo.jingou.model.bean.LeftBean;

import java.util.List;

/**
 * Data:
 * Author: 付明
 * Des:
 */
//http://apiv4.yangkeduo.com/home_operations?pdduid
public class GridViewAdpater extends BaseAdapter {
    private List<LeftBean.ChildrenBean> list;
    private Context context;

    public GridViewAdpater(List<LeftBean.ChildrenBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHoder hoder = null;
        if(convertView==null)
        {
            hoder = new viewHoder();
            convertView = View.inflate(context, R.layout.right_grid_view,null);
            hoder.right = (ImageView) convertView.findViewById(R.id.right_image_url);
            hoder.right_t_op_name = (TextView) convertView.findViewById(R.id.right_gridview_opt_name);
            convertView.setTag(hoder);
        }else{
            hoder = (viewHoder) convertView.getTag();
        }
        LeftBean.ChildrenBean bean = list.get(position);
        Glide.with(context).load(bean.image_url).into(hoder.right);
        hoder.right_t_op_name.setText(bean.opt_name);
        return convertView;
    }

    class viewHoder
    {
        ImageView right;
        TextView right_t_op_name;
    }
}
