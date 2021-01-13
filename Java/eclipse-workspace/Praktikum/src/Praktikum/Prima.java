package Praktikum;

import java.util.Scanner;

public class Prima {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int angka = sc.nextInt();
	boolean prima = true;
	int sisa;
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

	}

}
