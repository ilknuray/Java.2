package soru_Bankasi;

import java.util.Scanner;

public class Soru_7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ders notlarinizi giriniz");
        int turkce=scan.nextInt();
        int fenBilgisi= scan.nextInt();
        int matematik= scan.nextInt();
        int sosyal= scan.nextInt();

        int ort=((turkce+fenBilgisi+matematik+sosyal)/4);
        if (ort < 50) {
            System.out.println("sinif tekrarai");
        }else{
            System.out.println("tebrikler sinifi gectiniz");
        }
        System.out.println("ortalamaniz : " +ort);
    }
}
