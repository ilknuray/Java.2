package AlpSonmezSorulari;

import java.util.Scanner;

public class KupKok {

    //şarıdan girilen sayının küp kökünü bulacağız.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi= sc.nextDouble();

        System.out.println(Math.cbrt(sayi));
    }

}
