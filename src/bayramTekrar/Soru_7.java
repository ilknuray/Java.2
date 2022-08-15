package bayramTekrar;

import java.util.Scanner;

public class Soru_7 {
    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("uc basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        int birlerBasamagi=0;
        int onlarBamagi=0;
        int yuzlerBasamagi=0;

        birlerBasamagi=sayi%10;
        sayi/=10;

        System.out.println("girdiginiz sayinin birler basamagi : " +birlerBasamagi);

        onlarBamagi=sayi%10;
        sayi/=10;
        System.out.println("girdiginiz sayinin onlar basamagi : " +onlarBamagi);


        yuzlerBasamagi=sayi%10;
        sayi/=10;
        System.out.println("girdiginiz sayinin yuzler basamagi : " +yuzlerBasamagi);
    }
}
