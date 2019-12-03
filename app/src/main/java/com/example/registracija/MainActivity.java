package com.example.registracija;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnPrijava, btnLogovanje, btnLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrijava = (Button) findViewById(R.id.buttonRegistracija);
        btnLogovanje = (Button) findViewById(R.id.buttonLogovanje);
        btnLista = (Button) findViewById(R.id.buttonLista);

        btnPrijava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Prijava.class);
                startActivity(intent);
            }
        });

        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lista.class);
                startActivity(intent);
            }
        });

        btnLogovanje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Logovanje.class);
                startActivity(intent);
            }
        });
    }
}
