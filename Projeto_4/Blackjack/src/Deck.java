import java.util.Random;

public class Deck {
    public static final int MAX_CARTAS = 104;
    private Carta[] cartas;
    private int proxLivre;
    private int cursor;

    public Deck() {
        cartas = new Carta[MAX_CARTAS];
        proxLivre = 0;
    }

    // O(1)
    public void insereEmCima(Carta carta) {
        if (proxLivre == MAX_CARTAS) {
            throw new RuntimeException("Deck cheio!");
        }
        cartas[proxLivre] = carta;
        proxLivre++;
    }

    // O(1)
    public Carta retiraDeCima() {
        if (proxLivre == 0) {
            throw new RuntimeException("Deck vazio");
        }
        proxLivre--;
        return cartas[proxLivre];
    }

    // O(n)
    public Carta retiraDeBaixo() {
        if (proxLivre == 0) {
            throw new RuntimeException("Deck vazio");
        }
        Carta aux = cartas[0];
        for (int i = 0; i < proxLivre - 1; i++) {
            cartas[i] = cartas[i + 1];
        }
        proxLivre--;
        return aux;
    }

    public int qtdadeCartas() {
        return proxLivre;
    }

    public int somaDosValores() {
        int soma = 0;
        for (int i = 0; i < proxLivre; i++) {
            soma += cartas[i].getValorDeUmaCarta().getValor();
        }
        return soma;
    }

    public void embaralha() {
        Random r = new Random();
        for (int i = 0; i < 2000; i++) {
            int p1 = r.nextInt(52);
            int p2 = r.nextInt(52);
            Carta aux = cartas[p1];
            cartas[p1] = cartas[p2];
            cartas[p2] = aux;
        }
    }

    public void reset(){
        cursor = 0;
    }

    public Carta next(){
        if (cursor == proxLivre){
            return null;
        }
        else{
            Carta aux = cartas[cursor];
            cursor++;
            return aux;
        }
    }
}
