package teamLeadSorulari;

import java.util.Scanner;

public class Soru_14 {
    public static void main(String[] args) {
       /* Girilen iki String veriyi karşılaştıran Java kodu yazınız.
        Test data:
        1. String : techproed.com
        2. String : Techproed.com
        Beklenen Çıktı:
        False
        Test data:
        1. String : techproed.com
        2. String : techproed.com
        Beklenen Çıktı:
        true*/

        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str= sc.nextLine();
        System.out.println("lutfen ikinci kelimeyi giriniz");
        String str2=sc.nextLine();

        if (str.equals(str2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
