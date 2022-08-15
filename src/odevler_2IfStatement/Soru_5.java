package odevler_2IfStatement;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {
        //kullanicidan dikdotgenin kenar uzunluklarini isteyin ve kare olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz  ");
        int kenar1=scan.nextInt();
        int kenar2= scan.nextInt();

        if (kenar1==kenar2){
            System.out.println("sekliniz karedir");
    }
        if (kenar1!=kenar2){
            System.out.println("sekliniz dikdortgendir");

}}}
