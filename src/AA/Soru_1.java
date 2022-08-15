package AA;

import java.util.Scanner;

public class Soru_1 {  /*
        Klavyeden okunacak bir e-mail adresindeki kullanıcı adını ve sunucu adını ekrana yazdıran bilgisayar
         programını Java dilinde yazınız.
e-mail adresi örneği: turkaslan@gmail.com
ekrana:
kullaniciadi: turkaslan
sunucu: gmail yazacak.
         */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen email adresinizi giriniz");
        String email= sc.nextLine();
        int index=email.indexOf("@",0);
        String isim=email.substring(0,index);
        int nokta=email.indexOf(".");
        String sunucu=email.substring(index+1,nokta);
        System.out.println("Kullanici adi : " +isim+"\nsunucu : " +sunucu);

    }
}
