package com.jamc0011.proyectocoursera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnEnviar;
    private EditText ediNombre, ediTelefono, ediFecha,ediEmail,ediContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        ediNombre = (EditText) findViewById(R.id.edi_nombre);
        ediFecha = (EditText) findViewById(R.id.edi_fecha);
        ediTelefono = (EditText) findViewById( R.id.edi_telefono );
        ediEmail = (EditText) findViewById( R.id.edi_email);
        ediContacto= (EditText) findViewById( R.id.edi_conctado );

        btnEnviar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent explicit_intent;//Declaro el Intent

        //Instanciamos el Intent dandole:
        // el contexto y la clase a la cual nos deseamos dirigir
        explicit_intent = new Intent(this, Main2Activity.class);
        String auxEdiNombre = ediNombre.getText().toString();
        String auxEdiFecha = ediFecha.getText().toString();
        String auxEdiTelefono = ediTelefono.getText().toString();
        String auxEdiEmail= ediEmail.getText().toString();
        String auxEdiContacto= ediContacto.getText().toString();

        explicit_intent.putExtra("nombre", auxEdiNombre);//Guardamos una cadena
        explicit_intent.putExtra("fecha", auxEdiFecha);//Guardamos un entero
        explicit_intent.putExtra("telefono", auxEdiTelefono);//Guardamos un entero
        explicit_intent.putExtra("email", auxEdiEmail);//Guardamos un entero
        explicit_intent.putExtra("contacto", auxEdiContacto);//Guardamos un entero
        
        //lo iniciamos pasandole la intencion, con todos sus parametros guardados
        startActivity(explicit_intent);
    }
}