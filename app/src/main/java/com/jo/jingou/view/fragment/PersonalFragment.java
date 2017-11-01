package com.jo.jingou.view.fragment;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.jo.jingou.R;
import com.jo.jingou.view.newproduct.WesharActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Data:
 * Author: 付明
 * Des:
 */
public class PersonalFragment extends BaseFragment {
    private static volatile PersonalFragment intance = null;
    @BindView(R.id.daifukuan)
    TextView linearLayout;
    @Override
    public void initListener() {

    }

    @Override
    public void initView() {
        ButterKnife.bind(getActivity());
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), WesharActivity.class));
            }
        });

    }

    @Override
    public int getLayoutID() {
        return R.layout.personal;
    }

    @SuppressLint("ValidFragment")
    private PersonalFragment() {
    }

    public static PersonalFragment getIntance() {
        if (intance == null) {
            synchronized (PersonalFragment.class) {
                if (intance == null) {
                    intance = new PersonalFragment();
                }
            }
        }
        return intance;
    }
}
