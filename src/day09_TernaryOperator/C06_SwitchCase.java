package day09_TernaryOperator;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        //kullanicidan gun ismini alip haftasono hafta ici oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi = scan.next();

        switch (gunIsmi) {


            case "pazartesi":
                System.out.println("hafta ici");
                break;
            case "sali":
                System.out.println("hafta ici");
                break;
            case "carsamba":
                System.out.println("hafta ici");
                break;
            case "persembe":
                System.out.println("hafta ici");
                break;
            case "cuma":
                System.out.println("hafta ici");
                break;
            case "cumartesi":
                System.out.println("hafta sonu");
                break;
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("lutfen gecerli bir gun giriniz");


        }
    }
}