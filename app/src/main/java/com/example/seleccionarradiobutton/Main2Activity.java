package com.example.seleccionarradiobutton;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private String opcion;
    private Spinner spn;
    private ArrayAdapter<String> dataAdapter;
    private ArrayAdapter<String> dataAdapter2;
    private Button btAcumular;
    private float acumulado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initComponents();
        additem();
        //listenerSpinner();

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Log.v("xvy",opcion);
    }

    private void initComponents() {
        Intent intent = new Intent();
        intent = getIntent();
        opcion = intent.getStringExtra("opcion");

        spn = findViewById(R.id.spn);
        btAcumular = findViewById(R.id.btAcumular);
    }

    private void listenerSpinner() {
        btAcumular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("cvv",spn.getSelectedItem().toString());
                Log.v("cvv1",spn.getSelectedItemPosition() + "");
                acumulado =
            }
        });
    }


    private void additem() {
        Resources res = getResources();

        String[] lacteos = res.getStringArray(R.array.Lacteos);
        String[] carne = res.getStringArray(R.array.Carne);
        String[] pescado = res.getStringArray(R.array.Pescado);
        String[] verdura = res.getStringArray(R.array.Verdura);

        String[] lacteosPrecio = res.getStringArray(R.array.LacteosPrecio);
        String[] carnePrecio = res.getStringArray(R.array.CarnePrecio);
        String[] pescadoPrecio = res.getStringArray(R.array.PescadoPrecio);
        String[] verduraPrecio = res.getStringArray(R.array.VerduraPrecio);

        switch (opcion){
            case "1":
                dataAdapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, lacteos);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spn.setAdapter(dataAdapter);
                listenerSpinner();
                break;
            case "2":
                dataAdapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, carne);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spn.setAdapter(dataAdapter);
                listenerSpinner();
                break;
            case "3":
                dataAdapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, pescado);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spn.setAdapter(dataAdapter);
                listenerSpinner();
                break;
            case "4":
                dataAdapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, verdura);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spn.setAdapter(dataAdapter);
                listenerSpinner();
                break;

        }


    }

}
