import java.util.Iterator;

public class MyArrayList<E> implements MyList<E>{
    private int capacity;
    private E[] base;
    private int count;

    public class MyIterator<E> implements Iterator<E>{
        private int current;

        public MyIterator(){
            current = 0;
        }

        @Override
        public boolean hasNext() {
            return current != count;
        }

        @Override
        public E next() {
            E element = (E)(base[current]); 
            current++;
            return element;
        }
    }

    public MyArrayList(){
        capacity = 10;
        count = 0;
        base = (E[])(new Object[capacity]);
    }

    @Override
    public void add(E element) {
        if (count == capacity){
            E[] newBase = (E[])(new Object[capacity*2]);
            for(int i=0;i<capacity;i++){
                newBase[i] = base[i];
            }
            capacity = capacity*2;
            base = newBase;
        }
        base[count] = element;
        count++;
    }

    @Override
    public E get(int i) {
        if (i < 0 || i >= count){
            throw new IndexOutOfBoundsException("Indice invalido: "+i);
        }
        return base[i];
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
