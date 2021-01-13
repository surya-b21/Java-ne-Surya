package Praktikum;

import java.util.HashSet;
import java.util.Iterator;

public class IterasiHashSet {
    public static void main (String[]args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("Ovide");
        hset.add("Yudha");
        hset.add("Fendi");
        hset.add("Harry");
        hset.add("Taufiq");

       Iterator<String> it = hset.iterator();
       while(it.hasNext()) {
           System.out.println(it.next());
       }
    }
}