package replitSorular;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {
        /*
        Girilen zamanı saniyeye çeviren bir program yazınız.

Örnek Çıktı:

1 saat 10 dakika 50 saniye ==>

4250 saniye
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir saat giriniz");
        int saat = scan.nextInt();
        System.out.println("dakika");
        int dakika = scan.nextInt();
        System.out.println("saniye");
        int saniye = scan.nextInt();

        int top=0;

        top= saat*(60*60) +( dakika *60)+ saniye;
        System.out.println(saat+"saat"+ " " +dakika+"dakika"+" "+saniye+"saniye"+" "+top+"saniyedir");
    }
}
