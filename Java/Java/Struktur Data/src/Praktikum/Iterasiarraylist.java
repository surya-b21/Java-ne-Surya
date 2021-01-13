package Praktikum;

import java.util.ArrayList;

public class Iterasiarraylist {
    public static void main (String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Ovide Decroly");
        alist.add("Yudho Yudhanto");
        alist.add("Fendi Aji");
        alist.add("Eko Harry");
        alist.add("Taufiq Rahman");

        for (String iter : alist) {
            System.out.println(iter);
        }
    
        
    }
}