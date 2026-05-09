package NivelAvançado;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    static void main(String[] args) {

        ArrayList<Ninjas> ninjas = new ArrayList<>();
        ninjas.add(new Ninjas("Naruto Uzumaki", 17));
        ninjas.add(new Ninjas("Sasuke Uchiha", 18));
        ninjas.add(new Ninjas("Sakura Haruno", 17));

        //O(1) - Constante
        System.out.println(ninjas.get(2));


        /*for (Ninjas ninja : ninjas) {
            System.out.println(ninja);
        }*/
        System.out.println("=====================");
        for (int i = 0; i < ninjas.size(); i++) {
            System.out.println(ninjas.get(i));
        }

        System.out.println("=====================");

        //O(N^2)
        for (int i = 0; i < ninjas.size(); i++) {
            for (int j = 0; j <ninjas.size(); j++) {
                System.out.println(ninjas.get(i) + " Contra: " + ninjas.get(j));
            }
        }



    }
}
