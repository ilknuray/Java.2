package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");
        //queue kuyruk demektir dolayisiyla sira onemlidir
        //gelen sona gelen giden bastan gider.
        System.out.println(ll3);
        System.out.println(ll3.remove());//direk bastan siler cunku giden bastan gittigi icin
        System.out.println(ll3);
        System.out.println(ll3.remove("Hpolat"));

        System.out.println(ll3.element());
        System.out.println(ll3.peek());
        Queue<String>ll4=new LinkedList();
        System.out.println(ll4.peek());



        System.out.println(ll3.offer("Ahmet"));
        ll3.offer("Sefa");
//peek ve element silmeden bize getirir poll ise silerek bize getirir
        System.out.println(ll3);
        System.out.println(ll3.poll());
        System.out.println(ll3);
        //System.out.println(ll4.remove());//remove bos listede hata veriyor
        System.out.println(ll4.poll());//null
    }
}
