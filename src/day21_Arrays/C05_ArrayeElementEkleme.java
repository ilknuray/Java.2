package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        //verilen bir arraye yeni bir element ekleyen method olusturun

        String [] sinifListesi={"melih","senih","meva"};
        String eklenecekIsim="fatih";
        sinifListesi=isimEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));


    }

    public static String[] isimEkle(String[] sinifListesi, String eklenecekIsim) {
        String[] yeniliste=new String[sinifListesi.length+1];
        //eski listeden bir eleman fazla uzunlukta bir array olusturdum

        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniliste[i]=sinifListesi[i];
        }
        //oncelikle eski listeyi yenie tasidim
        yeniliste[yeniliste.length-1]=eklenecekIsim;
        //son index e eklenecek yeni ismi ekledim

        return yeniliste;
    }

}
