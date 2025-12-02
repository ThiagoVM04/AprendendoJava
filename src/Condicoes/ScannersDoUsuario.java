package Condicoes;
import java.util.Scanner;

public class ScannersDoUsuario {
    static void main(String[] args) {
        /*
        * Scanner = é um jeito de trazer o usuario para dentro da aplicação
        * Objetivo: O usuario vai criar um ninja e vamos validar os dados
        * */

        // Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);


        // Receber o nome do ninja
        System.out.println("Escreva aqui o nome do Ninja: ");
        String nome = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nome);

        // Receber a idade do ninja
        System.out.println("Escreva aqui a idade do ninja: ");
        int idade = caixaDeTexto.nextInt();
        System.out.println("A idade dp ninja é: " + idade + " anos");

        if ( idade >= 18 ){
            System.out.println("Ninja maior de idade e ja pode ir para missoes para fora da aldeira!");
        } else {
            System.out.println("Ninja menor de idade! PROIBIDO missoes fora da aldeia!T");
        }
        // Fechar sempre o Scanner
        caixaDeTexto.close();

    }
}
