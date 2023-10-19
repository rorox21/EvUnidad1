package com.example.evunidad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.BlockingDeque;

public class MainActivity extends AppCompatActivity {

    EditText costo;
    EditText total;
    Button boton;
    Button limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        costo = findViewById(R.id.txt_costo);
        total = findViewById(R.id.txt_totalH);
        boton = findViewById(R.id.btn_calcular);
        limpiar = findViewById(R.id.btn_limpiar);

        boton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                String val1=costo.getText().toString();
                String val2=total.getText().toString();
                int num1=Integer.parseInt(val1);
                int num2=Integer.parseInt(val2);
                int op=(num1*num2);

                String resultado = String.valueOf(op);
                Intent intent = new Intent(getApplicationContext(),SecondScreen.class);
                intent.putExtra("mensaje", resultado.toString());
                startActivity(intent);
            }
        });
        limpiar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                costo.setText("");
                total.setText("");
            }
        });
    }
}
