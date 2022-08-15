package replitSorular;

import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının
        toplamını bulmasını isteyin.

Örnek Çıktı:

Verilen tamsayının rakamları toplamı 10'dur.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen uc basamali bir sayi giriniz");
        int sayi= scan.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        System.out.println(rakamlarToplami);



    }
}
