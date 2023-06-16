package Exercicio2_CA;

public class Circulo extends Forma {

    private float raio;
    private static final double PI = Math.PI;

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        // TODO Auto-generated method stub
        //A área é igual ao pi multiplicado por (r ao quadrado).
        double retorno = PI * Math.pow(raio, 2); // (raio * raio);
        return (float)retorno;
    }

    @Override
    public float calcularPerimetro() {
        // TODO Auto-generated method stub
        //P = 2 π R
        double retorno = 2*PI * raio;
        return  (float)retorno;
    }

    public String nome(){
        return "Circulo ";
    }

}