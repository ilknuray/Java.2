package odevler_2IfStatement;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
        //kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birinin ilk harfini giriniz");

         int sayi = 12;
        if (sayi > 0) {
            System.out.println("sayi pozitif");

        }
        if (sayi % 2 == 0) {
            System.out.println("sayi cift");
        }
        if (sayi % 5 == 0) {
            System.out.println("sayi 5'in tam kati");


        }
    }
}
