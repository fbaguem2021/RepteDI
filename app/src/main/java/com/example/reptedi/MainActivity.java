package com.example.reptedi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText    etUserName;
    EditText    etUserPassword;
    Button      btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        initEvents();
    }
    void initComponents() {
        etUserName = findViewById(R.id.etUserName);
        etUserPassword = findViewById(R.id.etUserPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }
    void initEvents() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etUserName.getText().toString().equals("") && !etUserPassword.getText().toString().equals("")) {
                    Intent intent = new Intent(v.getContext(), PerformanceActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Primero llena los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}