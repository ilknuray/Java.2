package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) throws InterruptedException {
        /*
        kullanicidan yasini girmesini isteyin kodunuzu kullanici
        sifirdan kucuk bir sayi girerse Exception verecek sekilde
        yazin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas= scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException ();
            }else{
                System.out.println("yasiniz : " + yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.print("Yas negatif olamaz");


            Thread.sleep(5000);//bekletiyor
        }
    }
}
