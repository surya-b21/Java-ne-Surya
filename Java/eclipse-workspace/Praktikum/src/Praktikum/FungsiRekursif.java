package Praktikum;

import java.util.Scanner;

public class FungsiRekursif {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai : ");
		int n = input.nextInt();
		System.out.println(faktorial(n));

	}
	static int faktorial (int i) {
		if (i==0 || i==1) {
			return 1;
		}
		return i*faktorial(i-1);
	}	

}
