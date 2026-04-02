package NivelIntermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {
    //Record usa do mesmo jeito que um ENUM, uma classe que não vai ser alterado
    //Vai ser algo constante (nomeFuncionarios, ID, nome de rua, CEP...)
    //Todos os atributos são FINAL
    //Record nao tem SETTER

    public String emailCaixaAlta() {
        return email.toUpperCase();
    }
}
