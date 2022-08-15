package teamLeadSorulari;

public class Soru_1 {
    public static void main(String[] args) {
        /*
      /*
    1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

    Test Data
    34
    Beklenen Çıktı
    7  */

        int sayi=34;
        int rakamlarToplami=0;
        int birlerBasamagi=0;


        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        System.out.println(rakamlarToplami);



    }
}
