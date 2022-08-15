package practiceler;

import java.util.Scanner;

public class C39_Arrays {
    public static void main(String[] args) {
        //strung olan pini kontrol eden bir kod yaziniz

        String sifre = "ilknur1234";
        int girisHakki = 3;

        Scanner scan = new Scanner(System.in);
        System.out.println("*******HOSGELDINIZ******");

        while (true) {
            System.out.println("pin kodunuzu giriniz");
            String girilenPin = scan.nextLine();

            if (sifre.equals(girilenPin)) {
                System.out.println("basarili giris yaptiniz");
                break;
            } else {
                System.out.println("yanlis giris yaptiniz");
                girisHakki--;
                System.out.println("kalan giris hakkiniz : " + girisHakki);

            }

            if (girisHakki == 0) {
                System.out.println("giris hakkiniz kalmadi");
                break;



            }
        }
    }
}