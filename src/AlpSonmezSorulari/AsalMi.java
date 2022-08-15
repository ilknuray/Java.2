package AlpSonmezSorulari;

import java.util.Scanner;

public class AsalMi {
    /*
    Bu örneğimizde Dışarıdan Girilen Sayının Asal Olup Olmadığını Bulacağız.
'
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int sayac=0;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0) {
                sayac++;
            }
            }if(sayac==0){
                System.out.println(sayi+" sayisi asal sayidir");
            }else{
                System.out.println("asal sayi degildir");
            }


        }



    }
