package day08IfElseIfStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        /*
        emeklilik konTrolu yapan bir uygulama yaziniz
        cinsiyet olarak k veya e degiskenini kabul etsin
        farkli bir harf veya sembol girilirse hata mesaji versin

        emeklilik icin kadinlarda yas siniri 60
        erkeklerde 65 olsun

        negatif veya
        80 DEN buyuk yas verilirse hata mesaji versin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz " +
                "\n kadin icin K erkek icin E giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        if (cinsiyet == 'E') {

            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsin");
            } else {
                System.out.println("emkli olabilirsin");
            }
        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin");
            } else {
                System.out.println("emkli olabilirsin");
            }

        } else {
            System.out.println("Lutfen gecerli bir tercih giriniz");
        }


    }
}
