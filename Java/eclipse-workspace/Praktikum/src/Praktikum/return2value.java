package Praktikum;

public class return2value {
	public static void main(String[] args) {
		int [] angka = jumlah(100,50);
		System.out.println(angka[0]);
	}
	
	public static int [] jumlah (int a, int b) {
		int [] angka = new int [2];
		int hitung =0;
		int pengurang = 50;
		if (hitung==0) {
			angka[0] = a+pengurang;
		}
		else {
			angka[1] = b-pengurang;
		}
		return angka;
	} 
}
