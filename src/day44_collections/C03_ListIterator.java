package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {
    public static void main(String[] args) {
        /*
        (iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator kullanarak 5 artirin.
 Orn :  list : [2,13,56,23,45,14,40]
 artirilmasi istenen eleman sayisi : 3 output: [7,18,61,23,45,14,40]
         */
        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        System.out.println(liste);
        ListIterator lis1 = liste.listIterator();
        int n = 3;
        for (int i = 0; i < n; i++) {
            liste.set(i, liste.get(i) + 5);
            lis1.next();

        }
    }
}