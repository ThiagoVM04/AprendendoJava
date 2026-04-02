package NivelIntermediario.Contrutores;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOUnao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public Hokages() {
    }

    // Criar um construtor com argumento
    public Hokages(String nome){
        this.nome = nome;
    }

    public Hokages(int idade){
        this.idade = idade;
    }

    // ALL ARGS CONSTRUCTOR
    public Hokages( String nome, int idade, boolean vivoOUnao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOUnao = vivoOUnao;
    }

    public Hokages(double altura) {
        this.altura = altura;
    }

    // Consegue contruir os contrutores com o Intellij ALT + INSERT
    public Hokages(String nome, int idade, boolean vivoOUnao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOUnao = vivoOUnao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
