package Praktikum;

import java.util.Scanner;

public class Faktorial {
	
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int faktor = 1;
	int n = sc.nextInt();
	for (int i = 1; i<=n; i++) {
		faktor*=i;
		}
	System.out.println(faktor);
	}
}
