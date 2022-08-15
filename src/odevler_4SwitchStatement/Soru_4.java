package odevler_4SwitchStatement;

import java.util.Locale;
import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String harf=scan.next();


        switch (harf){

            case "S":
                System.out.println("Software");
                break;
            case "D" :
                System.out.println("Developer");
                break;
            case "E" :
                System.out.println("Engineer");
                break;
            case "T" :
                System.out.println("In Testing");
                break;

        }
    }
}
