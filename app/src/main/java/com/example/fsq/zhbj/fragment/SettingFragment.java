package com.example.fsq.zhbj.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fsq.zhbj.base.BaseFragment;

public class SettingFragment extends BaseFragment {
    @Override
    public void setTvText() {
        TextView view = (TextView)getView();
        view.setText("设置");
    }
}
