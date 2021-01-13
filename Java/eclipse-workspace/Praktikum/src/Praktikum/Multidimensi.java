package Praktikum;

import java.util.Scanner;

public class Multidimensi {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan banyak baris : ");
		int baris = sc.nextInt();
		System.out.print("Masukkan banyak kolom : ");
		int kolom = sc.nextInt();
		char [][] duadimensi = new char [baris][kolom];
		System.out.println("Silahkan masukkan hurufnya ");
		String teks = sc.next();
		int kata = 0;
		for (int i=0;i<baris;i++) {
			for (int j=0;j<kolom;j++) {
				duadimensi[i][j]=teks.charAt(kata);
				kata = kata+1;
			}
		}
		for (int i=0;i<baris;i++) {
			for (int j=0;j<kolom;j++) {
				System.out.print(duadimensi[i][j]);
			}
		}
	}
}
