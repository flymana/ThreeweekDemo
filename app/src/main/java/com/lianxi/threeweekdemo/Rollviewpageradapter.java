package com.lianxi.threeweekdemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jude.rollviewpager.adapter.StaticPagerAdapter;

public class Rollviewpageradapter extends StaticPagerAdapter{
    private int [] imas={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher
    };

    @Override
    public View getView(ViewGroup container, int position) {
        ImageView image=new ImageView(container.getContext());
        image.setImageResource(imas[position]);
        image.setScaleType(ImageView.ScaleType.FIT_XY);
        return image;
    }

    @Override
    public int getCount() {

        return imas.length;
    }
}
