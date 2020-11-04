package com.hfad.peretzz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerViews);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

    }

    private ArrayList<Model> getMyList() {
        ArrayList<Model> models = new ArrayList<>();
        Model m = new Model();
        m.setTitle("News Feed");
        m.setDescription("This is new feed description..");
        m.setImg(R.drawable.ic_launcher_background);
        models.add(m);

        m = new Model();
        m.setTitle("Peretz");
        m.setDescription("This is new feed peretz..");
        m.setImg(R.drawable.ic_launcher_background);
        models.add(m);

        return models;
    }
}