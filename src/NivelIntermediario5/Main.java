package NivelIntermediario5;

public class Main {
    static void main(String[] args) {


        //Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeira = "Aldeia da Folha";
        naruto.idade = 16;
        naruto.nomeDoNinja();
        naruto.estrategiaDeBatalha();


        //Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeira = "Aldeia da Folha";
        sasuke.idade = 17;
        sasuke.nomeDoNinja();
        sasuke.estrategiaDeCombate();

        //Obj Uchira 2
        Uchiha itachi = new Uchiha("Itachi", "Aldeia da Folha", 27);
        itachi.estrategiaDeBatalha();
    }
}
