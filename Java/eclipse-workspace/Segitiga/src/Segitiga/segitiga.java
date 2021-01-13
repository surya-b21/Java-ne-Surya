package Segitiga;

	import java.util.Scanner;
	
public class segitiga{ 
	public static void main(String[] args) {
		//input alas dan tinggi segitiga
		Scanner data = new Scanner(System.in);
		System.out.print("Masukan nilai alas ");
		int alas = data.nextInt();
		System.out.print("Masukan nilai tinggi ");
		int tinggi = data.nextInt();
		
		
		//operasi penghitungan luas
		float luas = (alas*tinggi)/2;
		
		//operasi penghitungan keliling
			//menghitung sisi miring
				double miring = Math.sqrt( Math.pow((alas/2), 2) + Math.pow(tinggi,2));
		
		double keliling = (miring*2) + alas;
		
		//menampilkan hasil
		System.out.println("===================");
		System.out.println("Luas segitiga = "+luas);
		System.out.println("Keliling segitga = "+keliling);
		
		
		
	}
}
