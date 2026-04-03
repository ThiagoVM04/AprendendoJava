package Desafios;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {

        LinkedList<Ninjas> listNinjas = new LinkedList<>();

        //Add na lista
        listNinjas.add(new Ninjas("Naruto Uzumaki", 17, "Folha"));
        listNinjas.add(new Ninjas("Sasuke Uchiha", 18, "Folha"));
        listNinjas.add(new Ninjas("Sakura Haruno", 18, "Folha"));
        listNinjas.add(new Ninjas("Kakashi Hatake", 37, "Folha"));
        listNinjas.add(new Ninjas("Gaara", 17, "Areia"));
        listNinjas.add(new Ninjas("Shikamaru Nara", 19, "Folha"));
        listNinjas.add(new Ninjas("Minato Namikase", 23, "Folha"));

        //Listar ninjas
        System.out.println("====== Lista de ninjas ======");
        for (Ninjas ninjas : listNinjas) {
            System.out.println(ninjas);
        }

        //Adicionar ninja em primeiro
        System.out.println("\n====== Lista de ninjas Atualizada ======");
        listNinjas.addFirst(new Ninjas("Madara Uchiha", 59, "Konoha"));
        for (Ninjas ninjas : listNinjas) {
            System.out.println(ninjas);
        }

        //Remover ninja em primeiro
        System.out.println("\n====== Remoção de Ninja ======");
        Ninjas removido = listNinjas.removeFirst();
        System.out.println("Ninja removido: " + removido);

        //Listar ninjas
        System.out.println("\n====== Lista de ninjas ======");
        for (Ninjas ninjas : listNinjas) {
            System.out.println(ninjas);
        }


        //Procurar por indice
        System.out.println("\n======= Procurando Ninja =======");
        Ninjas terceiroNinja = listNinjas.get(3);
        System.out.println("Terceiro ninja: " + terceiroNinja);
    }
}