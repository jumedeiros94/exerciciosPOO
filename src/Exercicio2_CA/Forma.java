package Exercicio2_CA;

public abstract class Forma {

    // Metodo abstrato que sempre deve ser sobrescrito
    public abstract float calcularArea();

    // Metodo abstrato que sempre deve ser sobrescrito
    public abstract float calcularPerimetro();

    public String toString(){
        return this.nome()+ "Area: "+ this.calcularArea()+ " Perimetro: " + this.calcularPerimetro();
    }

    public abstract String nome();

}