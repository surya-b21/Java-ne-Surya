package Queue_Collection;

import java.util.NoSuchElementException;

public class MainArr {
    public static void main(String[] args) {
        try {
        ArrQueue<Integer> arr = new ArrQueue<Integer>(5);
        arr.push(1);
        arr.push(4);
        arr.push(10);
        arr.push(2);
        arr.push(7);
        arr.pop();
        arr.pop();
        arr.push(17);
        arr.push(3);
        arr.push(27);
        } catch (NoSuchElementException e) {
        System.out.println(e.getMessage());
        }
    }
}