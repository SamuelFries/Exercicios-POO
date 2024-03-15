import java.util.Random;

public class App {
    public static void imprimeCartas(Deck d){
        d.reset();
        Carta aux = null;
        while((aux=d.next())!=null){
            System.out.println(aux);
        }
    }

    public static void main(String[] args) throws Exception { 
        Baralho b1 = new Baralho();
        b1.embaralha();
        Deck j1 = new Deck();
        Deck j2 = new Deck();
        j1.insereEmCima(b1.retiraDeCima());
        j1.insereEmCima(b1.retiraDeCima());
        j2.insereEmCima(b1.retiraDeCima());
        j2.insereEmCima(b1.retiraDeCima());
        while(true){
            System.out.println("Cartas do jogador 1:");
            imprimeCartas(j1);
            int somaJ1 = j1.somaDosValores();
            System.out.println("Somatorio do jogador 1:"+somaJ1);
            System.out.println("Cartas do jogador 2:");
            imprimeCartas(j2);
            int somaJ2 = j2.somaDosValores();
            System.out.println("Somatorio do jogador 2:"+somaJ2);
            // Testes de fim de jogo
            if (somaJ1 > 21){
                System.out.println("Jogador 2 ganhou!");
                break;
            }
            if (somaJ2 > 21){
                System.out.println("Jogador 1 ganhou!");
                break;
            }
            // --> Testar de alguem chegou em 21 exatos
            
            // Pergunta se cada jogador quer mais uma carta
        }
    }
}
