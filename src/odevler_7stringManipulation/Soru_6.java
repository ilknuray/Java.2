package odevler_7stringManipulation;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
        //kullanicidan ismini soyismini ve kkarti bilgisini isteyin
        //ve asagidaki gibi yazdirin

        //isim-soyisim : M***** B********
        //kartNo :**** **** **** 1234

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= sc.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim= sc.nextLine();
        System.out.println("Lutfen kart numaranizi giriniz");
        String kartNo= sc.nextLine();

       String isimIlkHarf=isim.substring(0,1).toUpperCase();
       String isimGeriyeKalanlar=isim.replaceAll("\\w","*");

       String soyIsimIlkHarf=soyIsim.substring(0,1).toUpperCase();
       String soyIsimGeriyeKalanlar=soyIsim.replaceAll("\\w","*");

       String kkSonDort=kartNo.substring(14,18);
       String kkIlkKisim="**** **** **** ";

        System.out.println(isimIlkHarf + isimGeriyeKalanlar +" " +soyIsimIlkHarf +soyIsimGeriyeKalanlar
        +" " + kkSonDort +kkIlkKisim);


    }
}
