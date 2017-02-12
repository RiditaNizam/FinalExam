package com.example.android.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.mrrobot.mycoolweather.R;

public class NavigationViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public NavigationViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.list_item_tv);
    }

    public void bind(int position) {
        textView.setText(String.valueOf(position));
    }
}