package teamLeadSorulari;

import java.util.Scanner;

public class Soru_13 {
    public static void main(String[] args) {
        /*Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye
         doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

        Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

        Test Data:
        madam

        Beklenen Çıktı:
        True*/
        String palindrom="";
        Scanner scan=new Scanner(System.in);
        System.out.println("palindrom bir kelime giriniz");
        String str= scan.nextLine();

         int kelime=str.length();
        for (int i = kelime-1; i>=0 ; i--) {

        }



    }
}
