package com.example.eduardo.mimoneda3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by eduardo on 01/03/2016.
 */
public class Presupuesto extends AppCompatActivity {
    EditText txtFechaI,txtFechaF,txtMonto,txtComentario;
    Button btnGuar,btnLimp,btnAtr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presupuesto);

        txtFechaI=(EditText)findViewById(R.id.txtFechaInicial);
        txtFechaI=(EditText)findViewById(R.id.txtFechaFinal);
        txtMonto=(EditText)findViewById(R.id.txtMonto);
        txtComentario=(EditText)findViewById(R.id.txtComentario);
        btnGuar=(Button)findViewById(R.id.btnGuardar);
        btnLimp=(Button)findViewById(R.id.btnLimpiar);
        btnAtr=(Button)findViewById(R.id.btnRegresar);

        btnAtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        btnGuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // para guardar los ingresos diarios
            }
        });

        btnLimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // para limpiar los campos
            }
        });
    }
}
