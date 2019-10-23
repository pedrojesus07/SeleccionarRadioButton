package com.example.seleccionarradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        final Intent intent = new Intent(this, Main2Activity.class);


        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbgroup.getCheckedRadioButtonId() == -1) {
                    // no radio buttons are checked

                } else {
                    // one of the radio buttons is checked

                    rbt1 = (RadioButton) findViewById(rbgroup.getCheckedRadioButtonId());
                    Log.v("xxx",rbt1.getText()+"");

                    switch (rbt1.getText().toString()){
                        case "Lacteos":
                            intent.putExtra("opcion", "1");
                            startActivity(intent);
                            break;
                        case "Carne":
                            intent.putExtra("opcion", "2");
                            startActivity(intent);
                            break;
                        case "Pescado":
                            intent.putExtra("opcion", "3");
                            startActivity(intent);
                            break;
                        case "Verdura":
                            intent.putExtra("opcion", "4");
                            startActivity(intent);
                            break;
                    }
                }
            }
        });
    }
}
