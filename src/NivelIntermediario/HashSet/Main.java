package NivelIntermediario.HashSet;

import java.util.*;

public class Main {
    static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Tsunade");
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Naruto");

        System.out.println("Ninjas = " + ninjas);

        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);
        ninjasSet.remove("Sakura");

        System.out.println("NinjasSet = " + ninjasSet);

        Set<String> ninjaSet = new LinkedHashSet<>();
        ninjaSet.addAll(ninjas);
        System.out.println("Ninjas: " + ninjaSet);

    }
}
