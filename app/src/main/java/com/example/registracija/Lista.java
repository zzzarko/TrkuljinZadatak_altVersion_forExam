package com.example.registracija;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Lista extends AppCompatActivity {
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);

        ListView listView = (ListView) findViewById(R.id.listView);
        List<Item> items = ArrayLista.getitems();

        adapter = new ListAdapter(items);

        listView.setAdapter(adapter);





    }

}
