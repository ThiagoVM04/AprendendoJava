package NivelIntermediario.NivelIntermediario5;

public class Main {
    static void main(String[] args) {


        //Obj Uzumaki
        System.out.println("===============================================");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 59, NivelNinja.GENIN);
        naruto.nomeDoNinja();
        naruto.estrategiaDeBatalha();
        naruto.tacarKunai();
        System.out.println(naruto.altura);

        //Obj Ambu
        System.out.println("===============================================");
        Ambu ninjaAmbu = new Ambu();
        ninjaAmbu.nome = "Ninja Aleatório";
        System.out.println("===============================================");


        //Obj Uchiha
        System.out.println("===============================================");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 60, NivelNinja.GENIN);
        sasuke.nomeDoNinja();
        sasuke.estrategiaDeCombate();
        sasuke.inteligenciaDeCombate(145);

        //Obj Uchira 2
        System.out.println("===============================================");
        Uchiha itachi = new Uchiha("Itachi", "Aldeia da Folha", 27, 860, NivelNinja.JOUNNIN);
        itachi.nomeDoNinja();
        itachi.estrategiaDeBatalha();
        itachi.inteligenciaDeCombate(500);

        //Obj Uchiha 3
        System.out.println("===============================================");
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.nomeDoNinja();
        madara.estrategiaDeBatalha();
        madara.estrategiaDeCombate();
        System.out.println("===============================================");

    }
}
