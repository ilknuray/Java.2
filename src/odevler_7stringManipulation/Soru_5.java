package odevler_7stringManipulation;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {


        //kullanicidan bir sifre girmesini isteyin asagidaki sartlari sagliyorsa
        //"sifre basari ile tanimlandi"
        //sartlari saglamazsa "yeni bir sifre giriniz"yazdirin
        //ilk harf buyuk olmali
        //son harf kucuk olmali
        //sifre bosluk icermemeli
        //sifre uzunlugu en az 8 karakterli olmali

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = sc.nextLine();
        int kontrol = 0;
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            kontrol++;
        } else {
            System.out.println("ilk harf buyuk olmali");
        }
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            kontrol++;
        } else {
            System.out.println("son harf kucuk olmali");
        }
        if(sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
        }else{
            kontrol++;
        }
        if(sifre.length()>=8) {
            kontrol++;
        }else{
            System.out.println("sifre uzunlugu en az 8 karakterli olmali");
        }
        if(kontrol==4) {
            System.out.println("sifre basari ile tamamlandi");
        }else{
            System.out.println("islem basarisiz,lutfen yeni bir sifre giriniz");
        }

    }

}
