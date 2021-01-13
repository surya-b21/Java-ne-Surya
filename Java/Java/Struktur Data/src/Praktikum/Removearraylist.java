package Praktikum;

import java.util.ArrayList;

public class Removearraylist {
    public static void main (String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Adam");
        alist.add("Nuh");
        alist.add("Ibrahim");
        alist.add("Musa");
        alist.add("Isa");
        alist.add("Muhammad");

        System.out.println(alist);

        alist.remove("Adam");
        alist.remove("isa");

        System.out.println(alist);

        alist.remove(2);

        System.out.println(alist);
    
        
    }
}