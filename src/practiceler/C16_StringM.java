package practiceler;

import java.util.Scanner;

public class C16_StringM {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz \nAralarda entere basiniz");
        String isim= scan.nextLine();
        String soyisim= scan.nextLine();

        System.out.println(isim.length() > soyisim.length() ? isim : soyisim);
    }
}
