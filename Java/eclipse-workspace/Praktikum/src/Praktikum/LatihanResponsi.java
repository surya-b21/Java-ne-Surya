package Praktikum;

public class LatihanResponsi {

	public static void main(String[] args) {
		int[] array = { 10, 10, 2, 3, 5, 10 };
		int sepuluh = 0;
		int dua = 0;
		int tiga = 0;
		int lima = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 10) {
				sepuluh += 1;
			} else if (array[i] == 2) {
				dua += 1;
			} else if (array[i] == 3) {
				tiga += 1;
			} else if (array[i] == 5) {
				lima += 1;
			}
		}
		System.out.println("Banyaknya angka sepuluh \t: " + sepuluh);
		System.out.println("Banyaknya angka dua \t\t: " + dua);
		System.out.println("Banyaknya angka tiga \t\t: " + tiga);
		System.out.println("Banyaknya angka lima \t\t: " + lima);
	}
}
