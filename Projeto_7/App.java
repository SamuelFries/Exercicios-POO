import java.net.SocketTimeoutException;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        //MyList<Carro> carros = new MyLinkedList<>();
        MyList<Carro> carros = new MyArrayList<>();

        carros.add(new Carro("ABC1234","GM"));
        carros.add(new Carro("ABC1235","FORD"));
        carros.add(new Carro("ABC1236","FIAT"));
        carros.add(new Carro("ABC1237","HONDA"));

        // The worst "for" ever (using linked list)
        System.out.println("Imprime a lista usando indices");
        for(int i=0;i<carros.size();i++){
            System.out.println(carros.get(i));
        }
        System.out.println("Imprime a lista usando iterador");
        Iterator<Carro> it = carros.getIterator();
        while(it.hasNext()){
            Carro aux = it.next();
            System.out.println(aux);
        }
    }
}
