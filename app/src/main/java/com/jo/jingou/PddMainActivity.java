package com.jo.jingou;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.gyf.barlibrary.ImmersionBar;
import com.jo.jingou.view.fragment.HomePageFragment;
import com.jo.jingou.view.fragment.NewProductFragment;
import com.jo.jingou.view.fragment.PersonalFragment;
import com.jo.jingou.view.fragment.SearchFragment;
import com.jo.jingou.view.fragment.TaoBaoFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PddMainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener{
    @BindView(R.id.bottom_navigation_bar)
    BottomNavigationBar bottomNavigationBar;
    private HomePageFragment pageFragment;
    private NewProductFragment newProductFragment;
    private TaoBaoFragment taoBaoFragment;
    private SearchFragment searchFragment;
    private PersonalFragment personalFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdd_main);
        ButterKnife.bind(this);
        StatusBarCompat.compat(this, getResources().getColor(R.color.read));
        ImmersionBar.with(this).init();
        ImmersionBar.with(this).transparentStatusBar().fullScreen(true).destroy();
        //设置BottomNavigation
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_SHIFTING);
        bottomNavigationBar.setBarBackgroundColor(R.color.white);
        bottomNavigationBar.setInActiveColor(R.color.white);
        bottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.a, "首页").setInActiveColor(R.color.read))
                .addItem(new BottomNavigationItem(R.mipmap.b, "新品").setInActiveColor(R.color.read))
                .addItem(new BottomNavigationItem(R.mipmap.c, "海淘").setInActiveColor(R.color.read))
                .addItem(new BottomNavigationItem(R.mipmap.d, "搜索").setInActiveColor(R.color.read))
                .addItem(new BottomNavigationItem(R.mipmap.e, "个人中心").setInActiveColor(R.color.read))
                .setFirstSelectedPosition(0)
                .initialise();
        bottomNavigationBar.setTabSelectedListener(this);
        setDefautFragment();
    }
    private void setDefautFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        pageFragment = HomePageFragment.getIntance();
        transaction.add(R.id.fragment, pageFragment).commit();
    }

    @Override
    public void onTabSelected(int position) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        switch (position) {
            case 0:
                if (pageFragment == null) {
                    pageFragment = HomePageFragment.getIntance();
                }
                transaction.replace(R.id.fragment, pageFragment);
                break;
            case 1:
                if (newProductFragment == null) {
                    newProductFragment = NewProductFragment.getIntance();
                }
                transaction.replace(R.id.fragment, newProductFragment);
                break;
            case 2:
                if (taoBaoFragment == null) {
                    taoBaoFragment = TaoBaoFragment.getIntance();
                }
                transaction.replace(R.id.fragment, taoBaoFragment);
                break;
            case 3:
                if (searchFragment == null) {
                    searchFragment = SearchFragment.getIntance();
                }
                transaction.replace(R.id.fragment, searchFragment);
                break;
            case 4:
                if (personalFragment == null) {
                    personalFragment = PersonalFragment.getIntance();
                }
                transaction.replace(R.id.fragment, personalFragment);
                break;
            default:
                break;
        }
        transaction.commit();
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }
      @Override
          public void onWindowFocusChanged(boolean hasFocus) {
              super.onWindowFocusChanged(hasFocus);
              if (hasFocus && Build.VERSION.SDK_INT >= 19) {
                  View decorView = getWindow().getDecorView();
                  decorView.setSystemUiVisibility(
                      View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                      | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                      | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                      | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                      | View.SYSTEM_UI_FLAG_FULLSCREEN
                      | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
              }
          }


//    public void initData() {
//        private ConfigPresenterImpl configPresenter;
//
//        implements ConfigViewInterface<ConfigResponse>
//                configPresenter = new ConfigPresenterImpl(this);
//        configPresenter.loadData("xy");
//    }
//    @Override
//    public void showOrHideProgress(boolean flag) {
//
//    }
//
//    @Override
//    public void showOrHideErrorView(boolean flag) {
//
//    }
//
//    @Override
//    public void refreshView(ConfigResponse configResponse) {
//        if (tvConfigTest != null && configResponse != null) {
//            tvConfigTest.setText(configResponse.androidDes);
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        configPresenter.detachView();
//    }
}
