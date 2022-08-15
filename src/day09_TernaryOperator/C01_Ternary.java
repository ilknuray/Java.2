package day09_TernaryOperator;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {
        // kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("lutfen ikinci sayiyi giriniz");
        double sayi2= scan.nextDouble();


        System.out.println(sayi1>sayi2 ?sayi2 : sayi1 );
    }
}
