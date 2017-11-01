package com.jo.jingou.adpater;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;
/**
 * Data:
 * Author: 付明
 * Des:
 */
public class TablayoutViewpageAdpater extends FragmentPagerAdapter {
    private Context context;
    private List<Fragment> fragments;
    public TablayoutViewpageAdpater(FragmentManager fm,Context context,List<Fragment> fragments) {
        super(fm);
        this.context = context;
        this.fragments = fragments;
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
    @Override
    public int getCount() {
        return fragments!=null?fragments.size():0;
    }
}
