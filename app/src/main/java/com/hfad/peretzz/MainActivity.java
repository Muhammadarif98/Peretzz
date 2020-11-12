package com.hfad.peretzz;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    private String title, descr;
    private Integer pric;
    private String img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerViews);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        NetworkService.getInstance()
                .getJsonApi()
                .getPost()
                .enqueue(new Callback<List<Post>>() {
                    @Override
                    public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                        Post post = new Post();
                        response.body().size();
                        setTitle(post.getName() + "\n");
                        setDesc(post.getDescription() + "\n");
                        setImg(post.getImage());
                        setPric(post.getPrice());

                        Log.d("TAG2", "onResponse"+ (response.body()));
                    }

                    @Override
                    public void onFailure(Call<List<Post>> call, Throwable throwable) {
                        Log.d("TAG", "Response Failure =" + throwable.toString());
                    }


                });


    }

    public String getTitl() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return descr;
    }

    public void setDesc(String desc) {
        this.descr = descr;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getPric() {
        return pric;
    }

    public void setPric(Integer pric) {
        this.pric = pric;
    }

     private ArrayList<MainActivity> getMyList() {
       ArrayList<MainActivity> models = new ArrayList<>();
        MainActivity m = new MainActivity();/*
        m.setTitle("This is Title");
        m.setDescription("This is new description..");
        m.setPrice("400 ₽");
        m.setImg(R.drawable.ic_launcher_background);
        models.add(m);*/


        return models;}

   @Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return super.onCreateOptionsMenu(menu);
}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search_product:
                //Код, выполняемый при выборе элемента SearchActivity
                Intent intent = new Intent(this, SearchActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}