package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C08_List {
    public static void main(String[] args) {
        //list primitive data turlerini kabul etmez bunu icin wrapper class kullanilir

       List <Integer>sayilar=new ArrayList<>();
       sayilar.add(5);
       sayilar.add(3);
       sayilar.add(7);
        System.out.println(sayilar);

        //sadece add() kullanirsak java sona ekler

        sayilar.add(2,10);
        System.out.println(sayilar);
        //add (indexelemen)istedigimiz indexe istedigimiz elementi yerlestirir
        //silmez update etmez yenisini ekler


    }
}
