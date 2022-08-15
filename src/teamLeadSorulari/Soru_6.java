package teamLeadSorulari;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
      /*  6----     Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
                değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        Test Data:
        a
        Beklenen Çıktı:
        a harfi sesli harfdir.
        Test Data:
        d
        Beklenen Çıktı:
        d harfi sesiz harftir.
        Test Data:
        we  yada %
        Beklenen Çıktı:
        Yanlis karakter girdiniz!*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().toLowerCase().charAt(0);


        switch (harf){
            case 'a':
                System.out.println("a harfi sesli harftir");
                break;
            case 'e':
                System.out.println("e harfi sesli harftir");
                break;
            case 'i':
                System.out.println("i harfi sesli harftir");
                break;
            case 'o':
                System.out.println("o harfi sesli harftir");
                break;
            case 'u':
                System.out.println("u harfi sesli bir harftir");
                break;
            default:
                System.out.println("yanlis karakter girdiniz");
        }

    }
}
