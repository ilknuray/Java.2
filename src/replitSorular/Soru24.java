package replitSorular;

import java.util.Scanner;

public class Soru24 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim= scan.nextLine();

        isim=isim.substring(isim.length()-2);
        System.out.println(isim+isim+isim);
    }
}
