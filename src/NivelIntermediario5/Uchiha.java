package NivelIntermediario5;

public class Uchiha extends Ninja{

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome);
    }

    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String aldeira, int idade) {
        super(nome, aldeira, idade);
    }
}
