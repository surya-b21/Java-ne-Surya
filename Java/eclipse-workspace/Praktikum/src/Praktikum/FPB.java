package Praktikum;

import java.util.Scanner;

public class FPB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah apel : ");
		int apel = input.nextInt();
		System.out.print("Masukkan jumlah jeruk : ");
		int jeruk = input.nextInt();
		
		if (apel>jeruk)
		{
			for (int i=jeruk ; jeruk>=1 ; jeruk--)
			{
				if ((apel%jeruk==0)&&(jeruk%jeruk==0))
				{
					int a = jeruk;
					if (a>1)
					{
						System.out.println("Kantong Plastik yang dibutuhkan sebanyak "+jeruk);
						break;
					}
					System.out.println("Kantong Plastik yang dibutuhkan sebanyak "+jeruk);
				}
			}
		}
		else
		{
			for (int i=apel ; apel>=1 ; apel--)
			{
				if ((apel%apel==0)&&(jeruk%apel==0))
				{
					int a = apel;
					if (a>1)
					{
						System.out.println("Kantong Plastik yang dibutuhkan sebanyak "+apel);
						break;
					}
					System.out.println("kantong Plastik yang dibutuhkan sebanyak "+apel);
				}
			}
		}
	}
}
