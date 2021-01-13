package Praktikum;

import java.util.Scanner;

public class fungsi {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Rumus segitiga");
	System.out.print("Silahkan masukkan alas : ");
	int alas = input.nextInt();
	System.out.print("Silahkan masukkan tinggi : ");
	int tinggi = input.nextInt();
	System.out.print("Luas segitiga adalah : "+ rumus(alas,tinggi) );
	
	}
	public static int rumus(int alas,int tinggi) {
		int luas = (alas*tinggi)/2;
		return luas;
		
	}

}
