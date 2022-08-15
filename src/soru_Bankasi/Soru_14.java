package soru_Bankasi;

import java.util.Scanner;

public class Soru_14 {
    public static void main(String[] args) {

        /*
        1-1 den 100 e kadar cift sayilari ekrana yazan program
        2- negatif bir deger girilene kadar kullanicidan alinan degerleri kabul eden
        ve girilen degerlerden tek sayilari toplayan prigram
        3-
         */

       /* for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
            Scanner scan=new Scanner(System.in);
            System.out.println("lutfen bir sayi giriniz");
            int sayi= scan.nextInt();
            int toplam=0;
            while (sayi<0){
                System.out.println(sayi);
                sayi++;
                toplam+=sayi;

            }
            System.out.println(toplam);*/


      /*  int i=1;
        while (i<=100){
            if(i%2==0){
                System.out.println(i);
            }
            i++;*/
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int input;
        while (true) {
            System.out.println("lutfen sayi giriniz : ");
            input = scan.nextInt();

            if (input < 0) {
                System.out.println("negatif sayi girdiniz program bitti");
                break;
            }
            if (input % 2 == 1) {
                toplam += input;
            }
            System.out.println(toplam);
        }}


        }




