
package Praktikum;

public class mmboh {
	
	public static void main(String[]args) {
		int [] arrays = {1,2,3,4,5,6,7,8,9};
		for (int j=1; j<=9; j++) {
			for (int i=0; i<=7; i++) {
				arrays[i]=arrays[i+1];
				System.out.print(arrays[i]+",");
				if (i==7) {
					arrays[8]=arrays[0]-1;
					System.out.print(arrays[8]);
				}
			}System.out.println(" ");	
		}
	}
}
