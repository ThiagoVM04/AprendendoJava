package Desafios;

public class Desafio1 {
    static void main(String[] args) {

        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 27;
        String missao = "Salvar Konoha";
        String status = "Em andamento";
        char nivel = 'S';

        if ( idade < 15 ){
            if (nivel == 'C' || nivel == 'D'){
                status = "Concluida";
            } else {
                status = "Não concluida, idade inapropriada";
            }
        } else {
            status = "Concluida";
        }

        System.out.println("==============================");
        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Status: " + status);
        System.out.println("Rank: " + nivel);
        System.out.println("==============================");


        String nomeNinja2 = "Boruto Uzumaki";
        int idade2 = 14;
        String missao2 = "Salvar o gato na arvore";
        String status2 = "Em andamento";
        char nivel2 = 'D';

        if ( idade2 < 15 ){
            if (nivel2 == 'C' || nivel2 == 'D'){
                status2 = "Concluida";
            } else {
                status2 = "Não concluida, idade inapropriada";
            }
        } else {
            status2 = "Concluida";
        }

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Status: " + status2);
        System.out.println("Rank: " + nivel2);
        System.out.println("==============================");

        String nomeNinja3 = "Minato Namikaze";
        int idade3 = 45;
        String missao3 = "Neutralizar a raposa de 9 caldas";
        String status3 = "Concluido";
        char nivel3 = 'S';

        if ( idade3 < 15 ){
            if (nivel3 == 'C' || nivel3 == 'D'){
                status3 = "Concluida";
            } else {
                status3 = "Não concluida, idade inapropriada";
            }
        } else {
            status3 = "Concluida";
        }

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missao: " + missao3);
        System.out.println("Status: " + status3);
        System.out.println("Rank: " + nivel3);
        System.out.println("==============================");
    }
}
