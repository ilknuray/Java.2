package odevler_2IfStatement;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {

        //kullanicidan gun ismini isteyin ve hafta ici veya hafta sonu oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = scan.nextLine().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("Haftasonu ");
        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println("hafta ici ");
        }
    }

}

