package Praktikum;

import java.util.Arrays;
import java.util.Scanner;

public class Statistika {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Silahkan masukkan banyak data yang diinginkan : ");
		int masuk = input.nextInt();
		int [] wadahe = new int[masuk];
		int hasil = 0;
		for (int i = 0; i < masuk ; i++)
		{
			System.out.print("Data ke-"+(i+1)+": ");
			wadahe[i] = input.nextInt();
			hasil += wadahe[((int)i)];
		}
		
		System.out.println("Silahkan pilih program yang akan dipakai");
		System.out.println("1. Standar deviasi");
		System.out.println("2. Median");
		System.out.println("3. Modus");
		int pilih = input.nextInt();
		
		switch (pilih) {
		case 1 :
			float rata2 = (float) hasil/masuk;
			float a,hasil2;
			int b=0;
			float hasil3 = 0;
			while (b < masuk){
				float deviasi = (float) Math.pow((wadahe[(int)b])-rata2, 2);
				b++;
				hasil3 =+ deviasi;
			}
			float sd1 = (float) Math.sqrt(hasil3/masuk);
			System.out.println("Standar deviasinya adalah : "+sd1);
			break;
		case 2 :
			Arrays.sort(wadahe);
			float modusgenap,modusganjil;
			if (masuk%2==0)
			{
				modusgenap = (float) (wadahe[(int) ((int)(masuk/2)+0.5)]+wadahe[(int) ((int)(masuk/2)-0.5)])/2;
				System.out.print("Median dari data tersebut adalah : "+modusgenap);
			}else {
				modusganjil = (float) (wadahe[(int) ((int)((masuk/2))+0.5)]);
				System.out.print("Median dari data tersebut adalah : "+modusganjil);
			}
			break;
		case 3 :
			int a1=0;
			int b1=0;
			int hasil1=0,besar=0;
			Arrays.sort(wadahe);
			for (int i=0; i<masuk; i++) {
				for (int j=0; j<masuk; j++) {
					if ((wadahe[j]==wadahe[i]) && j!=i) {
						hasil1++;}}
				if (hasil1>=besar) {
					besar=hasil1;
					a1 = wadahe[i];
					hasil1=0;
				}
			}
			System.out.println("Modus dari data tersebut adalah : "+a1);
		}
	}
}