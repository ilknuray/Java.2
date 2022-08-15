package odevler_4SwitchStatement;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir ay numarasi giriniz");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 1 :
                System.out.println("ocak");
                break;
            case 2 :
                System.out.println("subat");
                break;
            case 3 :
                System.out.println("mart");
                break;
            case 4 :
                System.out.println("nisan");
                break;
            case 5 :
                System.out.println("mayis");
                break;
            case 6 :
                System.out.println("haziran");
                break;
            case 7 :
                System.out.println("temmuz");
                break;
            case 8 :
                System.out.println("agustos");
                break;
            default:
                System.out.println("lutfen gecerli bir ay numarasi giriniz");
        }
    }
}
