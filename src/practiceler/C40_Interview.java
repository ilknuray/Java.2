package practiceler;

import java.util.Scanner;

public class C40_Interview {
    public static void main(String[] args) {
        //kullanicidan alinan bir Stringin ilk ve son harfini yine kullanicidan alinan
        // sayi kadar return eden method yaziniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir String ifade giriniz");
        String str= scan.nextLine();
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        ilkVeSonHarfYazdir(str,sayi);


    }

    public static void ilkVeSonHarfYazdir(String str, int sayi) {


        String ilkHarfSonHarf=str.substring(0,1)+str.substring(str.length()-1);
        String sonuc="";

        for (int i = 1; i <=sayi ; i++) {
            sonuc+=ilkHarfSonHarf;

        }
        System.out.println(sonuc);
    }
}
