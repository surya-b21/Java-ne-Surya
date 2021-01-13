package Praktikum;

public class GaussJordanSolve {
	public static void main(String[] args) {
		double [][] ray = new double [3][4];
		double kerja;
		for (int i=0; i<ray.length;i++) {
			for (int j=0; j<ray[0].length; j++) {
				ray [i][j] = (int) (Math.random()*9)+1;
			}
		}
		System.out.println("Matrix sebelum diubah");
		for (int a=0; a<ray.length; a++) {
			for (int b=0; b<ray[0].length; b++) {
				if (b==3) 
					System.out.print("|\t");
				System.out.print((float)ray[a][b]+"\t");
			}
			System.out.println();
		}
		kerja=ray[0][0];
		for (int c=0; c<ray[0].length; c++) {
			ray[0][c]=ray[0][c]/kerja;
		}
		System.out.println("Membagi baris pertama dengan indeks [0][0]");
		for (int a=0; a<ray.length; a++) {
			for (int b=0; b<ray[0].length; b++) {
				if (b==3) 
					System.out.print("|\t");
				System.out.print((float)ray[a][b]+"\t");
			}
			System.out.println();
		}
		kerja=ray[1][0];
		for (int c=0; c<ray[0].length; c++) {
			ray[1][c]=ray[1][c]-kerja;
		}
		System.out.println("Mengurangi baris pertama dengan indeks [1][0]");
		for (int a=0; a<ray.length; a++) {
			for (int b=0; b<ray[0].length; b++) {
				if (b==3) 
					System.out.print("|\t");
				System.out.print((float)ray[a][b]+"\t");
			}
			System.out.println();
		}
		kerja=ray[1][1];
		for (int c=0; c<ray[0].length; c++) {
			ray[1][c]=ray[1][c]/kerja;
		}
		System.out.println("Membagi baris kedua dengan indeks [1][1]");
		for (int a=0; a<ray.length; a++) {
			for (int b=0; b<ray[0].length; b++) {
				if (b==3) 
					System.out.print("|\t");
				System.out.print((float)ray[a][b]+"\t");
			}
			System.out.println();
		}
		kerja=ray[2][0];
		for (int c=0; c<ray[0].length; c++) {
			ray[2][c]=ray[2][c]-kerja;
		}
		System.out.println("Mengurangi baris ketiga dengan indeks [2][0]");
		for (int a=0; a<ray.length; a++) {
			for (int b=0; b<ray[0].length; b++) {
				if (b==3) 
					System.out.print("|\t");
				System.out.print((float)ray[a][b]+"\t");
			}
			System.out.println();
		}
		kerja=ray[2][1];
		for (int c=0; c<ray[0].length; c++) {
			ray[2][c]=(kerja*ray[1][1])-ray[2][1];
		}
		System.out.println("Mengalikan indeks [2][1] dengan baris kedua kemudian dikurangi baris ketiga");
		for (int a=0; a<ray.length; a++) {
			for (int b=0; b<ray[0].length; b++) {
				if (b==3) 
					System.out.print("|\t");
				System.out.print((float)ray[a][b]+"\t");
			}
			System.out.println();
		}
		kerja=ray[2][2];
		for (int c=0; c<ray[0].length; c++) {
			ray[2][c]=ray[2][c]/kerja;
		}
		System.out.println("Membagi baris ketiga dengan indkes [2][2]");
		for (int a=0; a<ray.length; a++) {
			for (int b=0; b<ray[0].length; b++) {
				if (b==3) 
					System.out.print("|\t");
				System.out.print((float)ray[a][b]+"\t");
			}
			System.out.println();
		}
		kerja=ray[1][2];
		for (int c=0; c<ray[0].length; c++) {
			ray[1][c] = ray[1][c]-(kerja*ray[2][c]);
		}
		System.out.println("baris kedua ditambah dengan -1 x (baris ketiga x indeks [1][2]");
		for (int a=0; a<ray.length; a++) {
			for (int b=0; b<ray[0].length; b++) {
				if (b==3) 
					System.out.print("|\t");
				System.out.print((float)ray[a][b]+"\t");
			}
			System.out.println();
		}
		kerja=ray[0][2];
		for (int c=0; c<ray[0].length; c++) {
			ray[0][c] = ray[0][c]-(kerja*ray[2][c]);
		}
		System.out.println("baris pertama ditambah dengan -1 x (baris ketiga x indeks [0][2]");
		for (int a=0; a<ray.length; a++) {
			for (int b=0; b<ray[0].length; b++) {
				if (b==3) 
					System.out.print("|\t");
				System.out.print((float)ray[a][b]+"\t");
			}
			System.out.println();
		}
		kerja=ray[0][1];
		for (int c=0; c<ray[0].length;c++) {
			ray[0][c] = ray[0][c]-(kerja*ray[1][c]);
		}
		System.out.println("Baris pertama ditambah dengan -1 x (baris kedua x indkes [0][1]");
		for (int a=0; a<ray.length; a++) {
			for (int b=0; b<ray[0].length; b++) {
				if (b==3) 
					System.out.print("|\t");
				System.out.print((float)ray[a][b]+"\t");
			}
			System.out.println();	
		}
		System.out.print("X = "+ray[0][3]+"\nY = "+ray[1][3]+"\nZ = "+ray[2][3]);
	}
}
