package Sorting;

public class ShellSort {
    public static void shellSort(Integer[] A) {
        Integer n = new Integer(A.length);

        int jarak, i, j;
        boolean Sudah = true;
        int temp ;

        jarak = n;

        while (jarak >= 1) {
            jarak = jarak / 2;
            Sudah = true;
            while (Sudah) {
                Sudah = false;
                for (j = 0; j < n - jarak; j++) {
                    i = j + jarak;
                    if (A[j]> A[i]) {
                        temp = A[j];
                        A[j] = A[i];
                        A[i] = temp;
                        Sudah = true;
                    }
                }
            }
        }
    }
    public static void shellSort(Double[] A){
        Double n = new Double(A.length);

        double jarak;
		int i, j;
        boolean Sudah = true;
        double temp ;

        jarak = n;

        while (jarak >= 1) {
            jarak = jarak / 2;
            Sudah = true;
            while (Sudah) {
                Sudah = false;
                for (j = 0; j < n - jarak; j++) {
                    i = (int) (j + jarak);
                    if (A[j]> A[i]) {
                        temp = A[j];
                        A[j] = A[i];
                        A[i] = temp;
                        Sudah = true;
                    }
                }
            }
        }
    }
    public static<T> void tampil(T data[]){ 
        for(int i=0;i<data.length;i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}