package day46_maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_MapMethodIle {
    public static void main(String[] args) {
        Map<Integer,String>ogrenciMap=ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);

        //value lari sira numarali olarak yazdirin
       ReusableMethods.tumValueSiraliYazdir(ogrenciMap);

       //isim ve soyisimlerin birlikte ilacagi bir liste olusurun

        List<String> sinifIismSoyisimList=ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi : "+ sinifIismSoyisimList);
        //kac farkloi  rans varsa brans ismi:branstaki ogrenci sayisi seklinde yazdirin

    }







}
