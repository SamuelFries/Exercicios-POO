class Locomotiva {
    private int identificador;
    private int pesoMaximo;
    private int numMaxVagoes;
    private String referenciaTrem;

    public Locomotiva(int identificador, int pesoMaximo, int numMaxVagoes) {
        this.identificador = identificador;
        this.pesoMaximo = pesoMaximo;
        this.numMaxVagoes = numMaxVagoes;
        this.referenciaTrem = null;
    }
    
    public int getIdentificador() {
        return identificador;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public int getNumMaxVagoes() {
        return numMaxVagoes;
    }

    public String getReferenciaTrem() {
        return referenciaTrem;
    }

    public void setReferenciaTrem(String referenciaTrem) {
        this.referenciaTrem = referenciaTrem;
    }
}
