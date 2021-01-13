package Praktikum;

import java.util.*;

public class Array {
    public static void main (final String [] args) {
       Scanner sc = new Scanner(System.in);
       String [][] rukuniman = {{"Allah","Beriman dengan wujud Allah\nBeriman dengan rububiyah Allah. Beriman dengan uluhiyah\nAllah. Beriman dengan nama-nama dan sifat-sifat Allah"},
                                {"Malaikat","Beriman dengan keberadaan para malaikat Allah. Mengimani\nsecara rinci nama-nama malaikat yang kita ketahui, dan\nmengimani secara global yang tidak kita ketahui. Mengimani\nsecara rinci sifat-sifat mereka yang kita ketahui, dan\nmengimani secara global yang tidak kita ketahui. Mengimani\nsecara rinci. tugas-tugas mereka yang kita ketahui, dan\nmengimani secara global yang tidak kita ketahui."},
                                {"Kitabullah","Mengimanai bahwa seluruh kitab berasal dari Allah. Mengimani\nsecara rinci nama-nama kitab Allah yang kita ketahui dan\nmengimani secara global yang tidak kita ketahui. Membenarkan\nberita-berita yang terdapat dalam kitab-kitab tersebut.\nBeramal dengan hukum-hukum yang ada di dalamnya selama belum\ndihapus"},
                                {"Rasul","Mengimani bahwa seluruh risalah para rasul berasal dari Allah.\nMengimani secra rinci nama para nabi dan rasul Allah yang kita\nketahui dan mengimani secara global yang tidak kita ketahui.\nMembenarkan berita yang shahih yang datang dari mereka.\nBeramal dengan syariat Rasul yang diutus kepada kita (yaitu\nMuhammad shalallhu ‘alaihi wa sallam)."},
                                {"Kiamat","Beriman dengan hari kebangkitan. Beriman dengan hari\nperhitungan dan pembalasan (al hisaab wal jazaa’). Beriman\ndengan surga dan neraka. Beriman dengan segala sesuatu yang\nterjadi setelah kematian."},
                                {"Takdir","Beriman bahwasanya Allah mengetahui segala sesuatu yang\nterjadi. Beriman bahwasanya Allah telah menetapkan segala\nsesuatu di Lauh mahfudz. Beriman bahwa segala sesuatu terjadi\ndengan kehendak Allah. Beriman bahwa segala sesuatu yang\nterjadi merup"}};
        String pilih;
        System.out.print("Sebutkan rukun iman yang anda ketahui : ");
        pilih = sc.nextLine();
        System.out.println("Penjelasan :");
        if (pilih.equals(rukuniman[0][0])) {
            System.out.println(rukuniman[0][1]);
        } else if (pilih.equals(rukuniman[1][0])) {
            System.out.println(rukuniman[1][1]);
        } else if (pilih.equals(rukuniman[2][0])) {
            System.out.println(rukuniman[2][1]);
        } else if (pilih.equals(rukuniman[3][0])) {
            System.out.println(rukuniman[3][1]);
        } else if (pilih.equals(rukuniman[4][0])) {
            System.out.println(rukuniman[4][1]);
        } else if (pilih.equals(rukuniman[5][0])) {
            System.out.println(rukuniman[5][1]);
        }
        sc.close();
    }
}