package NivelBasico;

public class Array {
    static void main(String[] args) {


        // Arrays são tipos referencia!
        // String inicializa como null
        String[] ninja = new String[3];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Itachi Uchiha";
        ninja[2] = "Minato Namikaze";

        // Redeclarar Array
        ninja = new String[3];
        ninja[0] = "Hashirama";
        ninja[1] = "Kakashi";
        ninja[2] = "Naruto";

        for (int i = 0; i < 3; i++) {
            System.out.println("Nome do ninja: " + ninja[i]);
        }

        // int inicializa com 0
        int[] idade = new int[3];
        idade[0] = 19;
        idade[1] = 25;
        idade[2] = 35;

        for (int i = 0; i < 3; i++) {
            System.out.println("Idade do ninja: " + idade[i]);
        }


        // Boolean inicializa com false
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        // Doble inicializa com 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);




    }
}
