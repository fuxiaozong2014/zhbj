package com.example.fsq.zhbj.fragment;


import android.widget.TextView;

import com.example.fsq.zhbj.base.BaseFragment;
import com.example.fsq.zhbj.base.BaseLoadNetData;

public class HomeFragment extends BaseFragment implements BaseLoadNetData {

    @Override
    public void setTvText() {
        TextView view = (TextView)getView();
        view.setText("首页");
    }

    @Override
    public void LoadNetData(String url) {

    }
}
