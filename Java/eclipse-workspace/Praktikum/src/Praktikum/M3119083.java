package Praktikum;

import java.util.Scanner;

public class M3119083 {

	public static void main(String[] args) {
		//membuat inputan dalam opsi untuk memilih program
		Scanner milih = new Scanner(System.in);
		System.out.println("Silahkan pilih program yang akan anda gunakan");
		System.out.println("1. Program pengecekan angka ganjil atau genap");
		System.out.println("2. Program swipe angka");
		int dipilih = milih.nextInt();
		switch (dipilih) {
			//pengecekan angka ganjil atau genap
			case 1 : 
				Scanner input = new Scanner(System.in);
				System.out.print("Silahkan input angka ");
				int angka = input.nextInt();
				if (angka %2==1) {
					System.out.println("Ganjil");
				}else {
					System.out.println("Genap");
				}break;
			//Swipe angka
			case 2 : 
				Scanner cendol = new Scanner(System.in);
				System.out.print("Silahkan input angka untuk kotak 1 : ");
				int dawet = cendol.nextInt();
				System.out.print("Silahkan input angka untuk kotak 2 : ");
				int esteh = cendol.nextInt();
				int orangketiga = 0;
				orangketiga = dawet ;
				dawet = esteh ;
				esteh = orangketiga; 
				System.out.println("Kotak 1 : "+dawet);
				System.out.println("Kotak 2 : "+esteh);
				break;
			default :
				System.out.println("Tidak ada dalam daftar");
				
  }
}
}
