package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedList {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();

        List<String> ll2=new LinkedList();

        Queue<String>ll3=new LinkedList();

        Deque<String>ll4=new LinkedList();

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");

        System.out.println(ll2);
        System.out.println(ll2.remove(3));
        System.out.println(ll2.remove("Kemal"));//false
        //eger listemiz int elementlerden olusuyorsa direk sayi
        // yazarsak index olarak kabul eder.ama bir variable a atama yapar
        //ama remove da o variable in ismini yazarsak obje olarak kabul eder
        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println(ll1);
        ll2.retainAll(ll1);//ll2 deki tum elementleri ll1 ile
        // karsilastirir ll1de olmayanlari siler
        System.out.println(ll2);
        System.out.println(ll2.hashCode());//referans numarasi yazar.
    }
}
