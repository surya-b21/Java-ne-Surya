package Praktikum;

public class ResponsiKe2 {

	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			System.out.print(+fibonacci(i)+" ");
		}
}
	
	static int fibonacci (int i) {
		if (i==0||i==1) {
			return 1;
		}
		else if (i==2||i==3) {
			return i+fibonacci(i-2)-fibonacci(i-2);
		}
		return i+fibonacci(i-1)-fibonacci(i-2);
	}
}
