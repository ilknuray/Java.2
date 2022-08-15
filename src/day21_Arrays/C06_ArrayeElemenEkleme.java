package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemenEkleme {
    public static void main(String[] args) {
        String [] takimListesi={"melih","senih"};
        String eklenecekIsim="meva";

       takimListesi= C05_ArrayeElementEkleme.isimEkle(takimListesi,eklenecekIsim);
        System.out.println(Arrays.toString(takimListesi));

    }
}
