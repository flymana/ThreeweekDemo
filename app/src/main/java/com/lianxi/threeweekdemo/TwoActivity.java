package com.lianxi.threeweekdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TwoActivity extends AppCompatActivity {


    private RecyclerView Recyclerview;
    private List<Bean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        initView();
        initData();
        initAdapter();


    }

    private void initAdapter() {
        RecyclerviewAapter adapter=new RecyclerviewAapter(this,list);
        Recyclerview.setLayoutManager(new LinearLayoutManager(this));
        Recyclerview.setAdapter(adapter);
    }

    private void initData() {
        list = new ArrayList<>();
        list.add(new Bean("http://p0.so.qhmsg.com/bdr/326__/t01e27c9ed6e4e0da15.jpg","21658","546546"));
        list.add(new Bean("http://p0.so.qhmsg.com/bdr/326__/t01e27c9ed6e4e0da15.jpg","21658","546546"));
        list.add(new Bean("http://p0.so.qhmsg.com/bdr/326__/t01e27c9ed6e4e0da15.jpg","21658","546546"));
    }

    private void initView() {
        Recyclerview = (RecyclerView) findViewById(R.id.Recyclerview);

    }
}
