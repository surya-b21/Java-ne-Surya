package Queue_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListInterfaceQueue_2 {
    public static void main(final String[] args) {
    final Queue<String> myQueue = new LinkedList<String>();
    myQueue.add("A");
    myQueue.add("B");
    myQueue.add("C");
    myQueue.add("D");
    final List<String> myList = new ArrayList<String>(myQueue);
    for (final Object theFruit : myList)
        System.out.println(theFruit);
    }
}