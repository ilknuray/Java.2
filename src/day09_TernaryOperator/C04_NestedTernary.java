package day09_TernaryOperator;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        /*kullanicidan bir tamsayi alin ve sayi 10 dan kucukse "rakam",
        100 den kucukse iki basamakli sayi,
        degilse uc basamakli veya daha  uyuk sayi yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        String sonuc=sayi<10 ? ("rakam") : ((sayi<100) ? " iki basamakli sayi" : "uc basamakli veya daha buyuk sayi");
        System.out.println(sonuc);
    }
}
