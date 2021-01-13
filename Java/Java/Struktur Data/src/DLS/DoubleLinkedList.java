package DLS;

public class DoubleLinkedList<T> {
    private DNode<T> front=null, back=null;
    @Override
    public String toString(){
        DNode<T> curr = front;
        if (curr == null) {
            return "Double Linked List Kosong"; 
        } else {
            String str = "[" + curr.nodeValue;
            while (curr.next != curr) {
                curr = curr.next;
                str += ", " + curr.nodeValue;
            }
            str += "]";
            return str;
        }
     }
    public void tambahNode_Depan(DNode<T> newNode){ 
        if (front == null) {
            front = newNode;
            back = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }
    public void tambahNode_Akhir(DNode<T> newNode){ 
        if (back == null)
            tambahNode_Depan(newNode);
        else {
            back.next = newNode;
            newNode.prev = back;
            back = newNode;
        }
    }
    public void hapusNode_Depan() {
        if (front != null) {
        front = front.next;
        front.prev.next = null;
        front.prev = front;
        }
    }
    public void hapusNode_Akhir() {
        if (back != null) {
        back = back.prev;
        back.next.prev = null;
        back.next = back;
        }
    }
}