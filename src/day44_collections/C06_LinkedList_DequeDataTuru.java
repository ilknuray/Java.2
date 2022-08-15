package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C06_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String>ll4=new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Ilknur");
        ll4.add("ismail");
        ll4.add("Ilknur");
        ll4.removeLastOccurrence("Ilknur");
        System.out.println(ll4);
        System.out.println(ll4.pop());

    }
}
