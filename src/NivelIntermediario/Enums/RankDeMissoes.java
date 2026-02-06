package NivelIntermediario.Enums;

public enum RankDeMissoes {

    D("Baixo", 2),
    C("Médio", 3),
    B("Razoavel", 4),
    A("Dificil", 5),
    S("Hard", 10);

    private String descriçao;
    private int dificuldade;

    RankDeMissoes(String descriçao, int dificuldade) {
        this.descriçao = descriçao;
        this.dificuldade = dificuldade;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}

