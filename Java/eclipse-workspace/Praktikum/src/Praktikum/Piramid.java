package Praktikum;

public class Piramid {

	public static void main(String[] args) {
		int i,j,x,y;
		for (i=1;i<=3;i++)
			{	
				for (j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		for (x=2;x>=1;x--)
		{
			
			for (y=1;y<=x;y++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
	}
}