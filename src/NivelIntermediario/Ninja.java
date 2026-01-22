package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    // Criar um metodo publico personalizado


    // O metodo VOID não retorna valor nenhum!
    public void SharinganAtivado(){
        System.out.println("O Sharingan ATIVOU!");
    }

    // Metodo String vai retornar um String
    public String EuSouUmNinja() {
        return "Oi, Eu sou um Ninja!";
    }

    // Metodo Int vai retornar um int
    public int anosParaSerHokage( int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}
