package Praktikum;

import java.util.Scanner;

public class Piramid2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Tinggi segitiga : ");
		int tinggi = in.nextInt();
		for (int i = 1; i<=tinggi; i++) {
			for (int j = tinggi; j>=i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j<=(i*2)-1; j++) {
					System.out.print("*");
			}
			System.out.println();
		}

	}
}
