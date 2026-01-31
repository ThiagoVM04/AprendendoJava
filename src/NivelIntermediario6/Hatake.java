package NivelIntermediario6;

public class Hatake extends Ninja implements interfaceSharingan, interfaceAmbu, interfaceHokage{

    public void boasVindas(){
        System.out.println(nome+ " Eu sou um Hatake");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " Ativou o Sharingan");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ", Eu sou um ninja de Elite da AMBU");
    }

    @Override
    public void hokageAtivo() {
        System.out.println(nome + " Eu sou um Hokage da " + aldeia);
    }
}
