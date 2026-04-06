package NivelIntermediario.TreeSet;

import java.util.*;

public class Main {
    static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Naruto");
        ninjas.add("Danzo");
        ninjas.add("Kakashi");
        ninjas.add("Boruto");

        System.out.println("Ninjas = " + ninjas);

        Set<String> ninjasSet = new TreeSet<>();
        ninjasSet.addAll(ninjas);

        System.out.println("Ninjas Ordem: " + ninjasSet);

    }

}
