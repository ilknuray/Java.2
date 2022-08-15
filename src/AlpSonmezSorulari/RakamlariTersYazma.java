package AlpSonmezSorulari;

import java.util.Scanner;

public class RakamlariTersYazma {
    /*
    Bu örneğimizde Dısarıdan Girilen Sayının Rakamlarını Ters Çevireceğiz.

     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= sc.nextInt();
        System.out.println("Girilen sayini tersi : ");

        while (sayi>0){
            System.out.print(sayi % 10);
            sayi/=10;


        }

    }
}