package com.jo.jingou.view.fragment;

import android.annotation.SuppressLint;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.jo.jingou.R;
import com.jo.jingou.adpater.TablayoutViewpageAdpater;
import com.jo.jingou.model.bean.BaseBean;
import com.jo.jingou.presenter.ConfigPresenterImpl;
import com.jo.jingou.view.ConfigViewInterface;
import com.jo.jingou.view.homefragmet.TablayoutViewpageFragmnet;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Data:
 * Author: 付明
 * Des:
 */
public class HomePageFragment extends BaseFragment implements ConfigViewInterface<ArrayList<BaseBean>> {
    //TODO 接口回调
    private ConfigPresenterImpl configPresenter;
    @BindView(R.id.tablayout)
    TabLayout Tat_TableLayout;
    @BindView(R.id.viewpage)
    ViewPager v_Viewpage;
    private List<Fragment> fra;
    private List<BaseBean> list = new ArrayList<>();
    private List<String> title = new ArrayList<>();
    private TablayoutViewpageAdpater fragmentAdpater;
    private static volatile HomePageFragment intance = null;
    private int count = 12;
    @Override
    public void initListener() {
    }

    @Override
    public void initView() {
        ButterKnife.bind(getActivity());
        initData();
    }

    private void initData() {
        configPresenter = new ConfigPresenterImpl(this);
        configPresenter.loadHom("home_operations?pdduid");
    }

    @Override
    public int getLayoutID() {
        return R.layout.hompage;
    }

    @SuppressLint("ValidFragment")
    public HomePageFragment() {
    }

    public static HomePageFragment getIntance() {
        if (intance == null) {
            synchronized (HomePageFragment.class) {
                if (intance == null) {
                    intance = new HomePageFragment();
                }
            }
        }
        return intance;
    }

    //网络加载
    @Override
    public void refreshView(ArrayList<BaseBean> baseBeen) {
        fra = new ArrayList<>();
        for (int i = 0; i <baseBeen.size(); i++) {
//            fra.add(new FirstTabPageFragment());
            fra.add(new TablayoutViewpageFragmnet());
        }
        Tat_TableLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        fragmentAdpater = new TablayoutViewpageAdpater(getActivity().getSupportFragmentManager(), getActivity(), fra);
        v_Viewpage.setAdapter(fragmentAdpater);
        Tat_TableLayout.setupWithViewPager(v_Viewpage);
        if (baseBeen != null) {
            for (int i = 0; i < baseBeen.size(); i++) {
                BaseBean base = baseBeen.get(i);
                if (base != null) {
//                    Tat_TableLayout.addTab(Tat_TableLayout.newTab().setText("首页"));
                    Tat_TableLayout.getTabAt(i).setText(base.opt_name);
                }
            }
        }
    }
    public void showOrHideProgress(boolean flag) {
    }
    @Override
    public void showOrHideErrorView(boolean flag) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        configPresenter.detachView();
    }
}
