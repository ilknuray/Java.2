package day08IfElseIfStatements;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {

        /*kullanicidan iki sayi isteyin,sayilarin ikiside pozitif ise sayilarin toplamini yazdirin
        sayilarin ikiside negatif ise sayilarin carpimini yazdirin.sayilarin ikisi farkli isaretlere sahipse
        farkli isaretlerde islem yapamazsin yazdirin sayilardan sifira esit olan varsa sifir
         carpmaya gore yutan elemandir
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi sayi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2= scan.nextInt();

        if (sayi1>0&&sayi2>0){
            System.out.println(sayi1+sayi2);
        }
        else if(sayi1<0&&sayi2<0){
            System.out.println(sayi1*sayi2);
        }
        else if (sayi1>0&&sayi2<0){
            System.out.println("islem yapamazsin");
        }
        else if(sayi1<0&&sayi2>0){
            System.out.println("Islem yapamazsin");
        }
        else if(sayi1==0&&sayi2>0){
            System.out.println("Sifir carpmaya gore yutan elemandir");
        }
    }
}
