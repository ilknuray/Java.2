package odevler_4SwitchStatement;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
         int sayi= scan.nextInt();


        switch (sayi) {

            case 1 :
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case 2 :
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 3 :
                System.out.println("dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("sayiyi degistirin");

        }
    }
}
