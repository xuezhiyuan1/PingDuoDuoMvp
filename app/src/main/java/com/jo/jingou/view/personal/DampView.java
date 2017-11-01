package com.jo.jingou.view.personal;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

/**
 * Data: 阻尼效果
 * Author: 付明
 * Des:
 */

public class DampView extends ScrollView {
    public DampView(Context context) {
        super(context);
    }

    public DampView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DampView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //    用于记录下拉位置
    private float y = 0f;
    //    zoomView原本的宽高
    private int zoomViewWidth = 0;
    private int zoomViewHeight = 0;

    //    是否正在放大
    private boolean mScaling = false;

    //    放大的view，默认为第一个子view
    private View zoomView;

    public void setZoomView(View zoomView) {
        this.zoomView = zoomView;
    }

    //    滑动放大系数，系数越大，滑动时放大程度越大
    private float mScaleRatio = 1.2f;

    public void setmScaleRatio(float mScaleRatio) {
        this.mScaleRatio = mScaleRatio;
    }

    //    最大的放大倍数
    private float mScaleTimes = 13f;

    public void setmScaleTimes(int mScaleTimes) {
        this.mScaleTimes = mScaleTimes;
    }

    //    回弹时间系数，系数越小，回弹越快
    private float mReplyRatio = 0.2f;

    public void setmReplyRatio(float mReplyRatio) {
        this.mReplyRatio = mReplyRatio;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
//        不可过度滚动，否则上移后下拉会出现部分空白的情况
        setOverScrollMode(OVER_SCROLL_NEVER);
//        获得默认第一个view
        if (getChildAt(0) != null && getChildAt(0) instanceof ViewGroup && zoomView == null) {
            ViewGroup vg = (ViewGroup) getChildAt(0);
            if (vg.getChildCount() > 0) {
                zoomView = vg.getChildAt(0);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (zoomViewWidth <= 0 || zoomViewHeight <= 0) {
            zoomViewWidth = zoomView.getMeasuredWidth();
            zoomViewHeight = zoomView.getMeasuredHeight();
        }
        if (zoomView == null || zoomViewWidth <= 0 || zoomViewHeight <= 0) {
            return super.onTouchEvent(ev);
        }
        switch (ev.getAction()) {
            case MotionEvent.ACTION_MOVE:
                if (!mScaling) {
                    if (getScrollY() == 0) {
                        y = ev.getY();//滑动到顶部时，记录位置
                    } else {
                        break;
                    }
                }
                int distance = (int) ((ev.getY() - y) * mScaleRatio);
                if (distance < 0) break;//若往下滑动
                mScaling = true;
                setZoom(distance);
                return true;
            case MotionEvent.ACTION_UP:
                mScaling = false;
                replyView();
                break;
        }
        return super.onTouchEvent(ev);
    }

    /**
     * 放大view
     */
    private void setZoom(float s) {
        float scaleTimes = (float) ((zoomViewWidth + s) / (zoomViewWidth * 1.0));
//        如超过最大放大倍数，直接返回
        if (scaleTimes > mScaleTimes) return;

        ViewGroup.LayoutParams layoutParams = zoomView.getLayoutParams();
        layoutParams.width = (int) (zoomViewWidth + s);
        layoutParams.height = (int) (zoomViewHeight * ((zoomViewWidth + s) / zoomViewWidth));
//        设置控件水平居中
        ((MarginLayoutParams) layoutParams).setMargins(-(layoutParams.width - zoomViewWidth) / 2, 0, 0, 0);
        zoomView.setLayoutParams(layoutParams);
    }

    /**
     * 回弹
     */
    private void replyView() {
        final float distance = zoomView.getMeasuredWidth() - zoomViewWidth;
        // 设置动画
        ValueAnimator anim = ObjectAnimator.ofFloat(distance, 0.0F).setDuration((long) (distance * mReplyRatio));
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                setZoom((Float) animation.getAnimatedValue());
            }
        });
        anim.start();
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (onScrollListener != null) onScrollListener.onScroll(l, t, oldl, oldt);
    }

    private OnScrollListener onScrollListener;

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.onScrollListener = onScrollListener;
    }

    /**
     * 滑动监听
     */
    public interface OnScrollListener {
        void onScroll(int scrollX, int scrollY, int oldScrollX, int oldScrollY);
    }

//    private View inner;// 子View
//
//    private float y;// 点击时y坐标
//    private float y1;// 点击时y坐标
//    private float y2;// 抬起时y坐标
//
//    private Rect normal = new Rect();// 矩形(这里只是个形式，只是用于判断是否需要动画.)
//
//    private boolean isCount = false;// 是否开始计算
//
//    private boolean isMoveing = false;// 是否开始移动.
//
//    private ImageView imageView;
//
//    private int initTop, initbottom;// 初始高度
//    private int top, bottom;// 拖动时时高度。
//
//    public void setImageView(ImageView imageView) {
//        this.imageView = imageView;
//    }
//
//    public DampView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    private OnHeaderRefreshListener mOnHeaderRefreshListener;
//
//    /***
//     * 根据 XML 生成视图工作完成.该函数在生成视图的最后调用，在所有子视图添加完之后. 即使子类覆盖了 onFinishInflate
//     * 方法，也应该调用父类的方法，使该方法得以执行.
//     */
//    @Override
//    protected void onFinishInflate() {
//        if (getChildCount() > 0) {
//            inner = getChildAt(0);
//        }
//    }
//
//    /** touch 事件处理 **/
//    @Override
//    public boolean onTouchEvent(MotionEvent ev) {
//        if (inner != null) {
//            commOnTouchEvent(ev);
//        }
//        return super.onTouchEvent(ev);
//    }
//
//    /***
//     * 触摸事件
//     *
//     * @param ev
//     */
//    public void commOnTouchEvent(MotionEvent ev) {
//        int action = ev.getAction();
//        switch (action) {
//            case MotionEvent.ACTION_DOWN:
//                y1 = ev.getY();
//                top = initTop = imageView.getTop();
//                bottom = initbottom = imageView.getBottom();
//                break;
//
//            case MotionEvent.ACTION_UP:
//                y2 = ev.getY();
//                //y2-y1>0表示下拉动作
//                if (isMoveing&&(y2-y1>0)){
//                    Log.e("jj", "下拉结束" );
//                    mOnHeaderRefreshListener.onHeaderRefresh(this);
//                }
//
//                isMoveing = false;
//                // 手指松开.
//                if (isNeedAnimation()) {
//
//                    animation();
//
//                }
//
//
//                break;
//            /***
//             * 排除出第一次移动计算，因为第一次无法得知y坐标， 在MotionEvent.ACTION_DOWN中获取不到，
//             * 因为此时是MyScrollView的touch事件传递到到了LIstView的孩子item上面.所以从第二次计算开始.
//             * 然而我们也要进行初始化，就是第一次移动的时候让滑动距离归0. 之后记录准确了就正常执行.
//             */
//            case MotionEvent.ACTION_MOVE:
//
//                final float preY = y;// 按下时的y坐标
//                float nowY = ev.getY();// 时时y坐标
//                int deltaY = (int) (nowY - preY);// 滑动距离
//                if (!isCount) {
//                    deltaY = 0; // 在这里要归0.
//                }
//
//                if (deltaY < 0 && top <= initTop)
//                    return;
//
//                // 当滚动到最上或者最下时就不会再滚动，这时移动布局
//                isNeedMove();
//
//                if (isMoveing) {
//                    // 初始化头部矩形
//                    if (normal.isEmpty()) {
//                        // 保存正常的布局位置
//                        normal.set(inner.getLeft(), inner.getTop(),inner.getRight(), inner.getBottom());
//                    }
//
//                    // 移动布局
//                    inner.layout(inner.getLeft(), inner.getTop() + deltaY / 3,inner.getRight(), inner.getBottom() + deltaY / 3);
//
//                    top += (deltaY / 6);
//                    bottom += (deltaY / 6);
//                    imageView.layout(imageView.getLeft(), top,imageView.getRight(), bottom);
//                }
//
//                isCount = true;
//                y = nowY;
//                break;
//
//            default:
//                break;
//
//        }
//    }
//
//    /***
//     * 回缩动画
//     */
//    public void animation() {
//
//        TranslateAnimation taa = new TranslateAnimation(0, 0, top + 200,
//                initTop + 200);
//        taa.setDuration(200);
//        imageView.startAnimation(taa);
//        imageView.layout(imageView.getLeft(), initTop, imageView.getRight(),
//                initbottom);
//
//        // 开启移动动画
//        TranslateAnimation ta = new TranslateAnimation(0, 0, inner.getTop(),
//                normal.top);
//        ta.setDuration(200);
//        inner.startAnimation(ta);
//        // 设置回到正常的布局位置
//        inner.layout(normal.left, normal.top, normal.right, normal.bottom);
//        normal.setEmpty();
//
//        isCount = false;
//        y = 0;// 手指松开要归0.
//
//    }
//
//    // 是否需要开启动画
//    public boolean isNeedAnimation() {
//        return !normal.isEmpty();
//    }
//
//    /***
//     * 是否需要移动布局 inner.getMeasuredHeight():获取的是控件的总高度
//     *
//     * getHeight()：获取的是屏幕的高度
//     *
//     * @return
//     */
//    public void isNeedMove() {
//        int offset = inner.getMeasuredHeight() - getHeight();
//        int scrollY = getScrollY();
//        // 0是顶部，后面那个是底部
////		if (scrollY == 0 || scrollY == offset) {
////			isMoveing = true;
////		}
//        if (scrollY == 0) {
//            isMoveing = true;
//        }
//    }
//
//    public interface OnHeaderRefreshListener {
//        public void onHeaderRefresh(DampView view);
//    }
//
//    public void setOnHeaderRefreshListener(OnHeaderRefreshListener headerRefreshListener) {
//        mOnHeaderRefreshListener = headerRefreshListener;
//    }

}
