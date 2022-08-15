package odevler1;

import java.util.Scanner;

public class ScnnrOrnekSorular {
    public static void main(String[] args) {

    /* soru 1 kullanicidan ikik tamsayi alip bunlarin
    carpim,toplam ve farklarini yazdirin.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz ");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("sayilarin toplami = " +sayi1+sayi2);
        System.out.println( sayi1-sayi2);
        System.out.println("sayilarin carpimi = "+sayi1*sayi2);

        /*soru 2 kullanicidan karenin bir kenar uzunlugunun alin
        karenin cevresini ve alanini hesaplayin.
         */

    }
}
