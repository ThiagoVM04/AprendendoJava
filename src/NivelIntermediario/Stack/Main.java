package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static void main(String[] args) {

        //Array
        //Sao estaticos e tem referencia de memoria
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";

        //Lista
        //Sao dinamicas e tamanho aumenta e diminiu conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");

        //Stack - PUSH(add) POP(retira) PEEK(proximo) SIZE(tamanho)
        //Sistema LIFO - ultimo a entrar é o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Sakura");
        System.out.println(ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha Stack com pop = " + ninjaStack);
        System.out.println("Minha Stack com o proximo elemento = "+ ninjaStack.peek());
        System.out.println("Tamanho da Stack = "+ ninjaStack.size() + " elementos");
    }
}
