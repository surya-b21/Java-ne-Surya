package Praktikum;

import java.util.Scanner;

public class Parkir {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int roda2_tarif,roda2_INAP,roda2_hilang;
		roda2_tarif = 3000;
		roda2_INAP = 25000;
		roda2_hilang = 50000;
		int roda4_tarif, roda4_berikutnya, roda4_5sampai12, roda4_12sampai24, roda4_INAP, roda4_hilang;
		roda4_tarif = 6000;
		roda4_berikutnya = 2000;
		roda4_5sampai12 = 25000;
		roda4_12sampai24 = 55000;
		roda4_INAP = 50000;
		roda4_hilang = 100000;
		int roda6_tarif,  roda6_berikutnya, roda6_5sampai12, roda6_12sampai24, roda6_INAP, roda6_hilang;
		roda6_tarif = 8000;
		roda6_berikutnya = 3500;
		roda6_5sampai12 = 35000;
		roda6_12sampai24 = 70000;
		roda6_INAP = 70000;
		roda6_hilang = 100000;
		
		int banyak_roda,jam,total_tarif;
		System.out.print("Banyak Roda Pada Kendaraan : ");
		banyak_roda = input.nextInt();
		
		
		switch (banyak_roda) {
		case 2 :
			System.out.print("Apakah Karcis Ada : ");
			String karcisr2 = input.next();
			if (karcisr2.equals("ada")) {
				System.out.print("Lama Waktu Parkir : ");
				jam = input.nextInt();
				if (jam < 24) {
					total_tarif = roda2_tarif;
					System.out.print("Biaya Parkir : Rp. "+total_tarif+",-");
				} else if (jam > 24) {
					total_tarif = roda2_INAP;
					System.out.print("Biaya Parkir : Rp. "+total_tarif+",-");
				}
			} else if (karcisr2.contentEquals("tidak")){
				System.out.print("Biaya Parkir : Rp. "+roda2_hilang+",-");
			}
			break;
		case 4 :
			System.out.print("Apakah Karcis Ada : ");
			String karcisr4 = input.next();
			if (karcisr4.equals("ada")) {
				System.out.print("Lama Waktu Parkir : ");
				jam = input.nextInt();
				if (jam < 1) {
					total_tarif = roda4_tarif;
					System.out.print("Biaya Parkir : Rp. "+total_tarif+",-");
				} else if (jam > 1 && jam <5) {
					total_tarif = roda4_tarif+(jam*roda4_berikutnya);
					System.out.print("Biaya Parkir : Rp. "+total_tarif+",-");
				} else if (jam >= 5 && jam <=12) {
					total_tarif = roda4_5sampai12;
					System.out.print("Biaya Parkir : Rp. "+total_tarif+",-");
				} else if (jam > 12 && jam <= 24) {
					total_tarif = roda4_12sampai24;
					System.out.print("Biaya Parkir : Rp. "+total_tarif+",-");
				} else if (jam > 24) {
					total_tarif = roda4_INAP;
					System.out.print("Biaya Parkir : Rp. "+total_tarif+",-");
				}
			} else if (karcisr4.contentEquals("tidak")){
				System.out.print("Biaya Parkir : Rp. "+roda4_hilang+",-");
			}
			break;
		case 6 :
			System.out.print("Apakah Karcis Ada : ");
			String karcisr6 = input.next();
			if (karcisr6.equals("ada")) {
				System.out.print("Lama Waktu Parkir : ");
				jam = input.nextInt();
				if (jam < 1) {
					total_tarif = roda6_tarif;
					System.out.print("Biaya Parkir : Rp. "+total_tarif+",-");
				} else if (jam > 1 && jam <5) {
					total_tarif = roda6_tarif+(jam*roda6_berikutnya);
					System.out.print("Biaya Parkir : Rp. "+total_tarif+",-");
				} else if (jam >= 5 && jam <=12) {
					total_tarif = roda6_5sampai12;
					System.out.print("Biaya Parkir : Rp. "+total_tarif+",-");
				} else if (jam > 12 && jam <= 24) {
					total_tarif = roda6_12sampai24;
					System.out.print("Biaya Parkir : Rp. "+total_tarif+",-");
				} else if (jam > 24) {
					total_tarif = roda6_INAP;
					System.out.print("Biaya Parkir : Rp. "+total_tarif+",-");
				}
			} else if (karcisr6.contentEquals("tidak")){
				System.out.print("Biaya Parkir : Rp. "+roda6_hilang+",-");
			}
			break;
		}
		
	}
}
