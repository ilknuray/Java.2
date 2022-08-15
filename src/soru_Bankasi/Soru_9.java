package soru_Bankasi;

import java.util.Scanner;

public class Soru_9 {
    public static void main(String[] args) {
        /*
        hava sicakligini al
        sicaklik 30 veya ddaha yuksekse yuzmz etkinligi oner
        5 ve 30 arasinda ise sinema oner
        4 ve daha asgi ise kayak oner
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen hava sicakligini giriniz");
        int sicaklik= scan.nextInt();



         if(sicaklik>=30){
             System.out.println("yuzmeye gidiniz");
         }else if(5<sicaklik||sicaklik<30){
             System.out.println("sinemaya gidiniz");
        }else {
             System.out.println("kayak yapiniz");
         }




    }
}
