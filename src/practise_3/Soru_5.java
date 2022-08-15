package practise_3;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= sc.nextLine();
        System.out.println("Lutfen soyisminizi giriiniz");
        String soyIsim= sc.nextLine();

      if (isim.length()>soyIsim.length()) {

          System.out.println("isim = " + isim);
      }else {
          System.out.println("soyIsim = " + soyIsim);
      }

    }
}
