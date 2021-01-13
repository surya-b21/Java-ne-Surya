package Sorting;

public class MainClass {
    public static void main (String[]args) {
        //Data Integer
        Integer arr3[] = {1,5,6,2,8,9};
        Insertion.AscendingInsertionSort(arr3);
        Insertion.tampil(arr3);
        //data Double
        Double arr4[] = {1.3,5.2,6.6,2.7,8.8,9.1};
        Insertion.DoubleInsertionSort(arr4);
        Insertion.tampil(arr4);
    }
}