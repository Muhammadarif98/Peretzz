package com.hfad.peretzz;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

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

    public void bind(ArrayList<Post> models){

    }


}
