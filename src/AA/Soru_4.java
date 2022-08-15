package AA;

import java.util.Scanner;

public class Soru_4 {
     /*
        Bir işyerinde çalışan işçiler için, işçi adını, çalıştığı saat ve saat ücretini giriniz.
        İsim olarak “SON” girilmesi veri girişinin sonunu göstersin. Her işçinin ismini ve aldığı maaşı
         hesaplayınız. Bütün işçilerin maaş hesaplaması bittikten sonra, işçilere verilen toplam parayı ekrana
         yazdırınız.

         */
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("isminizi giriniz");
         String isim;
         System.out.println("maasinizi giriniz");
         int maas;
         int top=0;
         String kisiler="Son";
         boolean sonMu=false;
         while (!sonMu){
             isim=scan.nextLine();
             maas=scan.nextInt();
             top++;

             if (kisiler.equals(isim)){
                 System.out.println("islem bitti ");
             }
             System.out.println("iscilrin toplam maasi : " +top);
         }






        }


         }



