package com.example.fede.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Modelo modelo = new Modelo();
        Vista vista = new Vista(this);
        Controlador controlador = new Controlador(vista, modelo);
        MyListener myListener = new MyListener(vista, controlador);
        vista.SetearListener(myListener);


    }
}
