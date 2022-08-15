package day30_immutableDate;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        //string mi string builder mi daha hizlidir bunu icin bir string olusturup sonun na
        // bin tane nokta koyalim once ve sonrasin da zamani alip aradaki farki bulalim
        //aynisini string builder icin de yapalim
        LocalTime baslangic=LocalTime.now();
        String str="Ah java";
        for (int i = 0; i <10000 ; i++) {
            str+=".";

        }
        LocalTime bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        int Stringzaman=bitis.getNano()-baslangic.getNano();
        System.out.println(Stringzaman);

        baslangic=LocalTime.now();
        StringBuilder sb=new StringBuilder("Ah java");
        for (int i = 0; i <10000 ; i++) {
            sb.append(".");

        }
        bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("builder : " + (bitis.getNano()-baslangic.getNano()));


    }
}
