package com.jo.jingou.view.newproduct;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.jo.jingou.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WesharActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.back)
    TextView back;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.wxdenglu)
    Button wxdenglu;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.qtdenglu)
    TextView qtdenglu;
    @BindView(R.id.qt)
    TextView qt;
    @BindView(R.id.iv_all)
    ImageView iv_all;
    private PopupWindow mPopupWindow;
    private View mPopupView;
    private static PopupWindow mPop;
    private LinearLayout btn_take_phone;
    private LinearLayout btn_pick_qq;
    private LinearLayout btn_click_weibo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weshar);
        ButterKnife.bind(this);
        initView();


        btn_take_phone.setOnClickListener(this);
        btn_pick_qq.setOnClickListener(this);
        btn_click_weibo.setOnClickListener(this);
    }
    private void initView() {
        /**
         * 分享的那个popupWindow
         */
        //获取得到PopupWindow的布局文件
        mPopupView = View.inflate(this, R.layout.layout_share_popuwindow, null);

        btn_take_phone = (LinearLayout) mPopupView.findViewById(R.id.btn_take_phone);
        btn_pick_qq = (LinearLayout) mPopupView.findViewById(R.id.btn_pick_qq);
        btn_click_weibo = (LinearLayout) mPopupView.findViewById(R.id.btn_click_weibo);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_take_phone:

                break;
            case R.id.btn_pick_qq:
               /* AppApplication.getUMShareAPI().getPlatformInfo(Login.this, SHARE_MEDIA.SINA, new UMAuthListener() {
                    @Override
                    public void onStart(SHARE_MEDIA share_media) {

                    }

                    @Override
                    public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                      String userName= map.get("name");
                    }

                    @Override
                    public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {

                    }

                    @Override
                    public void onCancel(SHARE_MEDIA share_media, int i) {

                    }
                });*/

                break;
            case R.id.btn_click_weibo:
                break;
        }

    }
    @OnClick({R.id.back, R.id.wxdenglu, R.id.qtdenglu, R.id.qt})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.wxdenglu:
                break;
            case R.id.qtdenglu:

                propetyAnim(iv_all);
                mPopupWindow = showPopWindow(view, mPopupView, this, iv_all);
                break;
            case R.id.qt:
                break;
        }
    }
    /**
     * 半透明背景出现的动画
     */
    private void propetyAnim(ImageView iv) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "alpha", 0, 0.2f, 0.5f, 0.7f, 0.9f, 1);
        animator.setDuration(500);
        animator.setRepeatCount(0);
        animator.start();
        iv.setVisibility(View.VISIBLE);
    }

    /**
     * 半透明背景消失的动画
     *
     * @param iv
     */
    public static void propetyAnim2(final ImageView iv) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "alpha", 1, 0.9f, 0.7f, 0.5f, 0.2f, 0);
        animator.setDuration(500);
        animator.setRepeatCount(0);
        animator.start();
        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                iv.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }

    /**
     * 显示PopupWindow
     *
     * @param parent
     * @param view
     * @return
     */
    public static PopupWindow showPopWindow(View parent, View view, Context context, final ImageView iv_all) {

        mPop = new PopupWindow(view,
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        mPop.setOutsideTouchable(true);
        mPop.setFocusable(true);
        mPop.setBackgroundDrawable(new ColorDrawable(0));
        mPop.setAnimationStyle(R.style.AnimBottom);
        mPop.showAtLocation(parent, Gravity.TOP, 0, 0);

        //mPop.showAsDropDown(v,0,0);
        view.setFocusable(true); // 这个很重要
        view.setFocusableInTouchMode(true);

        mPop.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                propetyAnim2(iv_all);
                mPop = null;
            }
        });

        // 重写onKeyListener
        view.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK) {
                    mPop.dismiss();
                    return true;
                }
                return false;
            }
        });

        // 点击其他地方消失
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                if (mPop != null && mPop.isShowing()) {
                    mPop.dismiss();
                }
                return false;
            }
        });

        return mPop;
    }


}
