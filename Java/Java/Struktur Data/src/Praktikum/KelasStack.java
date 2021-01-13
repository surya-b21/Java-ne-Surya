package Praktikum;


public class KelasStack {
    //pesan memori untuk array
    int ar [] = new int[10];
    int top = -1;
    public static void main (String[]args) {
    
    }
    public void push(int angka){
        if(!isFull()){
            top++; //top di naikan
            ar[top] = angka; //angka diisikan
            System.out.println("Angka"+angka+"berhasil di push");
        } else {
            System.out.println("Stack penuh");
        }
    }
    
    private boolean isFull() {
        return false;
    }

    public void pop() {
        if (!isEmpty()) {
        } //top di turunkan
    }

    private boolean isEmpty() {
        return false;
    }
}