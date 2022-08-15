package replitSorular;

import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dakika giriniz");
        int dakika= scan.nextInt();


        int gun=0;
        int yil=0;

        yil=dakika/(365*24*60);
        gun=dakika/(24*60*60);

        System.out.println(dakika+"dakika"+" "+"yaklasik"+" "+yil+"yil"+" "+gun+"gundur");


    }
}
