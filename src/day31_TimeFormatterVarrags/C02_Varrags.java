package day31_TimeFormatterVarrags;

public class C02_Varrags {
    public static void main(String[] args) {
        //verilen iki int i toplayip sonucu yazdiran bir method olusturun

        int sati1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        ToplaYazdir(sati1,sayi2,sayi3);
    }

    public static void ToplaYazdir(int sati1, int sayi2, int sayi3) {
        System.out.println("uc sayinin toplami : " +(sati1+sayi2+sayi3));
    }

    public static void ToplaYazdir(int sati1, int sayi2) {
        System.out.println("verilen iki sayini top : "+ (sati1+sayi2));
    }
}
