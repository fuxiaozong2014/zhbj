package com.example.fsq.zhbj.fragment;


import android.widget.TextView;

import com.example.fsq.zhbj.base.BaseFragment;
import com.example.fsq.zhbj.base.BaseLoadNetData;

public class SmartFragment extends BaseFragment implements BaseLoadNetData {
    @Override
    public void setTvText() {
        TextView view = (TextView)getView();
        view.setText("智慧服务");
    }

    @Override
    public void LoadNetData(String url) {

    }
}
