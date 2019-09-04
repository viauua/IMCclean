package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    float peso;
    float altura;
    float imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.imageView);
        img.setImageResource(R.drawable.perfil);

    }

    public void Calcular(View view) {
        final EditText p = (EditText) findViewById(R.id.Peso);
        final EditText a = (EditText) findViewById(R.id.Altura);
        final TextView resultado = (TextView) findViewById(R.id.Resultado);
        altura = Float.parseFloat(a.getText().toString());
        peso = Float.parseFloat(p.getText().toString());
        imc = (peso) / ((altura/100)* (altura/100));

        if (imc <18.5){
            resultado.setText(Float.toString(imc));
            ImageView img1= findViewById(R.id.imageView);
            img1.setImageResource(R.drawable.abaixopeso);

        }

        if (imc >= 18.6 && imc<25){
            resultado.setText(Float.toString(imc));
            ImageView img2= findViewById(R.id.imageView);
            img2.setImageResource(R.drawable.normal);
        }

        if (imc >=25 && imc <30){
            resultado.setText(Float.toString(imc));

            ImageView img3= findViewById(R.id.imageView);
            img3.setImageResource(R.drawable.sobrepeso);
        }

        if (imc >=30 && imc <35){
            resultado.setText(Float.toString(imc));
            ImageView img4= findViewById(R.id.imageView);
            img4.setImageResource(R.drawable.obesidade1);
        }

        if (imc >=35 && imc < 40){
            resultado.setText(Float.toString(imc));
            ImageView img5= findViewById(R.id.imageView);
            img5.setImageResource(R.drawable.obesidade2);
        }

        if (imc >=40) {
            resultado.setText(Float.toString(imc));
            ImageView img6= findViewById(R.id.imageView);
            img6.setImageResource(R.drawable.obesidade3);
        }

    }


}

