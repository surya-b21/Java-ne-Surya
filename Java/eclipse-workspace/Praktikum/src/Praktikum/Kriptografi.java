package Praktikum;

import java.util.Scanner;

public class Kriptografi {

	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Silahkan masukkan tinggi segitiga : ");
		int tinggi = in.nextInt();
		String temp = in.nextLine();
		System.out.print("Masukkan kata : ");
		String kata = in.nextLine();
		char [][] ray1 = new char [tinggi][(tinggi*2)-1];
		char [][] ray2 = new char [tinggi][(tinggi*2)-1];
		int baris = 0;
		int indekskata = 0;
		if (kata.length() > (tinggi*(2+(tinggi-1)*2))/2) {
			System.out.println("Kata anda terlalu banyak!!!");
		}
		else {
			for (int i=1; i<=tinggi; i++) {
				for (int j=(tinggi-1)-baris; j<=(tinggi-2)+i; j++) {
					if (indekskata < kata.length()) {
						ray1 [baris][j] = kata.charAt(indekskata);
					}
					else if (indekskata >= kata.length()) {
						ray1 [baris][j] = '#';
					}
					indekskata++;
				}
				baris++;
			}
			for (int i=0; i<ray1.length; i++) {
				for (int j=0; j<ray1[0].length; j++) {
					System.out.print(ray1[i][j]);
				}
				System.out.println();
			}
			System.out.println("==========================");
			System.out.print("Chiphertext : ");
			for (int i=0; i<ray1[0].length; i++) {
				for (int j=0; j<ray1.length; j++) {
					if (ray1[j][i] == 0)
						continue;
					else
						System.out.print(ray1[j][i]);
				}
			}
			System.out.println();
			System.out.println("Apakah anda ingin mendekripsi chiphertext");
			String tanya = in.next();
			int batas = 0;
			int pembatas = tinggi-1;
			int indekskata2 = 0;
			if (tanya.equals("Ya")||tanya.equals("ya")||tanya.equals("Y")||tanya.equals("y")) {
				StringBuilder plaintext = new StringBuilder();
				for (int i=0; i<ray1[0].length; i++) {
					for (int j=0; j<ray1.length; j++) {
						if (ray1[j][i] == 0)
							continue;
						else
						plaintext.append(ray1[j][i]);
					}
				}
				System.out.println("Chiphertext : "+plaintext);
				
				for (int i=tinggi-1; i>=0; i--) {
					for (int j=(tinggi-1)-batas;j<=pembatas;j++) {
						ray2[j][batas] = plaintext.charAt(indekskata2);
						indekskata2++;
					} batas++;
				}
				
				for (int i=1; i<=pembatas; i++) {
					for (int j=i;j<=pembatas;j++) {
						ray2[j][batas] = plaintext.charAt(indekskata2);
						indekskata2++;
					} batas++;
				}
				System.out.println("==================");
				System.out.println("Bentuk dalam array");
				for (int i=0; i<ray2.length; i++) {
					for (int j=0; j<ray2[0].length; j++) {
						System.out.print(ray2[i][j]);
					}
					System.out.println();
				}
				System.out.println("==================");
				System.out.print("Plaintext : ");
				for (int i=0; i<ray2.length; i++) {
					for (int j=0; j<ray2[0].length; j++) {
						if (ray2[i][j] == 0)
							continue;
						else
							System.out.print(ray2[i][j]);
					}
				}
			}
		}
	}
}
