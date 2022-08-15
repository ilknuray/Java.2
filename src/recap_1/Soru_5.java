package recap_1;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {
        /*kullanicidan a b ve c sayilarini okuyarak asadidaki islemi yapan kodu yaziniz
        a nin karesinden b nin karesini cikarip c nin uc katina bolunuz
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir a sayisi giriniz");
        int a= scan.nextInt();
        System.out.println("lutfen b sayisi giriniz");
        int b= scan.nextInt();
        System.out.println("lutfen bir c sayisi giriniz");
        int c= scan.nextInt();


        System.out.println((a*a)-(b*b)/(3*c));

    }
}
