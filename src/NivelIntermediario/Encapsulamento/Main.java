package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {


        System.out.println("--------------- Naruto NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Uzumaki ---------------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 17, 30, 1.67);
        System.out.println("Meu nome é " + naruto.getNome());
        naruto.setNome("Naruto NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Uzumaki com nome alterado");
        System.out.println("Meu nome é " + naruto.getNome());

        System.out.println("\n");
        System.out.println("--------------- Sasuke NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Uchiha ---------------");
        Uchiha sasuke = new Uchiha("Sasuke NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Uchiha", "Aldeia da Folha", 18, 35, 1.70);
        System.out.println("Meu nome é " + sasuke.getNome());
        sasuke.setAldeia("NivelIntermediario.MetodosParametros.NivelIntermediario.Herança.Ninja RENEGADO (com aldeia alterada)");
        System.out.println("Não tenho aldeia porque sou um " + sasuke.getAldeia());

        }

}
