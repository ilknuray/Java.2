package soru_Bankasi;

import java.util.Scanner;

public class Soru_15 {
    public static void main(String[] args) {
       // girilen sayiya kadar olan 2nin kuvvetleri

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi girinz");
        int sayi= scan.nextInt();
        int sayac=1;

        while (sayac<sayi){
            System.out.println(sayac);
            sayac=sayac*2;
        }
    }
}
