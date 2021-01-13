import java.util.Scanner;
public class Praktikum {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Masukkan nilai yang akan di swap");
	System.out.print("A : ");
	int a = input.nextInt();
	System.out.print("B : ");
	int b = input.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("A : "+a);
	System.out.println("B : "+b);
	}
}