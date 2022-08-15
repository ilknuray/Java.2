package replitSorular;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {
        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
         Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

1 şeker = 1.7 gr

Örnek Çıktı:

Yılda 12.41 kg şeker kullanıyor.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir gunde kac bardak cay iciyorsunuz");
        double bardak= scan.nextDouble();
        System.out.println("kac seker kullaniyorsunuz");
        double seker= scan.nextDouble();

        double sekerMiktari=(seker*bardak*365)/1000;
        System.out.println(sekerMiktari);



    }
}
