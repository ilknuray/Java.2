package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOff {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        System.out.println(urunler.indexOf("ikram"));//1

        //indexoff methodu bize bilgi donduren bir methodtur listemizi degistirmez

        System.out.println(urunler.lastIndexOf("ikram"));

        //indexoff methodu urunu aramaya 0. index ten last i dex off ise sondan baslar aa
        //ancak ikiside bulunan urunun indexsini verir
        //index sondan sayilmaz

        urunler.add("ikram");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("ikram"));
        System.out.println(urunler.lastIndexOf("ikram"));
        System.out.println(urunler.indexOf("hobby"));
        System.out.println(urunler.lastIndexOf("hobby"));
    }
}
