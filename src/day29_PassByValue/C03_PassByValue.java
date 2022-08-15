package day29_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        bir list olusturalim iki ayri methodtan birine sadece elemanlari degistirelim
        digerinde yeni bir list atayip ayni sayida yeni eleman ekleyelim
        ve her iki method call dan sonra kendi listemizi main method icerisinde kontrol edelim
         */

        List<String>list=new ArrayList<>();

        list.add("ali");
        list.add("veli");
        list.add("can");
        System.out.println("ilk basta list : " + list);

        elemanlariDegistir(list);
        System.out.println("eleman degistir sonrasi : "+ list);

        listDegistir(list);
        System.out.println("list degistir sonrasi list : " +list);
    }

    public static void listDegistir(List<String> list) {
        list=new ArrayList<>();
        list.add("meva");
        list.add("melih");
        list.add("senih");
        System.out.println("list degistir metodunda : " +list);

    }

    public static void elemanlariDegistir(List<String> list) {


        list.set(0,"oguz");
        list.set(1,"ilknur");
        list.set(2,"fatih");
        System.out.println("eleman degistir metodunda : " +list);
    }
}
