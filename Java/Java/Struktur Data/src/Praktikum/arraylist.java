package Praktikum;

import java.util.ArrayList;

public class arraylist {
    public static void main (String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Adam");
        alist.add("Nuh");
        alist.add("Ibrahim");
        alist.add("Musa");
        alist.add("Isa");
        alist.add("Muhammad");

        System.out.println(alist);

        alist.add(3,"Adam");

        System.out.println(alist);
    
        
    }
}