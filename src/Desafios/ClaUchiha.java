package Desafios;

public class ClaUchiha extends Ninjas {

    String habilidadeEspecial = "Sharingan";

    public void mostrarHabilidade(){
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel de Dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
        System.out.println("Habilidade Especial NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Uchiha: " + habilidadeEspecial);
    }
}
