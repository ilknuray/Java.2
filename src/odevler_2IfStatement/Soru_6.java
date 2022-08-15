package odevler_2IfStatement;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
        //kullanicidan bir gun alin eger gun cuma ise ekrana "muslumanlar icin kutsal gundur"
        //cumartesi ise yahudiler icin kutsal gundur
        //pazar ise hristiyanlar icin kutsal gundur yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();

        if (gunIsmi.equals("cuma")){
            System.out.println("muslumanlar icin kutsal gundur");
        }

        if (gunIsmi.equals("cumartesi")){
            System.out.println("yahudiler icin kutsal gundur");
        }

        if (gunIsmi.equals("pazar")){
            System.out.println("hristiyanlar icin kutsal gundur");
        }

        if (gunIsmi!="cuma" || gunIsmi!="cumartesi" || gunIsmi!="pazar"){
            System.out.println("normal bir gun");
    }
}}
