package grupCalismasi;

import java.util.Scanner;

public class soru_1 {
    public static void main(String[] args) {
       /* Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri
        gerçekleştiren bir switch ifadesi yazın:
        yanıt a ise, talebiniz işleniyor mesajı yazdırılır
        yanıt b ise, yine de ilgilendiğiniz için teşekkür ederiz mesajı yazdırılır

        yanıt c ise, Üzgünüz, şu anda herhangi bir yardım yok mesajı,
         yanıtın başka herhangi bir değeri için yazdırılır,
        "Geçersiz giriş, lütfen tekrar deneyin!" mesajı yazdırılır
        Tarayıcı nesnesi oluşturun.
                Belirtilen dizindeki char değerini almak için charAt0 yöntemini kullanın.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen a , b veya c harflerinden birini seciniz");
        char harf=scan.next().charAt(0);

        switch (harf){
            case 'a':
                System.out.println("talebiniz isleniyor");
                break;
            case 'b':
                System.out.println("yine de ilgilendiginiz icin tesekkur ederiz");
                break;
            case 'c':
                System.out.println("uzgunuz suanda bir yardim yok");
                break;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
        }
    }
}
