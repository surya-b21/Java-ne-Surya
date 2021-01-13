package Praktikum;

public class ResponsiFixed {

	public static void main(String[] args) {
		int[] array = { 10, 10, 2, 3, 5, 10 };
		int[] checker = { 10, 2, 3, 5 };
		int count = 0;
		for (int i = 0; i < checker.length; i++) {
			count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == checker[i])
					count++;
			}
			System.out.println("Banyak data " + checker[i] + " adalah " + count);
		}

	}

}
