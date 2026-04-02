package NivelIntermediario.Pratica1;

public class Uchiha extends Ninja{

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome + " Já completei: " + numeroDeMissoesConcluidas + " missões");
    }

    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String aldeira, int idade) {
        super(nome, aldeira, idade);
    }

    public Uchiha(String nome, String aldeira, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeira, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150){
            System.out.println("Seu QI é: " + qi + " você é um gênio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " você é um nija promissor!");
        } else {
            System.out.println("Seu QI é: " + qi + " você precisa treinar mais seu QI");
        }
        System.out.println("Meu nome é: " + nome + " E essa é minha Inteligencia de Combate");
    }
}
