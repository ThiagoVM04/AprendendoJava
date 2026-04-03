package Desafios;

import java.util.LinkedList;

public class CadastroNinja {

   private LinkedList<Ninjas> ninjas;

   public CadastroNinja() {
       this.ninjas = new LinkedList<>();
   }

   public void addNinja(Ninjas ninja){
        ninjas.add(ninja);
   }

    public void removeNinja(Ninjas ninja){
        ninjas.remove(ninja);
    }

    public void mostrarNinjas(){
        System.out.println(ninjas);
    }

    public void setNinjas(LinkedList<Ninjas> ninjas) {
        this.ninjas = ninjas;
    }
}
