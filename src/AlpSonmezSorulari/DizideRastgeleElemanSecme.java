package AlpSonmezSorulari;

import java.util.Random;

public class DizideRastgeleElemanSecme {
    //Java dizideki elemanlardan rastgele birini seçme
    public static void main(String[] args) {


        int[] sayilar = {1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9};
        Random rastgele = new Random();
        int hangiEleman = rastgele.nextInt(sayilar.length);
        System.out.println("Rastgele secilen sayi : " +sayilar[hangiEleman]);


    }
}