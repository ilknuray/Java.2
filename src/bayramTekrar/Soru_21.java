package bayramTekrar;

import java.util.Scanner;

public class Soru_21 {
    public static void main(String[] args) {
        /*
         * Problem tanimi : Kulanicidan aracinin hizini aliniz Trafik cezasinin degerini
         * hesaplayin. 45 hiz siniridir. Eger hiziniz 55-74 arasinda ise: Ceza 100
         * $'dir.
         * Eger hiziniz 75 - 84 arasinda ise: Ceza 150
         * Eger hiziniz 85 -94 arasinda ise: Ceza 320 $'d
         * Eger hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         * ve ayrica, Eger sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
         *
         * örn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         *
         * -----------------------------------------
         *
         * örn;
         *
         * currentSpeed(Hiziniz) 87 ve isDriverLicenceAvailable(Ehliyeti var mi?) =
         * true;
         *
         * sonuc 320 olmalidir.
         *
         * currentSpeed(Hiziniz) 65 ve isDriverLicenceAvailable(Ehliyeti var mi?) =
         * false;
         *
         * sonuc 300 olmalidir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ehliyet durumunuzu giriniz\nehliyetiniz varsa E yoksa H yaziniz");
        char ehliyet = scan.next().charAt(0);
        System.out.println("lutfen hizinizi giriniz");
        int hiz = scan.nextInt();
        int ceza1 =100;

        int ceza2=150;
        int ceza3=350;


        if (ehliyet == 'E') {
            if (hiz>=55|| hiz<=74  ) {
                System.out.println(ceza1);
            } else if (hiz>=75|| hiz<=84) {
                System.out.println(ceza2);

            } else if (hiz >= 85 || hiz <= 95) {
                System.out.println(ceza3);
            }
        } else if (ehliyet == 'H') {
            if (hiz>=55|| hiz<=74) {
                System.out.println(ceza1+200);
            }  else if(hiz>=75|| hiz<=84){
                System.out.println(ceza2+200);
            }

        }else {
            System.out.println("hiz oldurur");
        }
    }
}
