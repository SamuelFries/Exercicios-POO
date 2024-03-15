public class Carta {
    private ValorDeUmaCarta valorDeUmaCarta;
    private Naipe naipe;

    public Carta(ValorDeUmaCarta valor, Naipe naipe) {
        this.valorDeUmaCarta = valor;
        this.naipe = naipe;
    }

    public ValorDeUmaCarta getValorDeUmaCarta() {
        return valorDeUmaCarta;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return "Carta [valor=" + valorDeUmaCarta + ", naipe=" + naipe + "]";
    }    
}
