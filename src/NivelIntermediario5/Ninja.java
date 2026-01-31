package NivelIntermediario5;

public abstract class Ninja implements estrategiaDeBtalhaNinja {

    String nome;
    String aldeira;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeira, int idade) {
        this.nome = nome;
        this.aldeira = aldeira;
        this.idade = idade;
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
}
