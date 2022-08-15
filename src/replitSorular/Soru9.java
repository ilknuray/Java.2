package replitSorular;

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("dikdortgenin iki kenar uzunlugunu giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();

        int alan=a*b;
        int cevre=2*(a+b);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
