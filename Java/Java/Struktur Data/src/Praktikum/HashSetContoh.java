package Praktikum;

import java.util.HashSet;

public class HashSetContoh {
    public static void main (String[]args) {
        //mendeklarasikan HashSet
        HashSet<String> hset = new HashSet<String>();
        //mengisi elemen HashSet
        hset.add("Apel");
        hset.add("Durian");
        hset.add("Jeruk");
        hset.add("Mangga");
        hset.add("Rambutan");
        //menduplikasi elemen HashSet
        hset.add("Apel");
        hset.add("Mangga");
        //membuat elemen null
        hset.add(null);
        hset.add(null);
        //menampilkan elemen HashSet
        System.out.println(hset);
    }
}