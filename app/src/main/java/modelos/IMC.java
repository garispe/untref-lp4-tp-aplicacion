package modelos;

public class IMC {

    public double calcularIMC(double masa, double altura) {

        double imc = 0;

        if (masa > 0 && altura > 0) {

            imc = masa / Math.pow(altura / 100, 2);
        }

        return imc;
    }

    public String getIndice(Double valor) {

        if (valor < 18.5) {
            return "Se encuentra demasiado delgado/a. Su IMC debería estar entre 18.5 y 25.";

        } else if (valor >= 18.5 && valor < 25) {
            return "Se encuentra dentro de su peso ideal. Felicitaciones!";

        } else if (valor >= 25 && valor < 30) {
            return "Posee un ligero sobrepeso. Su IMC debería estar entre 18.5 y 25";

        } else {
            return "Se encuentra con sobrepeso. Su IMC debería estar entre 18.5 y 25";
        }
    }


}
