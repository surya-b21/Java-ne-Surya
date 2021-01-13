package Praktikum;

import java.util.Scanner;

public class PermutasiKombinasi {

	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Silahkan pilih program yang akan digunakan");
	System.out.println("1. Permutasi");
	System.out.println("2. Kombinasi");
	int lebokan = input.nextInt();
	int faktor1 = 1;
	int faktor2 = 1; 
	int faktor3 = 1;
	switch (lebokan) {
		case 1 :
			System.out.println("Silahkan masukkan nilai n dan r");
			System.out.print("n : ");
			int n = input.nextInt();
			System.out.print("r : ");
			int r = input.nextInt();
			int p = n-r;
			for (int i = 1; i<=n ;i++) 
			{
				faktor1*=i;	
			}
			for (int i = 1; i<=p ;i++)
			{
				faktor2*=i;
			}
			float permutasi = faktor1/faktor2;
			System.out.println(permutasi);
		case 2 :
			System.out.println("Silahkan masukkan nilai n dan r");
			System.out.print("n : ");
			int a = input.nextInt();
			System.out.print("r : ");
			int b = input.nextInt();
			int c = a-b;
			for (int i = 1; i<=a ;i++) 
			{
				faktor1*=i;	
			}
			for (int i = 1; i<=c ;i++)
			{
				faktor2*=i;
			}
			for (int i =1; i<=b ;i++)
			{
				faktor3*=i;
			}
			float kombinasi = faktor1/(faktor2*faktor3);
			System.out.println(kombinasi);
			
		}
	}
}
