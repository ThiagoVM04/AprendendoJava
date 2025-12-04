package Condicoes;

import java.util.Scanner;

public class LaçoesDeRepeticoes {
    static void main(String[] args) {

        /*
        * Laços de Repetição: Vão repetir infinitamente ou ate vc aintiger o parametro definido
        * WHILE e FOR
        * Objetivo:
        * */

        //While - enquanto a condição for true, vai acontecer

        /*
        while (numClones <= maxClones) {
            System.out.println("O Naruto fez um clone das sombras " + numClones);
            numClones++;
        }
        */

        int maxNinja = 3;

        Scanner caixaDeTexto = new Scanner(System.in);

        for (int i = 1; i <= maxNinja; i++) {
            System.out.println();

            System.out.println("Escreva o nome do " + i + " ninja: ");
            String nome = caixaDeTexto.nextLine();
            System.out.println("Qual a idade do " + i + " ninja: ");
            int idade = caixaDeTexto.nextInt();
            caixaDeTexto.nextLine();

            System.out.println("==================================");
            System.out.println("Nome do " + i + " ninja: " + nome);
            System.out.println("Idade do " + i + " ninja: " + idade);
        }

        caixaDeTexto.close();
    }

}
