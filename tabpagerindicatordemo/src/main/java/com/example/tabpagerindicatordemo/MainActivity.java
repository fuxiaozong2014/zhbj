package com.example.tabpagerindicatordemo;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.viewpagerindicator.TabPageIndicator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private String[] titles = new String[]{"新闻","音乐","亲子","体育","娱乐","淘宝","哈哈","呵呵","嘿嘿","嗨嗨","呼呼"};
    private List<TextView> views;
    private ViewPager vg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vg = findViewById(R.id.vg);
        TabPageIndicator tab_pager = findViewById(R.id.tab_pager);
        initVg();

        tab_pager.setViewPager(vg);//把indicator和viewPager联系在一起
    }

    private void initVg() {
        views = new ArrayList<>();
        for (String title : titles) {
            TextView tv=new TextView(this);
            tv.setText(title);
            tv.setTextSize(15);
            tv.setTextColor(Color.RED);
            tv.setGravity(Gravity.CENTER);
            views.add(tv);
        }
        vg.setAdapter(new MyViewPager());
    }


    private class MyViewPager extends PagerAdapter {
        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public int getCount() {
            return views.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {

            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = views.get(position);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
           // super.destroyItem(container, position, object);
            container.removeView((View)object);
        }
    }
}
