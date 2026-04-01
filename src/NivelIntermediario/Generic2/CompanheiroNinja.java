package NivelIntermediario.Generic2;

public class CompanheiroNinja {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CompanheiroNinja(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Companheiro: " + nome;
    }
}
