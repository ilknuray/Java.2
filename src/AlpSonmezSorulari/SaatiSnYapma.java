package AlpSonmezSorulari;

import java.util.Scanner;

public class SaatiSnYapma {
    /*
    Java örneklerimizde yeni bir örnek ekleyelim. Bu örnekte dışardan girilenm saniye değerini
    , saat,dakika ve saniyeye çevireceğiz.

     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen saniye degeri giriniz");
        double saniye= sc.nextDouble();

        double dakika=saniye/60;
        double saat=saniye/(60*60);
        System.out.println("Girilen "+saniye+"saniye"+dakika+"dakika"+saat+"saate esittir");


    }
}
