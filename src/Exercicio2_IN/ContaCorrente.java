package Exercicio2_IN;

public class ContaCorrente implements Tributavel{

    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double calcularTributos() {
        return saldo * 0.01;
    }
}