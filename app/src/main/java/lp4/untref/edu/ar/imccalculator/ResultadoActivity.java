package lp4.untref.edu.ar.imccalculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class ResultadoActivity extends Activity {

    private TextView imc;
    private TextView indice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imc = (TextView) findViewById(R.id.textoResultado);
        indice = (TextView) findViewById(R.id.textoIndice);


        Bundle extras = getIntent().getExtras();


        String resultado = extras.get("Resultado").toString().substring(0,5);
        String indiceIMC = extras.get("Indice").toString();


        imc.setText(resultado);
        indice.setText(indiceIMC);

    }
}
