package com.hfad.peretzz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context context;
    ArrayList<MainActivity> models; //этот массив создает список массива, параметрами которые являются наш класс Model


    public MyAdapter(Context context, ArrayList<MainActivity> models){
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.mTitle.setText(models.get(position).getTitl());
        holder.mDes.setText(models.get(position).getDesc());
        holder.mImageView.setImageResource(Integer.parseInt(models.get(position).getImg()));
        holder.mPrice.setText(models.get(position).getPric());



    }

    @Override
    public int getItemCount() {
        return (null != models ? models.size() : 0 );
    }
}
