package odevler_2IfStatement;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {

        //kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yadirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Cift sayi");
        }
        if (sayi % 2 != 0) {
            System.out.println("Tek sayi");
        }
    }

}

