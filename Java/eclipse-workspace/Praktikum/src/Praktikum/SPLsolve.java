package Praktikum;

public class SPLsolve {
	
	public static void main (String [] args) {
		double [][] ray = new double [3][4];
		double kerja;
		double x;
		double y;
		double z;
		for (int i=0; i<ray.length;i++) {
			for (int j=0; j<ray[0].length; j++) {
				ray [i][j] = (int) (Math.random()*9)+1;
			}
		}
		kerja=ray[0][0];
		for (int c=0; c<ray[0].length; c++) {
			ray[0][c]=ray[0][c]/kerja;
		}
		kerja=ray[1][0];
		for (int c=0; c<ray[0].length; c++) {
			ray[1][c]=ray[1][c]-kerja;
		}
		kerja=ray[1][1];
		for (int c=0; c<ray[0].length; c++) {
			ray[1][c]=ray[1][c]/kerja;
		}
		kerja=ray[2][0];
		for (int c=0; c<ray[0].length; c++) {
			ray[2][c]=ray[2][c]-kerja;
		}
		kerja=ray[2][1];
		for (int c=0; c<ray[0].length; c++) {
			ray[2][c]=(kerja*ray[1][1])-ray[2][1];
		}
		kerja=ray[2][2];
		for (int c=0; c<ray[0].length; c++) {
			ray[2][c]=ray[2][c]/kerja;
		}
		
		for (int a=0; a<ray.length; a++) {
			for (int b=0; b<ray[0].length; b++) {
				if (b==3) 
					System.out.print("|\t");
				System.out.print((float)ray[a][b]+"\t");
			}
			System.out.println();
		}
		z = ray[2][3];
		double tempy = z*ray[1][2];
		if (tempy>0) {
			y = ray[1][3]-tempy; 
		} else {
			y = ray[1][3]+tempy;
		}
		double tempx = (z*ray[0][2])+(y*ray[0][1]);
		if (tempx>0) {
			x = ray[0][3]-tempx; 
		} else {
			x = ray[0][3]+tempx;
		}
		System.out.println("x = "+x+"\ny = "+y+"\nz = "+z);
		
	}
}
