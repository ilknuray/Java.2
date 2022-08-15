package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Set {
    public static void main(String[] args) {
        /*
        elimizde urunlerin bulundugu bir liste var urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip eski urunu varolan eski urunler listesine ekleyelim
         */
        List<String> urunler = new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        List<String>eskiUrunler = new ArrayList<>();
        //listedeki ikramn yerine biskrem ekleyelim
         String yeniUrun="biskrem";
         String silinecekUrun="ikram";

         int temp=urunler.indexOf(silinecekUrun);
         String silinenUrun=urunler.set(temp,yeniUrun);

         eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : " + urunler);
        System.out.println("eski urunler listesi : " + eskiUrunler);



    }

}
