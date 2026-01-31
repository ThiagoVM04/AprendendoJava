package NivelIntermediario5;

public class Uzumaki extends Ninja{

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome);
    }

    public Uzumaki(){
        super();
    }

    public Uzumaki(String nome, String aldeira, int idade) {
        super(nome, aldeira, idade);
    }
}
