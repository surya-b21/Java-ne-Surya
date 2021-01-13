package Praktikum;

public class Fibonacci {
	public static void main(String[] args) {
		int motel = 0;
		for (int n=1;n<20;n++) {
			for(int i=1;i<=n;i++) {
				if (n%i==0) {
					motel++;
				}if (motel==2) {
					System.out.println(motel);
				}motel =0;
			}
		}
	
	}

}