package com.lianxi.threeweekdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by dell on 2017/8/31.
 */

public class RecyclerviewAapter extends RecyclerView.Adapter<RecyclerviewAapter.Viewholder>{
    private Context con;
    private List<Bean> list;

    public RecyclerviewAapter(Context con, List<Bean> list) {
        this.con = con;
        this.list = list;
    }

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(con).inflate(R.layout.listview_item, null, false);
        RecyclerView.LayoutParams recy=new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT,RecyclerView.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(recy);
        Viewholder holder=new Viewholder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        Bean bean = list.get(position);
//        holder.image.setImageResource(bean.getImage());
        Glide.with(con).asBitmap().load(list.get(position).getImage().toString()).into(holder.image);
        holder.Text.setText(bean.getText());
        holder.text2.setText(bean.getText2());
        holder.v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2=new Intent(con,ThreeActivity.class);
                con.startActivity(int2);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView Text;
        TextView text2;
        View v;
        public Viewholder(View itemView) {
            super(itemView);
             v = itemView;
            image = (ImageView) itemView.findViewById(R.id.image1);
             Text = (TextView) itemView.findViewById(R.id.text1);
             text2 = (TextView) itemView.findViewById(R.id.text2);
        }
    }
}
