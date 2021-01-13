package Praktikum;

public class Tugaslagi {

	public static void main(String[] args) {
		int [] kotak = {9,8,7,6,5,4,3,2,1};
		int kosongan = 0;
		for (int i = 0; i<kotak.length; i++) {
			if (i == 0) {
				System.out.print("{");
			}
			System.out.print(kotak[i]);
			if (i<(kotak.length-1)) {
				System.out.print(",");
			}
			if (i == (kotak.length-1)) {
				System.out.print("}");
			}
		}
		for (int j = 0; j<kotak.length-1; j++) {
			for (int k = 0; k<kotak.length-1; k++) {
				if (kotak[k]>kotak[k+1]) {
					kosongan = kotak[k];
					kotak[k] = kotak[k+1];
					kotak[k+1] = kosongan;
				}			
			}
			System.out.println();
			for (int i = 0; i<kotak.length; i++) {
				if (i == 0) {
					System.out.print("{");
				}
				System.out.print(kotak[i]);
				if (i<(kotak.length-1)) {
					System.out.print(",");
				}
				if (i == (kotak.length-1)) {
					System.out.print("}");
				}
			}
		}
	}

}
