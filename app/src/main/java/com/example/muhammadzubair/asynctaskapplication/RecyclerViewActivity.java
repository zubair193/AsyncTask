package com.example.muhammadzubair.asynctaskapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    ArrayList<ApiInfo> data_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);


        Bundle bundle = getIntent().getExtras();
        data_info = (ArrayList<ApiInfo>) bundle.getSerializable("data");

        Log.d("Size",String.valueOf(data_info.size()));


        RecyclerView my_rcview = (RecyclerView) findViewById(R.id.recyclerview_id);
        MyAdapter madapter = new MyAdapter(data_info);
        my_rcview.setLayoutManager(new LinearLayoutManager(this));
        my_rcview.setAdapter(madapter);

    }


}
