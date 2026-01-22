package NivelIntermediario;


import javax.naming.NameNotFoundException;

public class Main {
    static void main(String[] args) {
        // Criar ninja Sasuke Uchiha - Sasuke é um OBJETO
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Usumaki";
        Naruto.aldeia = "Aldeia da FOlha";
        Naruto.idade = 17;

        // Criar ninja Sasuke Uchiha - Sasuke é um OBJETO
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado(); // aplicando metodos aos meus objetos
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);
       int quantoTempoFalta = Sasuke.anosParaSerHokage(70);
        System.out.println("Você tem " + Sasuke.idade + " anos, então falta no minimo " + quantoTempoFalta + " anos para se tornar Hokage!");

        // Criar Sakura Haruno
        Ninja Sakura = new Ninja();
        Sakura.nome  = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
    }
}
