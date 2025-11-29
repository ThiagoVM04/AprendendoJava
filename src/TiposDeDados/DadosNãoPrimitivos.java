package TiposDeDados;

/*
* Principais Shortcuts
* Ctrl + Shift + A: Encontrar e executar qualquer ação
* Ctrl + E: Mostrar aquivos recentes
* Ctrl + /: Comentar/descomentar linha
* Ctrl + Shift + F10: Executar a aplicação
* */

public class DadosNãoPrimitivos {
    static void main(String[] args) {
        // Tudo que for digitado aqui dentro com o comando PSVMA vai ser compilado pelo java

        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir metodos a ele.
        * */

        String nome = "Uzumaki Naruto";
        String nomeUpperCase = nome.toUpperCase(); // toUpperCase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Esse texto esta em NORMAL: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaLowerCase = aldeia.toLowerCase(); //toLowerCase coloca tudo em caixa baixa
        System.out.println("Esse texto esta em caixa baixa: " + aldeiaLowerCase);

    }
}
