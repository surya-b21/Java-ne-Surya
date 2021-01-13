
package Praktikum;

import java.util.Scanner;

public class FPB2 {

	public static void main(String[] args) {
		boolean running = true;
		String ya,tidak;
		Scanner input = new Scanner(System.in);
		while (running) {
			System.out.println("Apakah anda ingin keluar ? ");
			System.out.println("ya/tidak");
			String keluar = input.next();
		if(keluar.equals("ya")) {
			running = false;
			}
		}System.out.println("terima kasih");
	}
}