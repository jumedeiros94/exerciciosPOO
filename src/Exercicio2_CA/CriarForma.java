package Exercicio2_CA;

import java.util.ArrayList;
public class CriarForma {

    public static void main(String[] args) {


        ArrayList<Forma> formas = new ArrayList<Forma>();

        Retangulo retangulo = new Retangulo(3,5);
        formas.add(retangulo);
        Circulo circulo = new Circulo(3);
        formas.add(circulo);
        Quadrado quadrado = new Quadrado(3);
        formas.add(quadrado);


        // Lista toda as formas
        for (Forma forma : formas){
            // Descobrindo a classe de um objeto
           if(forma instanceof Retangulo) {
                System.out.println("Retangulo Area: "+ forma.calcularArea()+ " Perimetro: " + forma.calcularPerimetro());
            }
            if(forma instanceof Circulo) {
                System.out.println("Circulo Area: "+ forma.calcularArea()+ " Perimetro: " + forma.calcularPerimetro());
            }
            if(forma instanceof Quadrado) {
                System.out.println("Quadrado Area: "+ forma.calcularArea()+ " Perimetro: " + forma.calcularPerimetro());
            }

            System.out.println(forma.toString());
        }

    }

}

