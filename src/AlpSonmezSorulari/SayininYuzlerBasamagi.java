package AlpSonmezSorulari;

import java.util.Scanner;

public class SayininYuzlerBasamagi {
    /*
    Bu örneğimizde Dısarıdan Girilen Sayının Yüzler Basamağındaki Rakamı Bulacağız.

     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        int yuzlerBasamagi=0;
        int birlerBasamagi=0;
        int onlarBasamagi=0;

        birlerBasamagi=sayi%10;
        sayi/=10;
        System.out.println("sayinin birler basamagi : " + birlerBasamagi);

        onlarBasamagi=sayi%10;
        sayi/=10;
        System.out.println("sayinin onlar basamagi : " +onlarBasamagi);

        yuzlerBasamagi=sayi%10;
        sayi/=10;
        System.out.println("sayinin yuzlerBasamagi basamagi : " +yuzlerBasamagi);



    }
}