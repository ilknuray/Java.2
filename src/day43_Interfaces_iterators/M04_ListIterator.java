package day43_Interfaces_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {
    public static void main(String[] args) {
        /*
        list iterator iterator interface inin child interface i dir
        ama daha cok methoda sahiptir
         */

        List<Integer>liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);
        Object temp;
        ListIterator lit1= liste.listIterator();

        while (lit1.hasNext()){
            temp=lit1.next();
            lit1.set(temp);

        }

    }
}
