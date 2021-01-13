package Praktikum;

import java.util.Stack;

public class CariStack {
    public static void main (String[]args) {
        Stack<String> hewan=new Stack<>();

        hewan.push("Ayam");
        hewan.push("Kucing");
        hewan.push("Onta");

        System.out.println("Stack : "+hewan);
        
        int posisi = hewan.search("Kucing");
        System.out.println("Posisi kucing : "+posisi);
    }
}