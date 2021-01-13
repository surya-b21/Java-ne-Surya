package Queue_Collection;

public class ArrQueue<T> implements BQueue<T> {
    private T Arr[] ;
    private int qfront = 0 ;
    private int qback = 0 ;
    private int qcapacity = 0 ;
    public ArrQueue() {
        Arr = (T[]) new Object[50];
        qcapacity = 50;
    } public ArrQueue(int size) {
        Arr = (T[]) new Object[size];
        qcapacity = size;
    } 
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public T peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    } 
    public T pop() {
        throw new UnsupportedOperationException("Not supported yet.");
    } 
    public void push(T item) {
        throw new UnsupportedOperationException("Not supported yet.");
    } 
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public boolean full() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}