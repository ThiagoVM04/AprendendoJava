package NivelIntermediario7;

public class Main {
    static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de Ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja bombaDeFumaca = new EquipamentosNinja("Bomda de Fumaça");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.addEquipamentos(kunai);
        bolsaGenerica.addEquipamentos(shuriken);
        bolsaGenerica.addEquipamentos(bombaDeFumaca);

        System.out.println(bolsaGenerica);


    }
}
