package NivelIntermediario.NivelINtermediario3;

public class Main {
    static void main(String[] args) {

        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashirama";
        Hashirama.idade =  45;

        Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages(40);
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages("Minato Namikaze", 32, false);
        System.out.println(Minato.nome);
        System.out.println(Minato.idade);
        System.out.println(Minato.vivoOUnao);

        Hokages Tsunade = new Hokages("Tsunade", 45,true,"Aldeia da Folha",450,10000000,1.98);
        System.out.println(Tsunade.idade);
    }

}
