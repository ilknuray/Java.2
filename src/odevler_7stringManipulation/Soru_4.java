package odevler_7stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {

        //kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=sc.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= sc.nextLine();

        System.out.println(isim.length()>soyisim.length()?  isim : soyisim);
    }
}
