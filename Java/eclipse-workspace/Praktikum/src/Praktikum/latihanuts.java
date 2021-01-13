package Praktikum;

import java.util.Scanner;

public class latihanuts {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Silahkan masukkan bilangan : ");
		int angka = input.nextInt();
		boolean prima = true;
		int sisa;
		if (angka%2==0)
		{
			System.out.println("Angka Genap");
			for (int pembagi=2; pembagi<=angka/2; pembagi++)
			{
				sisa = angka%pembagi;
				if (sisa==0)
				{
					prima=false;
					break;
				}
			}
			if (prima && ((angka>0)&&(angka!=1)))
					System.out.println("Bilangan Prima");
			else
					System.out.println("Bukan Bilangan Prima");
		}else {
			System.out.println("Angka Ganjil");
			for (int pembagi=2; pembagi<=angka/2; pembagi++)
		{
			sisa = angka % pembagi;
			if (sisa==0)
			{
				prima=false;
				break;
			}
		}
		if (prima && ((angka>0)&&(angka!=1)))
				System.out.println("Bilangan Prima");
		else
				System.out.println("Bukan Bilangan Prima");
		}
	}
}
