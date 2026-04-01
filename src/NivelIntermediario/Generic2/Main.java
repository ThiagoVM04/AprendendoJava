package NivelIntermediario.Generic2;

public class Main {
    static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.addFerramentas(new Kunai("Kunai Explosiva"));
        bolsaNinja.addFerramentas(new Shuriken(3));
        bolsaNinja.addFerramentas(new Pergaminho("Invocação do sapo"));
        bolsaNinja.addFerramentas(new Pergaminho("Invocação da cobra"));
        bolsaNinja.addFerramentas(new CompanheiroNinja("Sarutobi"));

        System.out.println("Itens da nossa bolsa:");
        bolsaNinja.mostrarFerramenta();

    }
}
