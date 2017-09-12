package com.lianxi.threeweekdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.hintview.TextHintView;

public class ThreeActivity extends AppCompatActivity {

    private RollPagerView rollviewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        initView();


    }

    private void initView() {
        rollviewpager = (RollPagerView) findViewById(R.id.rollviewpager);
        rollviewpager.setPlayDelay(2000);
        rollviewpager.setAnimationDurtion(100);
        rollviewpager.setAdapter(new Rollviewpageradapter());
        rollviewpager.setHintView(new TextHintView(this));
    }
}
