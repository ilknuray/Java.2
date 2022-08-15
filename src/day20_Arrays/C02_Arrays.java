package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar[]=new int[3];
        System.out.println(sayilar);//[I@e9e54c2
        //non primitive data turundeki datalari herzaman direk yazdiramayabiliriz
        //array i direk yazdirmak istersek arrays classindan yardim isteriz

        System.out.println(Arrays.toString(sayilar));//[0,0,0]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(Arrays.toString(sayilar));
        String sinifList[]={"ali","ayse","ahmet"};
        System.out.println(Arrays.toString(sinifList));

        sinifList[1]="hasan";
        System.out.println(Arrays.toString(sinifList));


    }
}
