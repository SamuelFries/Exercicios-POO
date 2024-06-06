class Vagao {
    private int identificador;
    private int capacidadeMaxima;
    private String referenciaTrem;

    public Vagao(int identificador, int capacidadeMaxima) {
        this.identificador = identificador;
        this.capacidadeMaxima = capacidadeMaxima;
        this.referenciaTrem = null;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public String getReferenciaTrem() {
        return referenciaTrem;
    }

    public void setReferenciaTrem(String referenciaTrem) {
        this.referenciaTrem = referenciaTrem;
    }
}
