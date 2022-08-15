package day09_TernaryOperator;

import java.util.Scanner;

public class C03_PozitifNegatif {
    public static void main(String[] args) {

        //kullanicidan bir sayi isteyin
        //sayi pozitifse sayiyi yazdirin
        //sayi negatifse bir sayi daha isteyin ve ikisinin carpimini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi > 0) {
            System.out.println("sayi pozitif");

        } else {
            System.out.println("lutfen bir sayi dah giriniz");
            int sayi2 = scan.nextInt();
            System.out.println(sayi * sayi2);
        }
    }
}