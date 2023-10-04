package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button BTAceptar =(Button) findViewById(R.id.BTAceptar);
        BTAceptar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                @SuppressLint("WrongViewCast") EditText ETPaisaje= (EditText) findViewById(R.id.ETPaisaje);
                String StPaisaje=ETPaisaje.getText().toString();
            }



        });
        Intent sIntent = new Intent(Inicio.this, AResultado);
        sIntent.putExtra("STPaisaje", StPaisaje);
        startActivities(sIntent);



    }
}