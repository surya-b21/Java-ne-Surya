public class BelajarArray {
    public static void main(String[] args) {
        int [] belajararray = new int [5];
        //mengisi elemen array
        belajararray[0] = 10;
        belajararray[1] = 20;
        belajararray[2] = 30;
        belajararray[3] = 40;
        belajararray[4] = 50;
        //menampilkan elemen array
        for (int i = 0; i<5; i++) {
            System.out.println("Elemen array ke-"+i+" adalah :"+belajararray[i]);
        }
    }
}