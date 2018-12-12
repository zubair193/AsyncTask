package com.example.muhammadzubair.asynctaskapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayInfoActivity extends AppCompatActivity {

    private TextView userId,id,title,body;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        userId = findViewById(R.id.inputuid);
        id = findViewById(R.id.inputid);
        title = findViewById(R.id.inputtitle);
        body = findViewById(R.id.inputbody);

        Intent intent = getIntent();
        String u_id = intent.getExtras().getString("u_id");
        String id1 = intent.getExtras().getString("id");
        String title1 = intent.getExtras().getString("title");
        String body1 = intent.getExtras().getString("body");

        userId.setText(u_id);
        id.setText(id1);
        title.setText(title1);
        body.setText(body1);
    }
}
