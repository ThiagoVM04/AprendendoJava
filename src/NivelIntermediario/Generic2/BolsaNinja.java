package NivelIntermediario.Generic2;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    //Inicilizar nosso array
    private List<T> ferramentas;

    //Construtor
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    //Colocar ferramentas na nossa array
    public void addFerramentas(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    //Mostrar a nossa lista de ferramentas
    public void mostrarFerramenta(){
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }
}

