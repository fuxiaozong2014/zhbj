package com.example.fsq.zhbj;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.fsq.zhbj.adpter.MyFragmentPagerAdaper;
import com.example.fsq.zhbj.fragment.GovFragment;
import com.example.fsq.zhbj.fragment.HomeFragment;
import com.example.fsq.zhbj.fragment.NewsFragment;
import com.example.fsq.zhbj.fragment.SettingFragment;
import com.example.fsq.zhbj.fragment.SmartFragment;
import com.example.fsq.zhbj.view.NoScrollViewPAger;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, ViewPager.OnPageChangeListener {

    private NoScrollViewPAger vg;
    private RadioButton rb_home;
    private RadioButton rb_news;
    private RadioButton rb_gov;
    private RadioButton rb_smart;
    private RadioButton rb_setting;
    private List<Fragment> fragments;
    private RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initSlingMenu();
    }

    private void initSlingMenu() {
        SlidingMenu slidingMenu=new SlidingMenu(this);
        slidingMenu.setMode(SlidingMenu.LEFT);
        slidingMenu.setBehindWidth(200);
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidingMenu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        slidingMenu.setMenu(R.layout.menu);
    }

    private void initView() {
        vg = findViewById(R.id.vg);
        rb_home = findViewById(R.id.rb_home);
        rb_news = findViewById(R.id.rb_news);
        rb_gov = findViewById(R.id.rb_gov);
        rb_smart = findViewById(R.id.rb_smart);
        rb_setting = findViewById(R.id.rb_setting);
        rg = findViewById(R.id.rg);

    }

    private void initData() {//default修饰不是能本类和子类访问？
        fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new NewsFragment());
        fragments.add(new SmartFragment());
        fragments.add(new GovFragment());
        fragments.add(new SettingFragment());

        MyFragmentPagerAdaper adaper = new MyFragmentPagerAdaper(getSupportFragmentManager(), fragments);
        vg.setAdapter(adaper);

        rg.setOnCheckedChangeListener(this);
        vg.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    //根据pager页面的改变，改变rg的定位
    @Override
    public void onPageSelected(int position) {//当vg定位到此position所在的页面时调用
             switch (position){
                 case 0:
                     rb_home.setChecked(true);
                     break;
                 case 1:
                     rb_news.setChecked(true);
                     break;
                 case 2:
                     rb_smart.setChecked(true);
                     break;
                 case 3:
                     rb_gov.setChecked(true);
                     break;
                 case 4:
                     rb_setting.setChecked(true);
                     break;
                     default:
                         break;
             }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    //当rb选择改变的时候，让vg定位到当前页面
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
            int item=0;
        switch (checkedId) {
            case R.id.rb_home:
                item=0;
             //  vg.setCurrentItem(item);
                break;
            case R.id.rb_news:
                item=1;
                break;
            case R.id.rb_smart:
                item=2;
                break;
            case R.id.rb_gov:
                item=3;
                break;
            case R.id.rb_setting:
                item=4;
                break;
            default:
                break;
        }
         vg.setCurrentItem(item);
    }
}
