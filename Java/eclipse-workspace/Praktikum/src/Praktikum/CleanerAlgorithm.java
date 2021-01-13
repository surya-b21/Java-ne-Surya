public class CleanerAlgorithm {

	public static void main(String[] args) {
		int [][] besar = {
				{03,02,04,05,04,03,01},
				{04,20,15,18,21,11,02},
				{01,13,35,21,80,14,05},
				{02,90,56,41,28,44,03},
				{05,81,45,23,59,32,01},
				{03,51,29,45,38,21,05},
				{01,03,04,01,02,05,02}
		};
		int penampung=0;
		System.out.println("sebelum diubah");
		for (int i=0; i<besar.length; i++) {
			for(int j=0; j<besar[0].length; j++) {
				System.out.print(besar[i][j]+"\t");
			}System.out.println();
		}
		for (int a=0; a<besar.length-2; a++) {
			for (int b=0; b<besar[0].length-2; b++) {
				penampung=0;
				for (int c=a; c<a+3; c++) {
					for (int d=b; d<b+3; d++) {
						if (c==a+1 && d==b+1) {
							continue;
						}
						penampung += besar[c][d];
					}
				}besar[a+1][b+1]=(penampung)/8;
			}
		}
		System.out.println("setelah diubah");
		for (int i=0; i<besar.length; i++) {
			for(int j=0; j<besar[0].length; j++) {
				System.out.print(besar[i][j]+"\t");
			}System.out.println();
		}
	}
}
