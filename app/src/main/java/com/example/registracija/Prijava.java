package com.example.registracija;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public   class Prijava extends AppCompatActivity {
    private EditText etIme;
    private EditText etPrezime;
    private EditText etSifra;
    private EditText etJMBG;
    private Button btnAdd;
    private Button btnCancel;

    private  ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prijava);

        etIme = (EditText) findViewById(R.id.editTextIme);
        etPrezime = (EditText) findViewById(R.id.editTextPrezime);
        etSifra = (EditText) findViewById(R.id.editTextSifra);
        etJMBG = (EditText) findViewById(R.id.editTextJMBG);
        btnAdd = (Button) findViewById(R.id.buttonPrijaviMe);
        btnCancel = (Button) findViewById(R.id.buttonOdustani);

        adapter = new ListAdapter(ArrayLista.getitems());

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String ime = etIme.getText().toString();
              String prezime = etPrezime.getText().toString();
              String sifra = etSifra.getText().toString();
              String jmbg = etJMBG.getText().toString();



              Item item = new Item();
              item.setIme(ime);
              item.setPrezime(prezime);
              item.setJmbg(jmbg);

              adapter.add(item);
              finish();



            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public ListAdapter getAdapter(){
        return  this.adapter;
    }
}
