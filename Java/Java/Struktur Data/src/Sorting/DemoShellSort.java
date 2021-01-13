package Sorting;

public class DemoShellSort {
    public static void main(String[] args){ 
        Integer arr3[] = {1,5,6,2,8,9};
        ShellSort.shellSort(arr3);
        ShellSort.tampil(arr3);
        //data Double
        Double arr4[] = {1.3,5.2,6.6,2.7,8.8,9.1};
        ShellSort.shellSort(arr4);
        ShellSort.tampil(arr4);
    }
}