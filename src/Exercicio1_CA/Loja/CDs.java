package Exercicio1_CA.Loja;

    public class CDs extends Produto{


        private int num_Faixas = 0;
        //Metodo construtor
        public CDs(int cod_Barras) {
            super(cod_Barras);
        }

        //Método criado para coletar as caracteristicas do objeto
        public void dados (String nome, double preco, int num_Faixas){
            super.dados(nome, preco);
            this.num_Faixas = num_Faixas;
        }

        //Sobrescrita do metodo toString
        public String toString(){
            return super.toString() + "\nNúmero de faixas: " + this.num_Faixas;
        }
    }

