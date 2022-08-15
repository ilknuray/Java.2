package day05_matematikselIslemler;

import java.util.Scanner;

public class RakamlarToplami {
    public static void main(String[] args) {
        //kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort basamakli pozitif bir tamsayi bir sayi giriniz");

        int sayi = scan.nextInt();//2456

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int ilkGirilensayi =sayi;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        System.out.println(ilkGirilensayi +" " + "sayisinin rakamlar toplami : " + rakamlarToplami);


    }
}
