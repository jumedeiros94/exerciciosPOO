package Exercicio1_CA.Loja;
import Exercicio1_CA.Loja.DVDs;

import java.util.ArrayList;
import java.util.Scanner;



public class Loja {

    static int cod_Barras;

    //Método MAIN
    public static void main(String[] args) {

        //Criação do Array de produtos
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        //Cadastro de produtos
        CDs cd0 = new CDs(790756373);
        cd0.dados("Vivere - Greatest Hits", 58.90, 16);

        CDs cd1 = new CDs(453789654);
        cd1.dados("Believe (Deluxe)", 40.90, 17);

        DVDs dvd0 = new DVDs(986745326);
        dvd0.dados("De repente 30", 80.00, "1:38");

        Livros livro0 = new Livros(129854670);
        livro0.dados("Harry Potter e a pedra filosofal", 34.90, "J.K. Rowling");

        Livros livro1 = new Livros(678045673);
        livro1.dados("Harry Potter e a Câmara Secreta", 28.00, "J.K. Rowling");

        //Inclusão dos produtos na Arraylist
        produtos.add(cd0);
        produtos.add(cd1);
        produtos.add(dvd0);
        produtos.add(livro0);
        produtos.add(livro1);

        //Impressão dos produtos já cadastrados
        for (Produto produto : produtos){
            System.out.println(produto.toString());
        }


        //Busca do produto
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme o código de barras do produto: ");

        cod_Barras = entrada.nextInt();
        Loja.LocalizaProd(produtos, cod_Barras);

    }

    public static void LocalizaProd(ArrayList<Produto> produtos, int cod_Barras)
    {
        for (Produto produto : produtos){
            if (produto.GetCod_Barras() == cod_Barras){
                System.out.println(produto.toString());
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
