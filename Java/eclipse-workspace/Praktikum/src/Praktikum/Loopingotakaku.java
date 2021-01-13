package Praktikum;

import java.util.ArrayList;
import java.util.Scanner;

public class Loopingotakaku {

	public static void main(String[] args) {
		boolean running = true;
		String ya,tidak;
		Scanner input = new Scanner(System.in);
		int angka[] = new int [8];
		while (running) {
			System.out.print("Masukkan nilai desimal : ");
			int masuk = input.nextInt();
			for (int i = 0; i<8; i++)
			{
				if (masuk%2==1) {
					angka[i]=1;
					masuk = masuk/2;
				}else {
					angka[i]=0;
					masuk = masuk/2;
				}
			}
			for (int i = angka.length-1; i>=0; i--) {
				System.out.print(angka[i]);
			}
			System.out.println(" ");
			System.out.println("Apakah anda ingin melakukannya lagi ?");
			System.out.println("ya/tidak");
			String keluar = input.next();
		if(keluar.equals("tidak")) {
			running = false;
			}
		}System.out.println("terima kasih");
		ArrayList nama = new ArrayList();
		ArrayList nim = new ArrayList();
		String nim2 = null;
		String nama2;
		System.out.print("Berapa banyak data yang ingin anda masukkan : ");
		int masuk = input.nextInt();
		for (int a = 0; a<masuk; a++) {
			Scanner nama1 = new Scanner(System.in);
			System.out.print("Nama : ");
			nama2 = nama1.nextLine();
			nama.add(nama2);
			Scanner nim1 = new Scanner(System.in);
			System.out.print("NIM : ");
			nim2 = nim1.nextLine();
			nim.add(nim2);
		}
		
		for (int i = 1;i<=30;i++) {
			if (i==1||i==10||i==30) {
				System.out.print("+");
			}else {
				System.out.print("-");
			}
		}
		System.out.println(" ");
		for (int b = 0; b<nama.size(); b++) {
			System.out.println("| "+nim+" | "+nama+" | ");
		}
		System.out.println(" ");
		for (int j = 2; j<=2;j++) {
			if (j==2) {
				System.out.print("+");
				for (int i=1; i<=29;i++) {
					if (i==9||i==29) {
						System.out.print("+");
					}else {
						System.out.print("-");
					}
				}
			}else {
				System.out.println("|");
			}
		}
		input.close();

	}

}
