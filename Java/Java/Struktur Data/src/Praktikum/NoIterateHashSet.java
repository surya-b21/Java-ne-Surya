package Praktikum;

import java.util.HashSet;

public class NoIterateHashSet {
    public static void main (String[]args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("Ovide");
        hset.add("Yudha");
        hset.add("Fendi");
        hset.add("Harry");
        hset.add("Taufiq");

        for (String temp : hset) {
            System.out.println(temp);
        }
       
    }
}