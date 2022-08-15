package bayramTekrar;

import java.util.Scanner;

public class Soru_22 {
    public static void main(String[] args) {
        /*
         * Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk
         * olanlarini konsola yazdiriniz int num1 int num2 int num3
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("uc adet sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();
        int enBuyuk = sayi1;
        int enKucuk = sayi2;

        if (sayi2 > enBuyuk) {
            enBuyuk = sayi2;
        }
        if (sayi3 > enBuyuk) {
            enBuyuk = sayi3;
        }
        if (sayi1 < enKucuk) {
            enKucuk = sayi1;
        }
        if (sayi3 < enKucuk) {
            enKucuk = sayi3;
        }
        System.out.println("girilen sayilardan en buyuk : " +enBuyuk +" \ngirilen sayilardan en kucuk : " +enKucuk);
    }}