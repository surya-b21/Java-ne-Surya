package Praktikum;

import java.util.Scanner;

public class Gaji {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Silahkan isi seuai data anda");
		System.out.println ("Apakah anda sudah berkeluarga ?");
		String keluarga = sc.next();
		if (keluarga.equals("Sudah")||keluarga.equals("sudah"))
		{
			System.out.println("Berapakah jumlah anak anda ?");
			int anak = sc.nextInt();
			switch (anak)
			{
			case 0 :
				System.out.println("Sebutkan golongan gaji anda");
				int gaji = sc.nextInt();
				if (gaji==1)
				{
					int gajikotor = 1000000+200000;
					System.out.print("Gaji anda adalah : "+gajikotor);
				}
				if (gaji==2)
				{
					int gajikotor = 2000000+200000;
					double gajibersih = (int) gajikotor-(gajikotor*(2.5/100));
					System.out.print("Gaji anda adalah : "+gajibersih);
				}
				if (gaji==3)
				{
					int gajikotor = 3000000+200000;
					double gajibersih = (int) gajikotor-(gajikotor*(5.0/100));
					System.out.print("Gaji anda adalah : "+gajibersih);
				}
				break;
			case 1 :
				int tunjangan1 = 100000;
				System.out.println("Sebutkan golongan gaji anda");
				int gaji1 = sc.nextInt();
				if (gaji1==1)
				{
					int gajikotor = 1000000+200000+tunjangan1;
					System.out.print("Gaji anda adalah : "+gajikotor);
				}
				if (gaji1==2)
				{
					int gajikotor = 2000000+200000+tunjangan1;
					double gajibersih = (int) gajikotor-(gajikotor*(2.5/100));
					System.out.print("Gaji anda adalah : "+gajibersih);
				}
				if (gaji1==3)
				{
					int gajikotor = 3000000+200000+tunjangan1;
					double gajibersih = (int) gajikotor-(gajikotor*(5.0/100));
					System.out.print("Gaji anda adalah : "+gajibersih);
				}
				break;
			case 2 :
				int tunjangan2 = 200000;
				System.out.println("Sebutkan golongan gaji anda");
				int gaji2 = sc.nextInt();
				if (gaji2==1)
				{
					int gajikotor = 1000000+200000+tunjangan2;
					System.out.print("Gaji anda adalah : "+gajikotor);
				}
				if (gaji2==2)
				{
					int gajikotor = 2000000+200000+tunjangan2;
					double gajibersih = (int) gajikotor-(gajikotor*(2.5/100));
					System.out.print("Gaji anda adalah : "+gajibersih);
				}
				if (gaji2==3)
				{
					int gajikotor = 3000000+200000+tunjangan2;
					double gajibersih = (int) gajikotor-(gajikotor*(5.0/100));
					System.out.print("Gaji anda adalah : "+gajibersih);
				}
				break;
			default :
				int tunjangan3 = 300000;
				System.out.println("Sebutkan golongan gaji anda");
				int gaji3 = sc.nextInt();
				if (gaji3==1)
				{
					int gajikotor = 1000000+200000+tunjangan3;
					System.out.print("Gaji anda adalah : "+gajikotor);
				}
				if (gaji3==2)
				{
					int gajikotor = 2000000+200000+tunjangan3;
					double gajibersih = (int) gajikotor-(gajikotor*(2.5/100));
					System.out.print("Gaji anda adalah : "+gajibersih);
				}
				if (gaji3==3)
				{
					int gajikotor = 3000000+200000+tunjangan3;
					double gajibersih = (int) gajikotor-(gajikotor*(5.0/100));
					System.out.print("Gaji anda adalah : "+gajibersih);
				}
			
			}
		}else if (keluarga.equals("Belum")||keluarga.equals("belum"))
		{
			System.out.println("Sebutkan golongan gaji anda");
			int gaji = sc.nextInt();
			if (gaji==1)
			{
				int gajikotor = 1000000;
				System.out.print("Gaji anda adalah : "+gajikotor);
			}
			if (gaji==2)
			{
				int gajikotor = 2000000;
				double gajibersih = (int) gajikotor-(gajikotor*(2.5/100));
				System.out.print("Gaji anda adalah : "+gajibersih);
			}
			if (gaji==3)
			{
				int gajikotor = 3000000;
				double gajibersih = (int) gajikotor-(gajikotor*(5.0/100));
				System.out.print("Gaji anda adalah : "+gajibersih);
			}
			
		}
	}

}
