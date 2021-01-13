package Queue_Collection;

import java.util.LinkedList;
public class LinkedQueue<T> implements Queue<T>{
    private LinkedList<T> qlist = null;
    public LinkedQueue ()
    {
    qlist = new LinkedList<T>();
    } 
    public boolean isEmpty() {
    throw new UnsupportedOperationException("Not supported yet.");
    } 
    public T peek() {
    return qlist.getFirst();
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
}