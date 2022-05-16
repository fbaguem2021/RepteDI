package com.example.reptedi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PerformanceAdapter extends ArrayAdapter {
    private Performance[] performances;

    public PerformanceAdapter(Context context, Performance[] performances) {
        super(context, R.layout.performance_item, performances);
        this.performances = performances;
    }

    @Override
    public View getView(int i, View v, ViewGroup parent) {
        View item = LayoutInflater
                .from(getContext())
                .inflate(R.layout.performance_item, parent, false);

        ImageView ivImage = item.findViewById(R.id.ivPerformanceImage);
        TextView lblName = item.findViewById(R.id.lblPerformanceName);

        ivImage.setImageResource(performances[i].image);
        lblName.setText(performances[i].name);

        return item;
    }
}
