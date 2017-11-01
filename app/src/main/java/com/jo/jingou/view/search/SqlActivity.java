package com.jo.jingou.view.search;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jo.jingou.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SqlActivity extends AppCompatActivity {
    private mSearchLayout mSearchLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);
        mSearchLayout = (mSearchLayout) findViewById(R.id.msearchlayout);
        initData();
    }
    protected void initData() {
        String shareData = "高跟鞋,头绳,工具箱,儿童书桌,手表";
        List<String> skills = Arrays.asList(shareData.split(","));

        String shareHotData =" 棒棒糖,女装,男装";
        List<String> skillHots = Arrays.asList(shareHotData.split(","));

        mSearchLayout.initData(skills, skillHots, new mSearchLayout.setSearchCallBackListener() {
            @Override
            public void Search(String str) {
                //进行或联网搜索
            }
            @Override
            public void Back() {
                finish();
            }
            @Override
            public void ClearOldData() {
                //清除历史搜索记录  更新记录原始数据
            }
            @Override
            public void SaveOldData(ArrayList<String> AlloldDataList) {
                //保存所有的搜索记录
            }
        });
    }
}
