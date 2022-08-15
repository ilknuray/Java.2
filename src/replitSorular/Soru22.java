package replitSorular;

import java.util.Scanner;

public class Soru22 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
        Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse
"isim ayni karakterlere sahiptir." yazdirin.
Eger ayni kaakterlere sahip degilse
"Dizenin benzersiz karakterleri var" yazdirin.
Ternary kullanin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim= scan.nextLine();
        if (isim.length()>=3){

        for (int i = 0; i < isim.length(); i++) {
            for (int j = i + 1; j < isim.length(); j++) {



            }
        }
        }



    }
}
