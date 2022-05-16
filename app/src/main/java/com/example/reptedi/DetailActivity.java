package com.example.reptedi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static boolean chairsActivityIsFinished = false;
    public static final String PERFORMANCE = "PERFORMANCE";

    ImageView ivSelected;
    TextView lblSelected;
    Button btnAccept;
    Button btnCancel;
    Performance performance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        initComponents();
        initValues(intent);
        initEvents();
    }

    void initComponents() {
        ivSelected = findViewById(R.id.ivSelectedImage);
        lblSelected = findViewById(R.id.lblSelectedName);
        btnAccept = findViewById(R.id.btnAccept);
        btnCancel = findViewById(R.id.btnCancel);

    }
    void initValues(Intent intent) {
        performance = (Performance) intent.getSerializableExtra(PERFORMANCE);
        ivSelected.setImageResource(performance.image);
        lblSelected.setText(performance.name);
    }
    void initEvents() {
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, ChairsActivity.class);
                intent.putExtra(PERFORMANCE, performance);
                startActivity(intent);
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        if (chairsActivityIsFinished) {
            DetailActivity.chairsActivityIsFinished = false;
            finish();
        }
    }
}