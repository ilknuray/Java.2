package odevler_3IfElseStatement;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {
        //kullanicidan diktortgenin kenar uzunluklarini isteyin ve diktortgenin kare olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen diktortgenin kenar uzunluklarini giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();

        if (kenar1!=kenar2) {
            System.out.println("girilen sekil diktortgendir");
        }else {
            System.out.println("Girilen sekil karedir");
        }



    }
}
