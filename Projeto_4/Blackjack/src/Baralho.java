public class Baralho {
    private Deck deck;

    public Baralho(){
        deck = new Deck();
        for(int i=0;i<Naipe.values().length;i++){
            for(int j=0;j<ValorDeUmaCarta.values().length;j++){
                Carta c = new Carta(ValorDeUmaCarta.values()[j], Naipe.values()[i]);
                deck.insereEmCima(c);
            }
        }
    }

    public Carta retiraDeCima(){
        return deck.retiraDeCima();
    }

    public void embaralha(){
        deck.embaralha();;
    }
}
