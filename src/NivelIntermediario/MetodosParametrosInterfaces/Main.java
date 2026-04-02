package NivelIntermediario.MetodosParametrosInterfaces;

public class Main {
    static void main(String[] args) {

        // Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Usumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.ModoSabioAtivado();

        // Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.SharinganAtivado();

        // Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome  = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.PoderDeCura();

        // Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 19;
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.byakuganAtivado();

        // Objeto 5
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;
        Boruto.ModoSabioAtivado();
        Boruto.AtivarKarma();
        Boruto.AtivarJougan();
    }
}
