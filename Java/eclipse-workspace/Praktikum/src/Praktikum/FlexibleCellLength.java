package Praktikum;

import java.util.ArrayList;
import java.util.Scanner; // import the Scanner class 

public class FlexibleCellLength {
	public static void main(String[] args) {
		System.out.println("Minimal Record View");
		System.out.println("===================");
		System.out.println("+-----+--------------+");
		System.out.println("| NIM | Nama Lengkap |");
		System.out.println("+-----+--------------+");
		System.out.println("");
		Scanner isInputScan = new Scanner(System.in);
		String isInput;

		// Enter username and press Enter
		System.out.print("Insert data (y/n/Y/N) ?");
		isInput = isInputScan.nextLine();

		if (isInput.toLowerCase().equals("n")) {
			System.out.println("Thank you!");
			System.exit(0);
		}

		Scanner myObj = new Scanner(System.in);
		Integer qtyItem;

		// Enter username and press Enter
		System.out.print("Masukan jumlah data: ");
		qtyItem = Integer.parseInt(myObj.nextLine());

		ArrayList<String> arrayName = new ArrayList<String>();
		ArrayList<String> arrayNim = new ArrayList<String>();

		// for loop
		for (int i = 1; i <= qtyItem; i++) {
			Scanner nimScan = new Scanner(System.in);
			String nim;

			System.out.print("Insert NIM: ");
			nim = nimScan.nextLine();

			Scanner nameScan = new Scanner(System.in);
			String name;

			// Enter username and press Enter
			System.out.print("Insert Nama: ");
			name = nameScan.nextLine();

			// Add to array
			arrayName.add(nim);
			arrayNim.add(name);

			System.out.println("");
			System.out.println("Inserted: " + nim + " , " + name);
			System.out.println("");
		}

		System.out.println("+--------------+------------+");

		for (int i = 0; i < arrayNim.size(); i++) {
			// i is the index
			// yourArrayList.get(i) is the element
			System.out.println("| " + arrayName.get(i) + " | " + arrayNim.get(i) + " |");
			System.out.println("+--------------+------------+");
		}
	}
}