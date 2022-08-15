package day09_TernaryOperator;

import java.util.Scanner;

public class C02_TekmiCiftmi {
    public static void main(String[] args) {
        //kullanicidan bir tamsayi alin ve sayinin tekmi cift mi oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println(sayi%2==0 ? "sayi cift":  "sayi tek");

    }
}
