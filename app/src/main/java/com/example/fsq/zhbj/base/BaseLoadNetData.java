package com.example.fsq.zhbj.base;

//练习抽取接口
//当Setting页面不需要加载网络数据，而其他子类需要的时候，就不能抽取基类了
// 可以抽取接口，让需要的子类实现此接口，不需要的就不用实现
public interface BaseLoadNetData {

    void LoadNetData(String url);
}
