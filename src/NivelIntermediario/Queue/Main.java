package NivelIntermediario.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static void main(String[] args) {
        //Queue
        //FIFO - primeiro a entrar é o primeiro a sair

        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        //Mostrar a fila
        System.out.println("Ninjas na fila = " + ninjasQueue);

        //Remover ninja - POLL(remove a head)
        ninjasQueue.poll();
        System.out.println("Ninjas na fila poll = " + ninjasQueue);

        //Como ver a head
        System.out.println("Primeiro da fila = " + ninjasQueue.peek());

        //Add
        ninjasQueue.add("Hashirama");
        ninjasQueue.add(" Tobi");
        System.out.println("Ninjas na fila = " + ninjasQueue);


        //Esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Fila = " + ninjasQueue);

        //Verificar se esta vazia
        if(ninjasQueue.isEmpty()){
            System.out.println("A fila esta vazia");
        }
    }
}
