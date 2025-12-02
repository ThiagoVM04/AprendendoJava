package Condições;

public class IfEElse {

    static void main(String[] args) {
        /*
        * IF e ELSE - Condições
        * Objetivo: Passar o ninja de nivel de acordo com de missões
        * */

        String ninja1 = "Uchiha Itachi";
        String genetica = "Sharingan";
        boolean kekkeiGenkai = true;
        int idade = 20;
        boolean renegado = true;
        short numeroDeMissoes = 150;

        System.out.println("Nome do ninja: " + ninja1);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Numero de missoes: " + numeroDeMissoes);

        if (kekkeiGenkai == true){
            System.out.println("Ninja possui habilidades de: " + genetica);
        }

        if (numeroDeMissoes > 50 && idade > 18){
            System.out.println("Ninja de nível: AMBU");
        } else if (numeroDeMissoes < 50 && idade > 16){
            System.out.println("Ninja de nível: Jounin");
        } else {
            System.out.println("Ninja de nível: Chunin");
        }
    }
}
