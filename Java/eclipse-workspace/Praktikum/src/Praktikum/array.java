package Praktikum;

public class array {

	public static void main(String[] args) {
		int [][] jumlah= new int[2][2];
		int [][] array = {{1,2},{3,4}};
		int [][] array2 = {{5,6},{7,8}};
		for (int i=0; i<array.length;i++ ) {
			for (int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}System.out.println(" ");
		}
		for (int i=0; i<array2.length;i++ ) {
			for (int j=0;j<array2[i].length;j++) {
				System.out.print(array2[i][j]+" ");
			}System.out.println(" ");
		}
		for (int i=0; i<jumlah.length;i++ ) {
			for (int j=0;j<jumlah[i].length;j++) {
				jumlah[i][j] = array[i][j] + array2 [i][j];
			}
		}	
		for (int i=0; i<jumlah.length;i++ ) {
			for (int j=0;j<jumlah[i].length;j++) {
				System.out.print(jumlah[i][j]+" ");
			}System.out.println(" ");
		}
	}

}
