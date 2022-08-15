package AlpSonmezSorulari;

import java.util.Scanner;

public class KacBasamakli {
    //Bu örneğimizde Dışarıdan Girilen Sayının Kaç Basamaklı Oolduğunu Bulacağız.
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int birler=0;
        int count=0;

        for (int i = 0; i <=sayi ; i++) {
            birler=sayi%10;
            sayi/=10;
            count++;



        }
        System.out.println("Girilen sayi"+count+"basamaklidir");


    }
}