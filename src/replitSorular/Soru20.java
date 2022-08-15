package replitSorular;

import java.util.Scanner;

public class Soru20 {
    public static void main(String[] args) {
        /*
        Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:

yanıt a ise,
"Talebiniz işleniyor" mesajı yazdırılır
yanıt b ise,
"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır yanıt c ise,
"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
başka herhangi bir yanıt değeri için,
"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf=scan.next().toLowerCase().charAt(0);

        switch (harf){
            case 'a':
                System.out.println("Talebiniz isleniyor");
                break;
            case 'b':
                System.out.println("Yine de ilgilendiginiz icin tesekkur ederiz");
                break;
            case'c':
                System.out.println("Uzgunuz su anda hicbir yardim yok");
                break;
            default:
                System.out.println("Gecersiz giris lutfen tekrar deneyiniz");
        }
    }
}
