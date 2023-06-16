package Exercicio1_IN;

import java.util.Scanner;


public class ControleLampada  {



        public static void main(String[] args) {
            FabricaLampada fabrica = new FabricaLampada();

            System.out.println("Qual tipo de lâmpada você deseja construir? (incandescente/fluorescente)");
            Scanner entrada = new Scanner(System.in);
            String ligarEdeligar = entrada.nextLine();

            Lampada lampada = fabrica.construir(ligarEdeligar);

            boolean sair = false;
            int controleDeLampada;

            do {
                System.out.println("Digite 1 para ligar a lâmpada");
                System.out.println("Digite 2 para desligar a lâmpada");
                System.out.println("Digite 3 para encerrar");
                controleDeLampada = entrada.nextInt();

                switch (controleDeLampada){
                    case 1:
                        lampada.ligar();
                        System.out.println("Lâmpada ligada!");
                        break;
                    case 2:
                        lampada.desligar();
                        System.out.println("Lâmpada desligada!");
                        break;
                    case 3:
                        sair = true;
                        System.out.println(" Programa encerrado, obrigado!");
                        break;
                    default:
                        System.out.printf("Número inválido!");
                }
            }while(!sair);
        }
}

