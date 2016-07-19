package com.jamc0011.proyectocoursera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView etiNombre,etiTelefono,etiFecha,etiEmail,etiContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etiNombre = (TextView) findViewById( R.id.eti_nombreA );
        etiFecha = (TextView) findViewById( R.id.eti_fechaA );
        etiTelefono = (TextView) findViewById( R.id.eti_telefonoA );
        etiEmail = (TextView) findViewById( R.id.eti_emailA);
        etiContacto= (TextView) findViewById( R.id.eti_contactoA );

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {//ver si contiene datos
            String datoNombre=(String)extras.get("nombre");//Obtengo el nombre
            String datoFecha= (String) extras.get("fecha");//Obtengo la fecha
            String datoTelefono=(String)extras.get("telefono");//Obtengo el telefono
            String datoEmail= (String) extras.get("email");//Obtengo la email
            String datoContacto=(String)extras.get("contacto");//Obtengo el contacto


            etiNombre.setText(datoNombre);
            etiFecha.setText(datoFecha);
            etiTelefono.setText(datoTelefono);
            etiEmail.setText(datoEmail);
            etiContacto.setText(datoContacto);

        }
    }
    public void salir(View v) {
        finish();
    }
}