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
            return "Demasiado delgado/a";

        } else if (valor >= 18.5 && valor < 25) {
            return "Normal";

        } else if (valor >= 25 && valor < 30) {
            return "Ligero sobrepeso";

        } else {
            return "Sobrepeso";
        }
    }
}
