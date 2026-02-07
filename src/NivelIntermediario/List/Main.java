package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        //Array
        //São estaticos, nao alteram de tamanho
        String[] ninjaArray = new String[4];
        ninjaArray[0] = "Naruto";
        ninjaArray[1] = "Sasuke";
        ninjaArray[2] = "Sakura";
        
        //Listas 
        // Não sao estaticas, elas podem aumentar

        List <String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Minato Namikaze");
        //Adicioanr na list
        ninjasList.add("Kakashi Hatake");

        System.out.println("NinjasList = " + ninjasList);
        
        //Remover da list
        ninjasList.remove("Kakashi Hatake");
        System.out.println("NinjasList = " + ninjasList);
        
        //Trocar elementos
        ninjasList.set(2, "Hashirama Senju");
        System.out.println("ninjasList = " + ninjasList);

        //Ver o tamanho da lista
        System.out.println("Tamanho da lista = " + ninjasList.size() + " elementos");
    }
}
