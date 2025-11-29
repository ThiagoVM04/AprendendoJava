package TiposDeDados;

public class DadosPrimitivos {
    static void main(String[] args) {

        /*
        * Dados Primitivos - int, doble, float, char, boolean, short.
        * Objetivo da Aula: Criar um ninja - Naruto -
        * */

        int idade = 16; // valor maximo do int 2.147.483.647
        double altura = 1.80;
        char inicial = 'N';
        boolean vivoOUmorto = true;
        Long saldoBancario = 99999L; // Valor maximo do Long 9.223.372.036.854.775.807

        System.out.println(idade); // comando para mostar para o usuario
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("Saldo Bancario é = " + saldoBancario);
        System.out.println("Minha idade é: " + idade);

    }
}
