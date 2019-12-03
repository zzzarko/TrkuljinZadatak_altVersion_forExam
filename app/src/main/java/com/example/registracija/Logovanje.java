package com.example.registracija;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class Logovanje extends AppCompatActivity {

    private EditText etName;
    private EditText etPW;
    private Button btnLog;

    private boolean ima;

    public Logovanje(){
        this.ima = false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logovanje);

        etName = (EditText) findViewById(R.id.editTextEnterName);
        etPW = (EditText) findViewById(R.id.editTextEnterPW);
        btnLog = (Button) findViewById(R.id.buttonLog);

        final List<Item> items = ArrayLista.getitems();

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String pw = etName.getText().toString();

                for(Item i:items){
                    if(i.getIme().equals(name)){
                        ima = true;
                    }
                }
                if(ima){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Uspesno registrovan",
                            Toast.LENGTH_SHORT);

                    toast.show();
                }
                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Greska",
                            Toast.LENGTH_SHORT);

                    toast.show();
                }

            }
        });


    }
}
