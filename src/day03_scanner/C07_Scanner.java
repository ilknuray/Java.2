package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //bir onceki soruyu tek adimda yapiniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi soyisminizi ve yasinizi giriniz \naralarda entera basiniz");
        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        int yas= scan.nextInt();
        System.out.println("girilen bilgiler=" +isim+","+soyisim+","+yas);
    }
}
