/*
Surya Bintara (M3119083)
Yulanda Tri Wahyuni (M3119091)
 */
package Praktikum;

import java.util.Scanner;

public class tebak2hadiah {
	public static void main(String[]args) {
	//Input sisi yang diinginkan
	Scanner input = new Scanner(System.in);
	System.out.print("Silahkan masukkan sisi yang anda inginkan ");
	System.out.println("(0/3/4)");
	int sisi = input.nextInt();
	switch (sisi) {
	//Bangun datar segitiga
	case 0 :
		System.out.println("Lingkaran merupakan bangun datar yang memiliki 1 sisi, 1 titik pusat, dan diameter");
		System.out.println("Untuk mencari luas lingkaran menggunakan rumus L = 3.14 x r^2");
		System.out.println("Untuk mencari keliling lingkaran menggunakan rumus K = 2 x 3.14 x r");
		System.out.println("===========================================================================================");
		System.out.println("Masukkan nilai untuk mencari luas dan kelilingnya");
		System.out.print("Diameter : ");
		double diameter = input.nextInt();
		double luaslingkaran = 3.14*(diameter/2)*(diameter/2);
		double kelilinglingkaran = 2*3.14*(diameter/2);
		System.out.println("Luas : "+luaslingkaran);
		System.out.println("Keliling : "+kelilinglingkaran);
		break;
	case 3 :
		System.out.println("Bangun datar yang memiliki 3 sisi adalah segitiga");
		System.out.println("Silahkan masukan besar sudut yang anda ingin kan");
		System.out.print("Sudut pertama : ");
		int sudut1 = input.nextInt();
		System.out.print("Sudut kedua : ");
		int sudut2 = input.nextInt();
		System.out.print("Sudut ketiga : ");
		int sudut3 = input.nextInt();
		int jumlahsudut= sudut1+sudut2+sudut3;
			
			if (jumlahsudut==180) {
				
				if (sudut1==sudut2 && sudut1==sudut3) {		//segitiga sama sisi
					System.out.println("Berdasarkan data yang anda masukkan");
					System.out.println("Segitiga yang mempunyai 3 sudut sama besar yaitu segitiga sama sisi");
					System.out.println("Untuk menghitung luasnya menggunakan rumus L = (alas x tinggi)/2");
					System.out.println("Untuk menghitung kelilingnya menggunakan rumus K = 3 x panjang sisi");
					System.out.println("======================================================================");
					System.out.println("Masukkan data untuk menghitung luas dan keliling segitiga");
					System.out.print("Masukkan alas : ");
					int alas = input.nextInt();
					System.out.print("Masukkan tinggi : ");
					int tinggi = input.nextInt();
					float luas = (alas*tinggi);//menghitung luas segitiga
					float miring = (float) Math.sqrt( Math.pow((alas/2), 2) + Math.pow(tinggi,2));//menghitung sisi miring segitiga
					float keliling = (miring*2) + alas;//menghitung keliling segitiga
					System.out.println("Luas segitiga adalah : "+luas);
					System.out.println("Keliling segitiga adalah : "+keliling);
				}else if (sudut1==sudut2 || sudut1==sudut3) {	//segitiga sama kaki
					System.out.println("Berdasarkan data yang anda masukkan");
					System.out.println("Segitiga yang mempunyai 2 sudut sama besar yaitu segitiga sama kaki");
					System.out.println("Untuk menghitung luasnya menggunakan rumus L = (alas x tinggi)/2");
					System.out.println("Untuk menghitung kelilingnya menggunakan rumus K = 3 x sisi");
					System.out.println("======================================================================");
					System.out.println("Masukkan data untuk menghitung luas dan keliling segitiga");
					System.out.print("Masukkan alas : ");
					int alas = input.nextInt();
					System.out.print("Masukkan tinggi : ");
					int tinggi = input.nextInt();
					float luas = (alas*tinggi);//menghitung luas segitiga
					float miring = (float) Math.sqrt( Math.pow((alas/2), 2) + Math.pow(tinggi,2));//menghitung sisi miring segitiga
					float keliling = (miring*2) + alas;//menghitung keliling segitiga
					System.out.println("Luas segitiga adalah : "+luas);
					System.out.println("Keliling segitiga adalah : "+keliling);
				}else if (sudut1==90 || sudut2==90 || sudut3==90) { //segitiga siku siku, untuk  inputan 45 45 90 masuk di segitiga siku siku
					System.out.println("Berdasarkan data yang anda masukkan");
					System.out.println("Segitiga yang mempunyai sudut 90 yaitu segitiga siku siku");
					System.out.println("Untuk menghitung luasnya menggunakan rumus L = (alas x tinggi)/2");
					System.out.println("Untuk menghitung kelilingnya menggunakan rumus K = 3 x panjang sisi");
					System.out.println("======================================================================");
					System.out.println("Masukkan data untuk menghitung luas dan keliling segitiga");
					System.out.print("Masukkan alas : ");
					int alas = input.nextInt();
					System.out.print("Masukkan tinggi : ");
					int tinggi = input.nextInt();
					float luas = (alas*tinggi);//menghitung luas segitiga
					float miring = (float) Math.sqrt( Math.pow((alas/2), 2) + Math.pow(tinggi,2));//menghitung sisi miring segitiga
					float keliling = (miring*2) + alas;//menghitung keliling segitiga
					System.out.println("Luas segitiga adalah : "+luas);
					System.out.println("Keliling segitiga adalah : "+keliling);
				}else {	//segitiga sembarang
					System.out.println("Berdasarkan data yang anda masukkan");
					System.out.println("Segitiga yang mempunyai sudut sembarang yaitu segitiga sembarang");
					System.out.println("Untuk menghitung luasnya menggunakan rumus L = (alas x tinggi)/2");
					System.out.println("Untuk menghitung kelilingnya menggunakan rumus K = 3 x panjang sisi");
					System.out.println("======================================================================");
					System.out.println("Masukkan data untuk menghitung luas dan keliling segitiga");
					System.out.print("Masukkan panjang sisi 1 : ");
					int sisi1 = input.nextInt();
					System.out.print("Masukkan panjang sisi 2 : ");
					int sisi2 = input.nextInt();
					System.out.print("Masukkan panjang sisi 3 : ");
					int sisi3 = input.nextInt();
					float s = (float) (sisi1+sisi2+sisi3)/2;
					float luas = (float) Math.sqrt(Math.pow(s-sisi1, 1)*Math.pow(s-sisi2, 1)*Math.pow(s-sisi3, 1));
					System.out.println("Luas segitiga adalah : "+luas);
					System.out.println("Keliling segitiga adalah : "+s*2);
				}
			}else {
				System.out.println("Jumlah sudut segitiga harus berjumlah 180");
			}break;
	case 4 : //bangun datar yang memiliki 4 sisi
			System.out.println("Bangun datar yang memiliki 4 sisi yaitu : ");
			System.out.println("1. Persegi");
			System.out.println("2. Persegi panjang");
			System.out.println("3. Trapesium");
			System.out.println("4. Jajar genjang");
			System.out.println("5. Belah ketupat");
			System.out.println("6. Layang layang");
			System.out.println("=======================================================");
			System.out.println("Silahkan masukkan angka untuk melihat informasi bangun datar");
			int segi4 = input.nextInt();
			switch(segi4) {
				case 1 : // persegi
					System.out.println("Persegi adalah bangun datar yang memiliki 4 sisi sama panjang dan 4 sudut sama besar");
					System.out.println("Untuk mencari luas persegi menggunakan rumus L = sisi x sisi");
					System.out.println("Untuk mencari keliling persegi menggunakan rumus K = 4 x sisi");
					System.out.println("=========================================================================================");
					System.out.println("Masukkan panjang sisi untuk menghitung luas");
					System.out.print("Panjang sisi : ");
					int persegi = input.nextInt();
					int luaspersegi = persegi*persegi;
					int kelilingpersegi = 4*persegi;
					System.out.println("Luas persegi adalah : "+luaspersegi);
					System.out.println("Keliling persegi adalah : "+kelilingpersegi);
				case 2 : //persegi panjang
					System.out.println("Persegi panjang adalah bangun datar yang memiliki 4 sisi, 2 sisi panjang dan 2 sisi lebar");
					System.out.println("Untuk mencari luas persegi panjang menggunakan rumus L = panjang x lebar");
					System.out.println("Untuk mencari keliling persegi menggunakan rumus K = 2(panjang) + 2(lebar)");
					System.out.println("=========================================================================================");
					System.out.println("Masukkan nilai panjang dan lebar");
					System.out.print("Panjang : ");
					int panjang = input.nextInt();
					System.out.print("Lebar : ");
					int lebar = input.nextInt();
					int luasnya = panjang*lebar;
					int kelilingnya = (2*panjang)+(2*lebar);
					System.out.println("Luas persegi panjang adalah : "+luasnya);
					System.out.println("Keliling persegi panjang adalah : "+kelilingnya);
				case 3 : //trapesium
					System.out.println("Trapesium merupakan bangun datar yang memiliki 4 sisi");
					System.out.println("Untuk mencari luas trapesium bisa digunakan rumus berikut");
					System.out.println("(sisi bawah + sisi atas) x tinggi / 2");
					System.out.println("Untuk mencari kelilingnya mmenggunakan rumus K = sisi atas + sisi bawah + sisi samping");
					System.out.println("================================================================================================");
					System.out.println("Trapesium memiliki 2 jenis");
					System.out.println("1.Trapesium sama kaki");
					System.out.println("2. Trapesium sama sisi");
					System.out.println("Masukkan angka 1/2 untuk mencari luas dan keliling trapesium");
					int trapes = input.nextInt();
					if (trapes==1) {
						System.out.println("Masukkan nilai untuk mencari luas dan keliling trapesium sama kaki");
						System.out.print("Sisi bawah : ");
						int sibaw = input.nextInt();
						System.out.print("Sisi atas : ");
						int sitas = input.nextInt();
						System.out.print("Tinggi : ");
						int tinggi = input.nextInt();
						float luas = ((sibaw+sitas)*tinggi)/2;
						float sisimiring = (float) Math.sqrt(Math.pow((sibaw-sitas)/2, 2)+Math.pow(tinggi, 2));
						float keliling = sibaw+sitas+2*sisimiring;
						System.out.println("Luas trapesium : "+luas);
						System.out.println("Keliling trapesium : "+keliling);
					}else if (trapes==2) {
						System.out.println("Masukkan nilai untuk mencari luas dan keliling trapesium siku siku");
						System.out.print("Sisi bawah : ");
						int sibaw = input.nextInt();
						System.out.print("Sisi atas : ");
						int sitas = input.nextInt();
						System.out.print("Tinggi : ");
						int tinggi = input.nextInt();
						float luas = ((sibaw+sitas)*tinggi)/2;
						float sisimiring = (float) Math.sqrt(Math.pow((sibaw-sitas), 2)+Math.pow(tinggi, 2));
						float keliling = sibaw+sitas+2*sisimiring;
						System.out.println("Luas trapesium : "+luas);
						System.out.println("Keliling trapesium : "+keliling);
					}else {
						System.out.println("Inputan anda tidak ada dalam daftar");
					}
				case 4 : //jajar genjang
					System.out.println("Jajar genjang merupakan bangun datar yang memiliki 4 sis");
					System.out.println("Jajar genjang juga memiliki 2 sisi lancip dan 2 sisi tumpul");
					System.out.println("Untuk mencari luas jajar genjang menggunakan rumus L = alas x tinggi");
					System.out.println("Untuk mencari keliling jajar genjang yaitu menggunakan rummus K = 2(alas) x 2(sisi miring)");
					System.out.println("==================================================================");
					System.out.println("Masukkan nilai untuk menghitung luas dan keliling");
					System.out.print("Alas : ");
					int alas = input.nextInt();
					System.out.print("Tinggi : ");
					int tinggi = input.nextInt();
					System.out.print("Sisi miring : ");
					int sisimiring = input.nextInt();
					int luas = alas*tinggi;
					int keliling = 2*(alas+sisimiring);
					System.out.println("Luas : "+luas);
					System.out.println("Keliling : "+keliling);
				case 5 : //belah ketupat
					System.out.println("Belah ketupat merupakan bangun datar yang memiliki 4 sisi");
					System.out.println("Selain itu belah ketupat juga memiliki 2 diagonal yang sama panjang");
					System.out.println("Untuk mencari luas belah ketupat menggunakan rumus L = 1/2 x d1 x d2");
					System.out.println("Untuk mencari keliling belah ketupat yaitu menggunakan rumus K = 4 x sisi");
					System.out.println("============================================================================");
					System.out.println("Masukan nilai untuk menghitung luas dan keliling");
					System.out.print("Diagonal 1 : ");
					int d1 = input.nextInt();
					System.out.print("Diagonal 2 : ");
					int d2 = input.nextInt();
					int luasbelahketupat = (d1*d2)/2;
					float sisimiringe = (float)  Math.sqrt(Math.pow(d1/2, 2)+Math.pow(d2/2, 2));
					float kelilinge = 4*sisimiringe;
					System.out.println("Luas : "+luasbelahketupat);
					System.out.println("Keliling : "+kelilinge);
				case 6 ://layang layang
					System.out.println("Layang layang merupakan bangun datar yang memiliki 4 sisi");
					System.out.println("Layang layang memiliki 2 diagonal dan 2 pasang sudut siku siku");
					System.out.println("Untuk mencari luas layang layang menggunakan rumus L = 1/2 x d1 x d2");
					System.out.println("Untuk mencari keliling layang layang yaitu menggunakan rumus K = 4 x sisi");
					System.out.println("============================================================================");
					System.out.println("Masukan nilai untuk menghitung luas dan keliling");
					System.out.print("Diagonal 1 : ");
					int diagonal1 = input.nextInt();
					System.out.print("Diagonal 2 ; ");
					int diagonal2 = input.nextInt();
					System.out.print("Panjang sisi atas : ");
					int panjangsisi1 = input.nextInt();
					System.out.print("Panjang sisi bawah : ");
					int panjangsisi2 = input.nextInt();
					int luaslayang = (diagonal1*diagonal2)/2;
					int kelilinglayang = (panjangsisi1+panjangsisi2)*2;
					System.out.println("Luas : "+luaslayang);
					System.out.println("Keliling : "+kelilinglayang);
			}
		}
	}
}
