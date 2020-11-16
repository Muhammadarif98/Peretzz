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
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity{
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    int cl;
    private ArrayList<Post> posts =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerViews);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //myAdapter.updateValue(myAdapter.getValue());

        NetworkService.getInstance()
                .getJsonApi()
                .getPost()
                .enqueue(new Callback<List<Post>>() {
                    @Override
                    public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                        if (response.isSuccessful() && response.body()!=null){
                            posts = new ArrayList<>(response.body());
                            myAdapter=new MyAdapter(MainActivity.this, posts);
                            mRecyclerView.setAdapter(myAdapter);
                        }
                        Log.d("TAG2", "onResponse"+ (response.body()));
                    }

                    @Override
                    public void onFailure(Call<List<Post>> call, Throwable throwable) {
                        Log.d("TAG", "Response Failure =" + throwable.toString());
                        Toast.makeText(MainActivity.this,"Упс! Что то пошло не так", Toast.LENGTH_SHORT).show();
                    }
                });

    }

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