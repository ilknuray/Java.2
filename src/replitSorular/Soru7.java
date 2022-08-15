package replitSorular;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
         */
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();

        int sonuc=(sayi*sayi*sayi)/2;
        System.out.println("sonuc = " + sonuc);
    }
}
