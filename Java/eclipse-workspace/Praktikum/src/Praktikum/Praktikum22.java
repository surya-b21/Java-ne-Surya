package Praktikum;

import java.util.Scanner;

public class Praktikum22 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		boolean keluar = false;
		while (keluar == false) {
			println("Silahkan masukkan sudut! (0/3/4)");
			int milih = input.nextInt();
			switch (milih) {
			case 0:
				println("Lingkaran");
				println("Silahkan masukkan panjang diameter.");
				int diameter = input.nextInt();
				float keliling = (int) (3.14 * diameter);
				float luas = (int) (3.14 * (diameter / 2) * (diameter / 2));
				println("Keliling lingkaran adalah \t: " + keliling);
				println("Luas lingkaran adalah \t\t: " + luas);
				break;
			case 3:
				int[] sudut = new int[3];
				int jumlahsudut = 0;
				println("Segitiga");
				println("Silahkan masukkan sudut segitiga");
				for (int i = 0; i < sudut.length; i++) {
					print("Masukkan sudut ke-" + (i + 1) + " : ");
					sudut[i] = input.nextInt();
				}
				for (int j = 0; j < sudut.length; j++) {
					jumlahsudut += sudut[j];
				}
				if (jumlahsudut == 180) {
					if (sudut[0] == sudut[1] && sudut[0] == sudut[2]) {
						println("Segitiga yang mempunyai 3 sudut sama besar adalah segitiga sama sisi");
						print("Silahkan masukkan alas segitiga : ");
						int alas = input.nextInt();
						print("Silahkan masukkan tinggi segitiga : ");
						int tinggi = input.nextInt();
						println("Ingin menampilkan keliling atau luas ?");
						String tampilkan = input.next();
						if (tampilkan.equals("keliling") || tampilkan.equals("Keliling")) {
							print("Keliling segitiganya adalah : " + kelilingsegitiga(alas, tinggi));
						} else if (tampilkan.equals("luas") || tampilkan.equals("Luas")) {
							print("Luas segitiganya adalah : " + luassegitiga(alas, tinggi));
						}
					} else if (sudut[0] == sudut[1] || sudut[0] == sudut[2] || sudut[1] == sudut[2]) {
						println("Segitiga yang mempunyai 2 sudut sama besar yaitu segitiga sama kaki");
						print("Silahkan masukkan alas segitiga : ");
						int alas = input.nextInt();
						print("Silahkan masukkan tinggi segitiga : ");
						int tinggi = input.nextInt();
						println("Ingin menampilkan keliling atau luas ?");
						String tampilkan = input.next();
						if (tampilkan.equals("keliling") || tampilkan.equals("Keliling")) {
							println("Keliling segitiganya adalah : " + kelilingsegitiga(alas, tinggi));
						} else if (tampilkan.equals("luas") || tampilkan.equals("Luas")) {
							println("Luas segitiganya adalah : " + luassegitiga(alas, tinggi));
						}
					} else if (sudut[0] == 90 || sudut[1] == 90 || sudut[2] == 90) {
						println("Segitiga yang mempunyai sudut 90 derajat adalah segitiga siku-siku");
						print("Silahkan masukkan alas segitiga : ");
						int alas = input.nextInt();
						print("Silahkan masukkan tinggi segitiga : ");
						int tinggi = input.nextInt();
						println("Ingin menampilkan keliling atau luas ?");
						String tampilkan = input.next();
						if (tampilkan.equals("keliling") || tampilkan.equals("Keliling")) {
							println("Keliling segitiganya adalah : " + kelilingsegitiga(alas, tinggi));
						} else if (tampilkan.equals("luas") || tampilkan.equals("Luas")) {
							println("Luas segitiganya adalah : " + luassegitiga(alas, tinggi));
						}
					} else {
						println("Segitiga yang sudutnya sembarang adalah segitiga sembarang");
						print("Masukkan panjang sisi 1 : ");
						int sisi1 = input.nextInt();
						print("Masukkan panjang sisi 2 : ");
						int sisi2 = input.nextInt();
						print("Masukkan panjang sisi 3 : ");
						int sisi3 = input.nextInt();
						float s = (float) (sisi1 + sisi2 + sisi3) / 2;
						println("Ingin menampilkan keliling atau luas ?");
						String tampilkan = input.next();
						if (tampilkan.equals("keliling") || tampilkan.equals("Keliling")) {
							println("Keliling segitiganya adalah : " + s * 2);
						} else if (tampilkan.equals("luas") || tampilkan.equals("Luas")) {
							float luassegitiga = (float) Math
									.sqrt(Math.pow(s - sisi1, 1) * Math.pow(s - sisi2, 1) * Math.pow(s - sisi3, 1));
							println("Luas segitiga adalah : " + luassegitiga);
						}
					}
				} else {
					println("Segitiga maksimal memiliki jumlah sudut 180 derajat");
				}
				break;
			case 4:
				println("Silahkan ketik bangunan yang ingin anda gunakan");
				String ketik = input.next();
				if (ketik.contentEquals("persegi") || ketik.equals("Persegi")) {
					persegi();
				} else if (ketik.contentEquals("persegi panjang") || ketik.equals("Persegi panjang")) {
					persegipanjang();
				} else if (ketik.contentEquals("trapesium") || ketik.equals("Trapesium")) {
					trapesium();
				} else if (ketik.contentEquals("jajar genjang") || ketik.equals("Jajar genjang")) {
					jajargenjang();
				} else {
					println("Bangun datar yang anda ketikkan tidak ada dalam daftar");
				}
				break;
			}

			println("Apakah anda ingin lagi ?");
			String apl = input.next();
			if (apl.equals("tidak")) {
				keluar = true;
			}
		}
		println("Terima kasih");
	}

	public static void println(String kata) {
		System.out.println(kata);
	}

	public static void print(String kata) {
		System.out.print(kata);
	}

	public static void persegi() {
		println("bangun datar yang anda pilih adalah persegi \nSilahkan menginput sisinya");
		int sisi = input.nextInt();
		println("Ingin melihat keliling atau luas ?");
		String lihat = input.next();
		if (lihat.equals("keliling") || lihat.equals("Keliling")) {
			println("Keliling persegi adalah : " + kelilingpersegi(sisi));
		} else if (lihat.equals("luas") || lihat.equals("Luas")) {
			println("Luas persegi adalah : " + luaspersegi(sisi));
		}
	}

	public static void persegipanjang() {
		println("Bangun datar yang anda pilih adalah persegi panjang \nSilahkan menginput panjang dan lebarnya");
		print("panjang : ");
		int panjang = input.nextInt();
		print("lebar : ");
		int lebar = input.nextInt();
		println("ingin menampilkan keliling atau luas ?");
		String tampilkan = input.next();
		if (tampilkan.equals("keliling") || tampilkan.equals("Keliling")) {
			println("Keliling persegi panjang adalah : " + kelilingpersegipanjang(panjang, lebar));
		} else if (tampilkan.equals("luas") || tampilkan.equals("Luas")) {
			println("Luas persegi panjang adalah : " + luaspersegipanjang(panjang, lebar));
		}
	}

	public static void trapesium() {
		println("Bangun datar yang anda pilih adalah trapesium\nSilahkan inputkan nilai");
		print("alas bawah : ");
		int alasbawah = input.nextInt();
		print("alas atas : ");
		int alasatas = input.nextInt();
		print("tinggi : ");
		int tinggi = input.nextInt();
		print("sisi miring : ");
		int sisimiring = input.nextInt();
		println("ingin menampilkan keliling atau luas ?");
		String tampilkan = input.next();
		if (tampilkan.equals("keliling") || tampilkan.equals("Keliling")) {
			println("Keliling trapesium adalah : " + kelilingtrapesium(alasbawah, alasatas, sisimiring));
		} else if (tampilkan.equals("luas") || tampilkan.equals("Luas")) {
			println("Luas trapesium adalah : " + luastrapesium(alasbawah, alasatas, tinggi));
		}
	}

	public static void jajargenjang() {
		println("Bangun datar yang anda pilih adalah jajar genjang\nSilahkan inputkan nilai");
		print("alas : ");
		int alas = input.nextInt();
		print("tinggi : ");
		int tinggi = input.nextInt();
		print("sisi miring : ");
		int sisimiring = input.nextInt();
		println("ingin menampilkan keliling atau luas ?");
		String tampilkan = input.next();
		if (tampilkan.equals("keliling") || tampilkan.equals("Keliling")) {
			println("Keliling jajar genjang adalah : " + kelilingjajargenjang(alas, sisimiring));
		} else if (tampilkan.equals("luas") || tampilkan.equals("Luas")) {
			println("Luas jajar genjang adalah : " + luasjajargenjang(alas, tinggi));
		}
	}

	public static int kelilingsegitiga(int alas, int tinggi) {
		float sisimiring = (int) Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));
		float keliling = (sisimiring * 2) + alas;
		return (int) keliling;

	}

	public static int luassegitiga(int alas, int tinggi) {
		float luas = (alas * tinggi) / 2;
		return (int) luas;
	}

	public static int kelilingpersegi(int sisi) {
		float keliling = sisi * 4;
		return (int) keliling;
	}

	public static int luaspersegi(int sisi) {
		float luas = sisi ^ 2;
		return (int) luas;
	}

	public static int kelilingpersegipanjang(int panjang, int lebar) {
		float keliling = 2 * (panjang + lebar);
		return (int) keliling;
	}

	public static int luaspersegipanjang(int panjang, int lebar) {
		float luas = panjang * lebar;
		return (int) luas;
	}

	public static int kelilingtrapesium(int alasbawah, int alasatas, int sisimiring) {
		float keliling = alasbawah + alasatas + sisimiring;
		return (int) keliling;
	}

	public static int luastrapesium(int alasbawah, int alasatas, int tinggi) {
		float luas = (float) ((alasbawah + alasatas) * tinggi * 0.5);
		return (int) luas;
	}

	public static int kelilingjajargenjang(int alas, int sisimiring) {
		float keliling = (alas * 2) + (sisimiring * 2);
		return (int) keliling;
	}

	public static int luasjajargenjang(int alas, int tinggi) {
		float luas = alas * tinggi;
		return (int) luas;
	}
}
