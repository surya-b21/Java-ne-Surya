package Praktikum;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class HashSetJadiArrayList {
    public static void main (String[]args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("Ovide");
        hset.add("Yudha");
        hset.add("Fendi");
        hset.add("Harry");
        hset.add("Taufiq");
        //menampikan hashset
        System.out.println("HashSet berisi: "+hset);
        //mengubah ke arraylist
        List <String> list = new ArrayList<String>(hset);
        //menampilkan elemen ArrayList
        System.out.println("ArrayList berisi: "+list);
    }
}