package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.calculadora.R.id.boton_cero;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    // Variables
    private String numero = "";
    private double numero1 = 0;
    private double numero2 = 0;
    private String Symbol = "";
    private TextView resultado;
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private Button b_suma, b_resta, b_multip, b_division, b_igual, b_limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.solucion);

        // LLamar Botones (Numeros)
        b0 = findViewById(boton_cero);
        b1 = findViewById(R.id.boton_uno);
        b2 = findViewById(R.id.boton_dos);
        b3 = findViewById(R.id.boton_tres);
        b4 = findViewById(R.id.boton_cuatro);
        b5 = findViewById(R.id.boton_cinco);
        b6 = findViewById(R.id.boton_seis);
        b7 = findViewById(R.id.boton_siete);
        b8 = findViewById(R.id.boton_ocho);
        b9 = findViewById(R.id.boton_nueve);

        // LLamar Botones (Simbolos)
        b_suma = findViewById(R.id.boton_suma);
        b_resta = findViewById(R.id.boton_resta);
        b_multip = findViewById(R.id.boton_multiplicacion);
        b_division = findViewById(R.id.boton_division);
        b_igual = findViewById(R.id.boton_igual);
        b_limpiar = findViewById(R.id.boton_limpiar);

        // Escuchar El Click (Numeros)
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        // Escuchar El Click (Simbolos)
        b_suma.setOnClickListener(this);
        b_resta.setOnClickListener(this);
        b_multip.setOnClickListener(this);
        b_division.setOnClickListener(this);
        b_igual.setOnClickListener(this);
        b_limpiar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.boton_cero:
                numero = numero + "0";
                resultado.setText(numero);
                break;
            case R.id.boton_uno:
                numero = numero + "1";
                resultado.setText(numero);
                break;
            case R.id.boton_dos:
                numero = numero + "2";
                resultado.setText(numero);
                break;
            case R.id.boton_tres:
                numero = numero + "3";
                resultado.setText(numero);
                break;
            case R.id.boton_cuatro:
                numero = numero + "4";
                resultado.setText(numero);
                break;
            case R.id.boton_cinco:
                numero = numero + "5";
                resultado.setText(numero);
                break;
            case R.id.boton_seis:
                numero = numero + "6";
                resultado.setText(numero);
                break;
            case R.id.boton_siete:
                numero = numero + "7";
                resultado.setText(numero);
                break;
            case R.id.boton_ocho:
                numero = numero + "8";
                resultado.setText(numero);
                break;
            case R.id.boton_nueve:
                numero = numero + "9";
                resultado.setText(numero);
                break;
            case R.id.boton_suma:
                Symbol = "+";
                numero1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.boton_resta:
                Symbol = "-";
                numero1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.boton_multiplicacion:
                Symbol = "X";
                numero1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.boton_division:
                Symbol = "/";
                numero1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.boton_limpiar:
                Symbol = "c";
                numero1 = 0;
                numero2 = 0;
                numero = "";
                resultado.setText("");
                break;

            case R.id.boton_igual:
                numero2 = Integer.parseInt(numero);

                switch (Symbol) {
                    case "+":
                        resultado.setText("resultado: " + (numero1 + numero2));
                        break;
                    case "-":
                        resultado.setText("resultado: " + (numero1 - numero2));
                        break;
                    case "X":
                        resultado.setText("resultado: " + (numero1 * numero2));
                        break;
                    case "/":
                        resultado.setText("resultado: " + (numero1 / numero2));
                        break;

                }

                numero1 = 0;
                numero2 = 0;
                numero = "";


             break;
        }
    }
}