package practice_6;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
        //girilen bir sayiya kadar olan sayilardan sadece tek olanlarini ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int count=0;

        while (sayi > 0) {

            if (sayi % 2 != 0) {
                System.out.println(sayi);
                count++;
            }
            sayi--;//sonsuz donguye girmeyip girdigim sayidan sonrakilrede baksin diye yazarim

        }
        System.out.println(count);
    }
}