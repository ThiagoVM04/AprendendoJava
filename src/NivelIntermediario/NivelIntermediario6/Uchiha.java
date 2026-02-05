package NivelIntermediario.NivelIntermediario6;

public class Uchiha extends Ninja implements interfaceSharingan{

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " Ativou o Sharingan");
    }

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
}
