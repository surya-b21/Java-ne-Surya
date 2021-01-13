package Sorting;

public class Insertion {
    public static void AscendingInsertionSort(Integer[] A) {
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] > key)) {
                A[j + 1] = A[j];
                j--;
            }
            A [j + 1] = key;
        }
    }
    public static void DescendingInsertionSort(Integer[] A) {
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] < key)) {
            A [j + 1] = A[j];
            j--;
            }
            A [j + 1] = key;
        }
    }
    public static void DoubleInsertionSort(Double[] A){
        for (int i = 1; i < A.length; i++) {
            double key = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] > key)) {
            A [j + 1] = A[j];
            j--;
            }
            A [j + 1] = key;
        }
    }
    public static<T> void tampil(T data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}