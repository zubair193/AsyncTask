package com.example.muhammadzubair.asynctaskapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    ArrayList<ApiInfo> data ;
    private Context mContext;

    public MyAdapter(Context mContext, ArrayList<ApiInfo> data){
        this.mContext = mContext;
        this.data = data;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_view_layout, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myvieholder, final int i) {
        myvieholder.userId.setText(data.get(i).getUserId());
        myvieholder.id.setText(data.get(i).getId());
        myvieholder.title.setText(data.get(i).getTitle());
        //String title = data[i];
        //myvieholder.userId.setText(title);
        myvieholder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DisplayInfoActivity.class);

                intent.putExtra("u_id", data.get(i).getUserId());
                intent.putExtra("id", data.get(i).getId());
                intent.putExtra("title", data.get(i).getTitle());
                intent.putExtra("body", data.get(i).getBody());

                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView userId;
        TextView id;
        TextView title;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            userId = (TextView) itemView.findViewById(R.id.inputuid);
            id = (TextView) itemView.findViewById(R.id.inputid);
            title = (TextView) itemView.findViewById(R.id.inputtitle);
        }
    }
}
