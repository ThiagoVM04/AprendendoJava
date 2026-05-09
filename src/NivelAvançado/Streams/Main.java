package NivelAvançado.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 17));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Itachi Uchiha", "Renegado", 25));
        ninjas.add(new Ninja("Gaara", "Suna", 20));
        ninjas.add(new Ninja("Temari", "Suna", 20));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 20));

        // Filter
        ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Konoha"))
                .forEach(System.out::println); //soutc

        System.out.println("================================");

        // Sorted
        ninjas.stream()
                .sorted((n1,n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);

        System.out.println("================================");

        ninjas.stream()
                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);

        System.out.println("================================");

        //Map - Mostrar e mapear um atributo
        ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);

        System.out.println("================================");

        ninjas.stream()
                .map(Ninja::getVila)
                .forEach(System.out::println);
        }
}

