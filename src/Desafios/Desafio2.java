package Desafios;

import java.util.Scanner;

public class Desafio2 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero_max = 5;
        String[] ninjas = new String[numero_max];

        int ninjasCadastrados = 0;
        int opcao = 0;

        while ( opcao != 4 ){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine()

            switch (opcao){
                case 1:
                    if (ninjasCadastrados < numero_max){
                    System.out.println("Digite o nome do ninja: ");
                    String nomeNinja = scanner.nextLine();
                    ninjas[ninjasCadastrados] = nomeNinja;
                    ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                } else {
                    System.out.println("A lista esta cheia!");
                }
                break;

            case 2:
                if(ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja cadastrado!");
                    } else {
                    System.out.println("\n======== Lista de Ninjas ========");
                    for (int i = 0; i < ninjas.length ; i++) {
                        System.out.println(ninjas[i]);
                    }
                }
                break;

                case 4:
                    System.out.println("Estamos terminando o programa... saindo");
                    break;


                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }
    }

}
