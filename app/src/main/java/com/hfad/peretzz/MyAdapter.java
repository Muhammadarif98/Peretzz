package com.hfad.peretzz;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
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
    SharedPreferences mPrefs;;
    private static String PREF_VAL ;

    public MyAdapter(Context context, ArrayList<Post> models){
        this.context = context;
        this.models = models;
        mPrefs = PreferenceManager.getDefaultSharedPreferences(context);

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        PREF_VAL = models.get(position).getId();
        holder.mTitle.setText(models.get(position).getName());
        holder.mDes.setText(models.get(position).getDescription());
        Picasso.get().load(models.get(position).getImage()).fit().into(holder.mImageView);
        holder.mPrice.setText(models.get(position).getPrice());
        holder.tPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateValue(holder,getValue() + 1);
                // holder.cl++;
                // holder.mColichestvo.setText(holder.cl + "");
            }
        });
        holder.tMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateValue(holder,getValue() - 1);
                //holder.cl--;
                //holder.mColichestvo.setText(holder.cl + "");
            }
        });



    }
    public void updateValue(MyHolder holder ,int newValue){
        mPrefs.edit().putInt(PREF_VAL, newValue).apply();
        holder.mColichestvo.setText(String.valueOf(newValue));
    }
    public int getValue(){
        return mPrefs.getInt(PREF_VAL,0);
    }


    @Override
    public int getItemCount() {
        return models.size();
    }
}
