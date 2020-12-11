package com.hfad.peretzz;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;



public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mImageView;
    TextView mTitle,mDes,mPrice;
    TextView mColichestvo;
    Button tPlus,tMinus;
    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.imageIv);
        this.mTitle = itemView.findViewById(R.id.titleTv);
        this.mDes = itemView.findViewById(R.id.descriptionTv);
        this.mPrice = itemView.findViewById(R.id.priceTv);
        this.mColichestvo = itemView.findViewById(R.id.colichestvo);
        this.tPlus = itemView.findViewById(R.id.plus);
        this.tMinus = itemView.findViewById(R.id.minus);

    }

    public void bind(Post models,MyAdapter adapter){
        mTitle.setText(models.getName());
        mDes.setText(models.getDescription());
        Picasso.get().load(models.getImage()).fit().into(mImageView);
        mPrice.setText(models.getPrice());
        String id = models.getId();
        adapter.updateValue(MyHolder.this,adapter.getValue(id),id);
        tPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMinus.setVisibility(View.VISIBLE);
                mColichestvo.setVisibility(View.VISIBLE);
                adapter.updateValue(MyHolder.this,adapter.getValue(id) + 1,id);
            }
        });
        tMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.updateValue(MyHolder.this,adapter.getValue(id)-1,id);
            }
        });
    }


}
