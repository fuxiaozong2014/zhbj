package com.example.fsq.zhbj.base;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class BaseFragment extends Fragment{
   //抽取基类 子类相同的行为都可以抽取
    //子类不同的行为  搞成抽象方法，强制子类实现，这样子类就可以单独处理不同行为了
    //不同行为抽象出来的方法，必须在生命周期中调用一下才有效
   @Nullable
   @Override
   public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       TextView tv=new TextView(getContext());
       tv.setGravity(Gravity.CENTER);
       tv.setTextColor(Color.RED);
       return tv;
   }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setTvText();
    }

    public abstract void setTvText();


}
