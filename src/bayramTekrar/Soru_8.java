package bayramTekrar;

import java.util.Scanner;

public class Soru_8 {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bes basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        System.out.println(rakamlarToplami);




    }
}
