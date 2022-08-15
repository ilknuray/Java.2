package day08IfElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {

        /*kullanicidan gun ismini isteyin.girilen isim gecerli bir gun ise gun isminin
        1. 2. 3. harflerini ilk harfi buyuk diger ikisi kusuk  sekilde yazdirin
        gun ismi gecersiz  "gecerli gun ismi giriniz" yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();


        if (gunIsmi.equals("pazartesi")){
            System.out.println("Paz");
        }
        else if (gunIsmi.equals("sali")){
            System.out.println("Sal");
        }
        else if (gunIsmi.equals("carsamba")){
            System.out.println("Car");
        }
        else if (gunIsmi.equals("persembe")){
            System.out.println("Per");
        }
        else if (gunIsmi.equals("cuma")){
            System.out.println("Cum");
        }
        else if (gunIsmi.equals("cumartesi")){
            System.out.println("Cum");
        }
        else if (gunIsmi.equals("pazar")){
            System.out.println("Paz");
        }
        else{
            System.out.println("Gecerli bir gun giriniz");

        }
    }
}
