package com.example.evunidad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    TextView TextoRecibido;
    Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        TextoRecibido = findViewById(R.id.txt_resultado);
        volver = findViewById(R.id.btn_volver);
        String resultado = getIntent().getStringExtra("mensaje");
        TextoRecibido.setText(resultado);

        volver.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}