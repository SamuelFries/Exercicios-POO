import java.util.Iterator;

public interface MyList<E> {
    void add(E element);
    E get(int i);
    int size();
    E remove(int i);
    void add(int i,E element);
    Iterator<E> getIterator();
}
