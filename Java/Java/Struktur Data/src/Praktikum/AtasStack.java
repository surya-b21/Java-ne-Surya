package Praktikum;

import java.util.Stack;

public class AtasStack {
    public static void main (String[]args) {
        Stack<String> hewan=new Stack<>();

        hewan.push("Ayam");
        hewan.push("Kucing");
        hewan.push("Onta");

        System.out.println("Stack : "+hewan);
        
        String elemen = hewan.peek();
        System.out.println("Elemen teratas : "+elemen);
    }
}