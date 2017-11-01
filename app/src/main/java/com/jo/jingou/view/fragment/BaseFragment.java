package com.jo.jingou.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Data:
 * Author: 付明
 * Des:
 */

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = View.inflate(getActivity(),getLayoutID(),null);
        ButterKnife.bind(this,view);
        //返回ButterKnife
        initView();
        //监听
        initListener();
        return view;
    }
    public abstract void initListener();
    public abstract void initView();
    public abstract int getLayoutID();
}
