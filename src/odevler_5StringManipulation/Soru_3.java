package odevler_5StringManipulation;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {

        /*kullanicidan e mail adresini girmesini isteyin mail @gmail.com
        icermiyorsa "lutfen mail adresinizi giriniz"
        @gmail.com ile bitiyorsa "e mail adresiniz kaydedildi"
        @gmal.com ile bitmiyorsa "lutfen adresinizi kontrol edin"yazdirin
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen mail adresinizi giriniz");
        String mail = sc.nextLine();

        if (!mail.contains("@gmail.com")) {
            System.out.println("lutfen mail adresinizi giriniz");
        } else if (mail.lastIndexOf("@gmail.com") == (mail.length() - 10)) {
            System.out.println("e mail adresiniz kaydedildi");
        } else {
            System.out.println("lutfen adresinizi kontrol edin");


        }
    }


}


