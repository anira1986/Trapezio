/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */



package br.edu.fateczl.trapezio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declarando os campos EditText e TextView
    private EditText etBaseMaior;
    private EditText etBaseMenor;
    private EditText etAltura;
    private TextView tvArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializando os campos com os elementos da interface
        etBaseMaior = findViewById(R.id.etBaseMaior);
        etBaseMenor = findViewById(R.id.etBaseMenor);
        etAltura = findViewById(R.id.etAltura);
        tvArea = findViewById(R.id.tvArea);
        Button btnCalc = findViewById(R.id.btnCalc);

        // Configurando o botão de cálculo
        btnCalc.setOnClickListener(op -> calcArea());
    }

    // Método para calcular a área do trapézio
    private void calcArea() {
        // Pegando os valores dos campos e convertendo para inteiros
        int baseMaior = Integer.parseInt(etBaseMaior.getText().toString());
        int baseMenor = Integer.parseInt(etBaseMenor.getText().toString());
        int altura = Integer.parseInt(etAltura.getText().toString());

        // Calculando a área do trapézio
        int area = ((baseMaior + baseMenor) * altura) / 2;

        // Exibindo o resultado no TextView
        String resultado = getString(R.string.area) + " " + area;
        tvArea.setText(resultado);
    }
}
