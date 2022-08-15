package soru_Bankasi;

import java.util.Scanner;

public class Soru_8 {
    public static void main(String[] args) {
        /*
        km fiyati 0.10
        12 Yasindan kucukse toplam fiyata %50 indirim
        12 24 Yas arasi%10indirim
        65 yasindan buyukse %30indirim
        gidis donus alirsa %20 INDIRIM
        bu kosullara gore bilet fiyati hesaplayan program
         */
        Scanner scan=new Scanner(System.in);
        int km,yas,yolculukTipi;
        System.out.println("mesafeyi giriniz");
        km= scan.nextInt();
        System.out.println("yasinizi giriniz");
        yas= scan.nextInt();


        int biletFiyati1=km*(5/100);
        int biletFiyati2=km *(1/ 100);
        int  biletFiyati3=km*(3/100);

        if (yas<12){
            System.out.println("bilet fiyati : " +biletFiyati1);

        }else if(yas>=12&&yas<=24){
            System.out.println("bilet fiyati : " +biletFiyati2);
        }else if(yas>65){
            System.out.println("bilet fiyati : " +biletFiyati3);
        }else{
            System.out.println("lutfen gecerli bir giris yapiniz");
        }
    }
}
