package soru_Bankasi;

import java.util.Scanner;

public class Soru_11 {
    public static void main(String[] args) {
        //a b ve c sayilarini kucukten buyuge dogru siralayiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen uc tyane sayi giriniz");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("a>b>c");
            } else {
                System.out.println("a>c>b");
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("b>a>c");
            } else {
                System.out.println("b>c>a");
            }

        } else {
            if (c > a && c > b) {
                System.out.println("c>a>b");

            } else {
                System.out.println("c>b>a");

            }
        }
    }
}