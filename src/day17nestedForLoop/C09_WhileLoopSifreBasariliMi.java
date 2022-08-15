package day17nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopSifreBasariliMi {
    public static void main(String[] args) {
        /*
        kullanicidan bir sifre girmesini isteyin
        asagidaki sartlari sagliyorsa sifre baarili yazdirin
        saglamiyorsa islem basarisiz yazdirin

        -ilk harf buyuk olmali
        -son harf kucuk olmali
        -sifre bosluk icermmeli
        -sifre uzunlugu en az 8 karakter olmali

         */
        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;


        while (!sifreBasariliMi) {
            System.out.println("lutfen sifrenizi giriniz");
            sifre = scan.nextLine();

            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("Ilk harf buyuk harf olmali");
            }
            // son harf kontrolu
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("Son harf kucuk harf olmali");
            }
            // bosluk kontrolu
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
            } else {
                kontrol++;
            }
            // sifre uzunluk kontrolu
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre en az 8 karakter olmali");
            }
            if (kontrol == 4) { // tum kontrolllerden gecmis demektir
                System.out.println("Sifre basari ile tanimlandi");
                sifreBasariliMi = true;
            } else { // sifre basarisiz
                // tekrar basa donecek
                // kontrol variable sifirlanmali
                kontrol = 0;
            }
        }
    }}