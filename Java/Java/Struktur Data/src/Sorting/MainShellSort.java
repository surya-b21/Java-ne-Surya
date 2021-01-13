package Sorting;

public class MainShellSort {
    public static void main(String[] args) { 
        int A[] = {10,6,8,3,1};
        ShellDemo.tampil(A);
        ShellDemo.DescendingShellSort(A);
        ShellDemo.tampil(A);

        double B[] ={10.3,6.2,8.4,3.6,1.1};
        ShellDemo.tampil(B);
        ShellDemo.DoubleShellSort(B);
        ShellDemo.tampil(B);
        }
}