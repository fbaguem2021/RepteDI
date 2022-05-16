package com.example.reptedi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class PerformanceActivity extends AppCompatActivity {
    public static final String PERFORMANCE = "PERFORMANCE";

    ListView lstPerformances;
    PerformanceAdapter adapter;
    ImageView ivLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performance);

        final Performance[] performances = getPerformances();

        initComponents();
        initLists(performances);
        initEvents(performances);
    }
    void initComponents() {
        lstPerformances = findViewById(R.id.lstPerformances);
        ivLogout = findViewById(R.id.ivImageLogout);
    }
    void initLists(final Performance[] performances) {
        PerformanceAdapter adapter = new PerformanceAdapter(PerformanceActivity.this, performances);
        lstPerformances.setAdapter(adapter);
    }
    void initEvents(final Performance[] performances) {
        ivLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        lstPerformances.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Performance performance = performances[i];
                Intent intent = new Intent(PerformanceActivity.this, DetailActivity.class);
                intent.putExtra(PERFORMANCE, performance);
                startActivity(intent);
            }
        });
    }
    private Performance[] getPerformances() {
        return new Performance[] {
                new Performance(R.drawable.poster, "ej 1"),
                new Performance(R.drawable.poster, "ej 2"),
                new Performance(R.drawable.poster, "ej 3"),
                new Performance(R.drawable.poster, "ej 4"),
                new Performance(R.drawable.poster, "ej 5")
        };
    }
}