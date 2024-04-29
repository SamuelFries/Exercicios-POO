package src;
import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E> {
    private class Node<T>{
        public T element;
        public Node<T> next;

        public Node(T element){
            this.element = element;
            this.next = null;
        }
    }

    public class MyIterator<U> implements Iterator<U>{
        private Node<U> current;

        public MyIterator(){
            current = (Node<U>)head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public U next() {
            U element = current.element;
            current = current.next;
            return element;
        }
    }
    
    private Node<E> head;
    private Node<E> tail;
    private int count;

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null){
            head = newNode;
            tail = head;
            count = 1;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        count++;
    }

    @Override
    public E get(int i) {
        if (i < 0 || i >= count){
            throw new IndexOutOfBoundsException("Indice invalido: "+i);
        }
        Node<E> aux = head;
        for(int c=0; c<i; c++){
            aux = aux.next;
        }
        return aux.element;
    }

    @Override
    public Iterator<E> getIterator(){
        return new MyIterator<>();
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public E remove(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void add(int i, E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
