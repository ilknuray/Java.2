package odevler1;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {

         /*soru 2 kullanicidan karenin bir kenar uzunlugunun alin
        karenin cevresini ve alanini hesaplayin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("karenin bir kenar uzunlugunu giriniz");
        double kenar =scan.nextDouble();
        System.out.println("karenin alani = " +kenar*kenar);
        System.out.println("karenin cevresi = " +kenar*4);

    }
}
