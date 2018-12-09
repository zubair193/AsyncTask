package com.example.muhammadzubair.asynctaskapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    ArrayList<ApiInfo> data ;
    public MyAdapter(ArrayList<ApiInfo> data){
        this.data = data;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.list_view_layout, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myvieholder, int i) {
        //myvieholder.userId.setText(data.get(i).getUserId());
        myvieholder.id.setText(data.get(i).getId());
        myvieholder.title.setText(data.get(i).getTitle());
        //String title = data[i];
        //myvieholder.userId.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        //TextView userId;
        TextView id;
        TextView title;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //userId = (TextView) itemView.findViewById(R.id.userId);
            id = (TextView) itemView.findViewById(R.id.Id);
            title = (TextView) itemView.findViewById(R.id.title1);
        }
    }
}
