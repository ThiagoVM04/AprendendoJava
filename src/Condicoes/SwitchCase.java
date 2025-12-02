package Condicoes;
import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {

        /*
        * SwitchCases: Que serve para gerar casos espessificos
        * Objetivo: Pedir para o usuario escolher entre os ninjas
        * */

        // Solicitar para o usuario
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki ");
        System.out.println("2 - Sasuke Uchiha ");
        System.out.println("3 - Sakura Haruno ");

        // Pedir para o usuario escolher uma das opções
        int opcao = caixaDeTexto.nextInt();

        System.out.println("Opção escolhida: " + opcao);

        // Mostrar a reação ao escolher um personagem
        switch (opcao){
            case 1:
                System.out.println("Personagem escolhido Naruto Uzumaki");
                break;

            case 2:
                System.out.println("Personagem escolhido Sasuke Uchiha");
                break;

            case 3:
                System.out.println("Personagem escolhido Sakura Haruno");
                break;

            default:
                System.out.println("Voce não digitou uma resposta valida, tente novamente!");
        }

        // Fechar caixa
        caixaDeTexto.close();

    }
}

