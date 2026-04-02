package NivelIntermediario.Pratica1;

public class Main {
    static void main(String[] args) {


        //Obj NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Uzumaki
        System.out.println("===============================================");
        Uzumaki naruto = new Uzumaki("Naruto NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Uzumaki", "Aldeia da Folha", 17, 59, NivelNinja.GENIN);
        naruto.nomeDoNinja();
        naruto.estrategiaDeBatalha();
        naruto.tacarKunai();
        System.out.println(naruto.altura);

        //Obj Ambu
        System.out.println("===============================================");
        Ambu ninjaAmbu = new Ambu();
        ninjaAmbu.nome = "NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Ninja Aleatório";
        System.out.println("===============================================");


        //Obj NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Uchiha
        System.out.println("===============================================");
        Uchiha sasuke = new Uchiha("Sasuke NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Uchiha", "Aldeia da Folha", 18, 60, NivelNinja.GENIN);
        sasuke.nomeDoNinja();
        sasuke.estrategiaDeCombate();
        sasuke.inteligenciaDeCombate(145);

        //Obj Uchira 2
        System.out.println("===============================================");
        Uchiha itachi = new Uchiha("Itachi", "Aldeia da Folha", 27, 860, NivelNinja.JOUNNIN);
        itachi.nomeDoNinja();
        itachi.estrategiaDeBatalha();
        itachi.inteligenciaDeCombate(500);

        //Obj NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Uchiha 3
        System.out.println("===============================================");
        Uchiha madara = new Uchiha("Madara NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.nomeDoNinja();
        madara.estrategiaDeBatalha();
        madara.estrategiaDeCombate();
        System.out.println("===============================================");

    }
}
