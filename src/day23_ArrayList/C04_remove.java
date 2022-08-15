package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        /*
        remove methodu iki sekilde kullanilir
        1 objeyi yazip silmesini istersek true yada false dondurur
        2 index yazarsak o indexi siler ve bize silinen elemani dondurur

         */
        System.out.println(urunler);
        System.out.println(urunler.remove("ikram"));//true
        System.out.println(urunler);

        System.out.println(urunler.remove("hobby"));//false
        System.out.println(urunler);

        System.out.println(urunler.remove(1));//cekirdegi dondurur
        System.out.println(urunler);//cekirdegi siler
        //System.out.println(urunler.remove(4));//run time error verir
    }
}
