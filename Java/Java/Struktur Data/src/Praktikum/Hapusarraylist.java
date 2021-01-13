package Praktikum;

import java.util.ArrayList;

public class Hapusarraylist {
    public static void main (String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("AB");
        al.add("CD");
        al.add("EF");
        al.add("GH");
        al.add("AB");
        al.add("YZ");

        System.out.println("ArrayList sebelum dihapus :");
        for (String var : al) {
            System.out.println(var);
        }
        al.remove(0);
        al.remove(2);
        al.remove(3);

        System.out.println("ArrayList setelah dihapus :");
        for (String var2 : al) {
            System.out.println(var2);
        }
    }
}