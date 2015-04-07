package lp4.untref.edu.ar.imccalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import modelos.IMC;

public class MainActivity extends Activity {

    private EditText peso;
    private EditText altura;
    private IMC imc;
    private double resultado;
    private String indice;

    private Button bCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCalcular = (Button) findViewById(R.id.botonCalcular);
        peso = (EditText) findViewById(R.id.campo_peso);
        altura = (EditText) findViewById(R.id.campo_altura);
        imc = new IMC();

        calcularImc();

    }

    @Override
    protected void onResume() {
        super.onResume();

        peso.setText("");
        altura.setText("");
    }

    private void irResultado() {

        Intent i = new Intent(this, ResultadoActivity.class);

        i.putExtra("Indice", indice);
        i.putExtra("Resultado", resultado);
        startActivity(i);
    }

    public void calcularImc() {

        bCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (peso.getText().toString().equals("")
                        || altura.getText().toString().equals("")) {

                    Toast.makeText(getApplicationContext(), "Campos incompletos", Toast.LENGTH_SHORT).show();

                } else {

                    double masa = Double.valueOf(peso.getText().toString());
                    double alt = Double.valueOf(altura.getText().toString());
                    resultado = imc.calcularIMC(masa, alt);
                    indice = imc.getIndice(resultado);
                    irResultado();
                }
            }
        });
    }

}
