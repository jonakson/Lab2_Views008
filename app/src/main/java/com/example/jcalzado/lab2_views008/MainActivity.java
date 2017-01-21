package com.example.jcalzado.lab2_views008;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inPass = (EditText) findViewById(R.id.inPass);
    }

    public void login (View v) {
        if (inPass.getText().toString().length() == 0) {
            Toast.makeText(this, "El campo Contraseña no puede quedar vacío.", Toast.LENGTH_LONG).show();
        }
    }
}
