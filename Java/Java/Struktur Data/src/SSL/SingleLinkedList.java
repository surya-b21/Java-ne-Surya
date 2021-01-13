package SSL;

public class SingleLinkedList<T> implements List<T>{
    private Node<T> front = null;
    private int size;
    //untuk menambahkan node di depan
    private void addFirst(T item) {
    Node<T> newNode = new Node<T>(item);
    if (front == null) {
    front = newNode;
    } else {
    newNode.next = front;
    front = newNode;
    }
    size++;
    }
    private void addLast(T item) {
        Node<T> newNode = new Node<T>(item);
        if (front == null) {
            front = newNode;
        } else {
            Node<T> curr = front;
            while (curr.next != null) {
                curr = curr.next;
            } 
            curr.next = newNode;
        }size++;
    }

    public T get(int index) {
        Node<T> curr = front;
        T temp = null;
        int n = 0;
        if (index >= size) {
            return null;
        }while (curr != null) {
            if (n == index) {
                temp = curr.nodeValue;
                return temp;
            }
            curr = curr.next;
            n++;
        }
            return temp;
    }
    @Override
    public String toString() {
        Node<T> curr = front;
        String str = "[" + curr.nodeValue;
        while (curr.next != null) {
            curr = curr.next;
            str += ", " + curr.nodeValue;
        } 
        str += "]";
        return str;
    }
    private T removeFirst() {
        Node<T> curr = front;
        front = curr.next;
        curr.next = null;
        T value = curr.nodeValue;
        curr = null;
        size--;
        return value;
    }
    private T removeLast() {
        Node<T> curr = front, prev = null;
        while (curr.next != null) {
            prev = curr ;
            curr = curr.next;
        }
        T value = curr.nodeValue ;
        prev.next = null ;
        curr = null ;
        size--;
        return value;
    }
    public int indexOf(Object o) {
        Node<T> curr = front;
        Node<T> o2 = (Node<T>) o ;
        int i = 0;
        while (curr != null) {
            if (o2.nodeValue.equals(curr.nodeValue))
            { 
                return i;
            } else {
                curr = curr.next;
                i++;
            }
        
        }
        return -1;
    }
}