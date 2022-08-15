package day08IfElseIfStatements;

import java.util.Scanner;

public class C06_Soru6 {
    public static void main(String[] args) {
        /*nested if ifadesi kullanarak soruyu cozen kodu yaziniz
        kullanicidan bir sifre girmesini isteyin
        eger ilk harf buyuk harf ise "A"olup olmadidigini kontrol edin
        ilk harf  A ise gecerli siffre degilse gecersiz sifre yazdirin

        eger ilk harf kucuk harf ise "z"olup olmadigini kontrol edin
        ilk harf z ise gecerli sifre degilse gecersiz sifre yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifre giriniz");
        String sifre = scan.nextLine();
        char ilkHarf = sifre.charAt(0);

        if (ilkHarf >='A' && ilkHarf <='Z') {
            if (ilkHarf == 'A') {
                System.out.println("gecerli sifre");
            } else {
                System.out.println("gecersiz sifre");
            }
        } else if (ilkHarf >='a' && ilkHarf <='z') {
            if (ilkHarf == 'z') {
                System.out.println("gecerli sifre");
            } else {
                System.out.println("gecersiz sifre");
            }

        } else {
            System.out.println("lutfen ilk karakter icin sadece harf kullanin");

        }
    }
}
