package NivelIntermediario5;

import javax.xml.transform.Source;

public abstract class Ninja implements estrategiaDeBtalhaNinja {

    //TODO: INCLUIR NOVOS 2 ATRIBUSTOS: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeira;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeira, int idade) {
        this.nome = nome;
        this.aldeira = aldeira;
        this.idade = idade;
    }

    //TODO: CHAMANDO OS NOVOS ATRIBUTOS
    //Sobrecarga de metodos voce não precisa redeclarar o construtor, só os novos atributos

    public Ninja(String nome, String aldeira, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeira, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public abstract void nomeDoNinja();

    // Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é minha estrategia de combate!");
    }

    @Override
    public void estrategiaDeCombate() {
        System.out.println("Abater o inimigo com apenas um golpe!");
    }

    // Sobrecarga de Metodo - Inteligencia de Combate
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " E essa é minha Inteligencia de Combate");
    }

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

    public void metodoprovisorio(){
        System.out.println("Teste");
    }


}
