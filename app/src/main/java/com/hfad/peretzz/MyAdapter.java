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
    ArrayList<Post> models; //этот массив создает список массива, параметрами которые являются наш класс Model


    public MyAdapter(Context context, ArrayList<Post> models){
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

        holder.mTitle.setText(models.get(position).getName());
        holder.mDes.setText(models.get(position).getDescription());
        holder.mImageView.setImageResource(Integer.parseInt(models.get(position).getImage()));
        holder.mPrice.setText(models.get(position).getPrice());



    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
