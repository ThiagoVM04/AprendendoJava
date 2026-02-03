package NivelIntermediario5;

public class Main {
    static void main(String[] args) {


        //Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 59, NivelNinja.GENIN);
        naruto.nomeDoNinja();
        naruto.estrategiaDeBatalha();



        //Obj Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 60, NivelNinja.GENIN);
        sasuke.nomeDoNinja();
        sasuke.estrategiaDeCombate();
        sasuke.inteligenciaDeCombate(145);

        //Obj Uchira 2
        Uchiha itachi = new Uchiha("Itachi", "Aldeia da Folha", 27, 860, NivelNinja.JOUNNIN);
        itachi.nomeDoNinja();
        itachi.estrategiaDeBatalha();
        itachi.inteligenciaDeCombate(500);

        //Obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.nomeDoNinja();
        madara.estrategiaDeBatalha();
        madara.estrategiaDeCombate();

    }
}
