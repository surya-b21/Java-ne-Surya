public class FungsiRekursif {
	public static void main (String[]args) {
		deretGanjil(1);
	}
	
	static void deretGanjil (int i) {
		if (i<=21) {
			System.out.print(i + " ");
			deretGanjil(i+=2);
		}
	}
}