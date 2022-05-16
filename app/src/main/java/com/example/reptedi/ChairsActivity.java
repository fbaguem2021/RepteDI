package com.example.reptedi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ChairsActivity extends AppCompatActivity {
    public static final String PERFORMANCE = "PERFORMANCE";

    TextView[] sillas = new TextView[9];
    TextView lblTitulo;
    Button btnComprar;
    boolean sillasSeleccionadas = false;
    Performance performance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chairs);

        Intent intent = getIntent();
        performance = (Performance) intent.getSerializableExtra(PERFORMANCE);

        initComponents();
        initSillasEvents();
        initButtonEvents();
    }

    void initComponents() {
        lblTitulo = findViewById(R.id.lblTitulo);
        lblTitulo.setText("Seleccione las sillas para el espectaculo "+performance.name);
        sillas[0] = findViewById(R.id.tv1);
        sillas[1] = findViewById(R.id.tv2);
        sillas[2] = findViewById(R.id.tv3);
        sillas[3] = findViewById(R.id.tv4);
        sillas[4] = findViewById(R.id.tv5);
        sillas[5] = findViewById(R.id.tv6);
        sillas[6] = findViewById(R.id.tv7);
        sillas[7] = findViewById(R.id.tv8);
        sillas[8] = findViewById(R.id.tv9);
        btnComprar = findViewById(R.id.btnComprar);
    }
    void initButtonEvents() {
        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sillasSeleccionadas) {
                    Toast.makeText(ChairsActivity.this, "Sillas Compradas correctamente", Toast.LENGTH_SHORT).show();
                    DetailActivity.chairsActivityIsFinished = true;
                    finish();
                }
            }
        });
    }
    void initSillasEvents() {
        sillas[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sillas[0].setBackgroundResource(R.drawable.border_teal);if (!sillasSeleccionadas) {
                    sillasSeleccionadas = true;
                }
            }
        });
        sillas[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sillas[1].setBackgroundResource(R.drawable.border_teal);if (!sillasSeleccionadas) {
                    sillasSeleccionadas = true;
                }
            }
        });
        sillas[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sillas[2].setBackgroundResource(R.drawable.border_teal);if (!sillasSeleccionadas) {
                    sillasSeleccionadas = true;
                }
            }
        });
        sillas[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sillas[3].setBackgroundResource(R.drawable.border_teal);if (!sillasSeleccionadas) {
                    sillasSeleccionadas = true;
                }
            }
        });
        sillas[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sillas[4].setBackgroundResource(R.drawable.border_teal);if (!sillasSeleccionadas) {
                    sillasSeleccionadas = true;
                }
            }
        });
        sillas[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sillas[5].setBackgroundResource(R.drawable.border_teal);if (!sillasSeleccionadas) {
                    sillasSeleccionadas = true;
                }
            }
        });
        sillas[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sillas[6].setBackgroundResource(R.drawable.border_teal);if (!sillasSeleccionadas) {
                    sillasSeleccionadas = true;
                }
            }
        });
        sillas[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sillas[7].setBackgroundResource(R.drawable.border_teal);if (!sillasSeleccionadas) {
                    sillasSeleccionadas = true;
                }
            }
        });
        sillas[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sillas[8].setBackgroundResource(R.drawable.border_teal);if (!sillasSeleccionadas) {
                    sillasSeleccionadas = true;
                }
            }
        });
    }
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        finish();
//    }
}