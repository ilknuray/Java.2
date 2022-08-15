package odevler_4SwitchStatement;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen haftanin kacinci gunu oldugunu soyleyiniz");
        int gunNo= scan.nextInt();
        switch (gunNo) {

            case 1 :
                System.out.println("pazartesi");
                break;
            case 2 :
                System.out.println("sali");
                break;
            case 3 :
                System.out.println("carssamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case  6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("pazar");
                break;
            default:
                System.out.println("lutfen gecerli bir numara soyleyiniz");

        }
    }
}