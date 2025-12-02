package Condicoes;

public class Ternarios {
    static void main(String[] args) {

        /*
        * Ternarios: Maneiras de reduzir o código
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso
        * Objetivo:
        * */

        short numeroMissoes = 1;
        String niveldoNinja = (numeroMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";
        System.out.println(niveldoNinja);

    }
}
