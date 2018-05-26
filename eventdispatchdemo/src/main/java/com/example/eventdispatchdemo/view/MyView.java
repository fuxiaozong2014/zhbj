package com.example.eventdispatchdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;



public class MyView extends View {
    private Paint paint;
    public MyView(Context context) {
        this(context,null);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //这是初始化画笔的操作
        paint=new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setTextSize(40);
    }

    //重写onDraw方法

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

       canvas.drawText("事件传递",0,150,paint);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("Tag","MyView             dispatchTouchEvent   ");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("Tag","MyView             onTouchEvent   ");
        return super.onTouchEvent(event);
    }
}
