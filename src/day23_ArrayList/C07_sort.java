package day23_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        Collections.sort(urunler);

        System.out.println(urunler);
        /*
        list ile gelen sort methodunda siralama ozelligine girmekgerekiyor bunu yerine
        collections classindan sort methodunu kullaniyoruz bu method listemizi natural
        order a gore siralar
         */








    }
}
