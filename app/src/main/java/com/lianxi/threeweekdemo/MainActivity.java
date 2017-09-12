package com.lianxi.threeweekdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private TextView Tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Timer t1 = new Timer();
        t1.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent int1=new Intent(MainActivity.this,TwoActivity.class);
                startActivity(int1);
                finish();
            }
        }, 3000);

    }

    private void initView() {
        Tv1 = (TextView) findViewById(R.id.Tv1);
    }
}
