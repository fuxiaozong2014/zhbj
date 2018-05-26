package com.example.eventdispatchdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class MyViewgroup extends ViewGroup {

    public MyViewgroup(Context context) {
        this(context,null);
    }

    public MyViewgroup(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyViewgroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        View  view= getChildAt(0);//代表获取第一个子view
        view.measure(widthMeasureSpec,heightMeasureSpec);//代表和父控件一样大小

    }

    //布局
    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
        View view = getChildAt(0);
        view.layout(i,i1,i2,i3);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("Tag","MyViewgroup             dispatchTouchEvent   ");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("Tag","MyViewgroup             onInterceptTouchEvent   ");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("Tag","MyViewgroup             onTouchEvent   ");
        return super.onTouchEvent(event);
    }
}
