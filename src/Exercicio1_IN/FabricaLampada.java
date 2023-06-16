package Exercicio1_IN;

public class FabricaLampada {
    public Lampada construir(String tipoDeLampada) {
        if (tipoDeLampada.equalsIgnoreCase("incandescente")) {
            return new Incandescente();
        } else if (tipoDeLampada.equalsIgnoreCase("fluorescente")) {
            return new Fluorescente();
        } else {
           System.out.println("Tipo de lâmpada inválido.");
        }
        return construir(tipoDeLampada);
    }
}