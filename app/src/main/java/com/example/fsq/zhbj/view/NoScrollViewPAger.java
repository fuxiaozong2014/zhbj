package com.example.fsq.zhbj.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NoScrollViewPAger extends ViewPager {


    public NoScrollViewPAger(Context context) {
        super(context);
    }

    public NoScrollViewPAger(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;//不拦截事件，让滑动事件得以往下传递
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;//也不处理滑动事件
    }
}
