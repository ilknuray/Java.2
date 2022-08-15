package replitSorular;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

Ornek Cikti :;

Alan: 9

Cevre: 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen karanin bir kenar uzunlugunu giriniz");
        int a= scan.nextInt();

        int alan=a*a;
        int cevre=4*a;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
