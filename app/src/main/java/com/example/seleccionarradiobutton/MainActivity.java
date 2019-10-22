package com.example.seleccionarradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rbgroup;
    private RadioButton rbt1;
    private RadioButton rbt2;
    private RadioButton rbt3;
    private RadioButton rbt4;
    private Button btAceptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        initMethot();

    }

    private void initComponents() {
        rbgroup = findViewById(R.id.rbgroup);
        btAceptar = findViewById(R.id.btAceptar);

    }

    private void initMethot() {

        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbgroup.getCheckedRadioButtonId() == -1) {
                    // no radio buttons are checked

                } else {
                    // one of the radio buttons is checked
                    Log.v("xxx",rbgroup.getCheckedRadioButtonId()+"");

                    //1-2131165315
                    //2-2131165309
                    //3-2131165310
                    //4-2131165311

                    switch (rbgroup.getCheckedRadioButtonId()){
                        case 2131165315:
                            break;
                        case 2131165309:
                            break;
                        case 2131165310:
                            break;
                        case 2131165311:
                            break;
                    }
                }
            }
        });
    }
}
