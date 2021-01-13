package Robot;

   import java.util.Scanner;

public class RobotJos {

	public static void main(String[] args) {
			Scanner trace = new Scanner(System.in);
			System.out.println("Silahkan input data ");
			
			//input data vertikal
				System.out.print("Atas ");
				float atas = trace.nextFloat();
				System.out.print("Bawah ");
				float bawah = trace.nextFloat();
			
			//input data horizontal
				System.out.print("Kiri ");
				float kiri = trace.nextFloat();
				System.out.print("Kanan ");
				float kanan = trace.nextFloat();
			
			//operasi penghitungan jarak
				float jarak = (float) Math.sqrt( Math.pow(atas-bawah,2) + Math.pow(kiri-kanan, 2));
			
			//mengubah data float ke int
				float a = jarak;
				int b = (int) a;
				
			//menampilkan hasil
				System.out.println("=====================");
				System.out.print("Jarak saat ini adalah "+b);
	}

}
