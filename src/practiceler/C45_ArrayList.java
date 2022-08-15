package practiceler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C45_ArrayList {
    public static void main(String[] args) {
        /*
        rastgele kullanici adi olusturan java kodu yaziniz
        kullanicidan ismini isteyelim
        kullanici adindaki bosluklari silelim
        kullanici adini alinabilir olup olmadigina bakalim
        eger bizim listemizde oyle bir kullanic adi yoksa kullanici adi kullanicinin girdigi isim olsun
        eger bu kullanici adi zaten varsa sonuna rastgele sayi olusturup ekleyelim
         */
        List<String>dateBaseIismler=new ArrayList<>();

        dateBaseIismler.add("enes");
        dateBaseIismler.add("ismail");
        dateBaseIismler.add("abdulbaki");
        dateBaseIismler.add("emre");
        dateBaseIismler.add("melisa");
        dateBaseIismler.add("oguz");
        System.out.println("dateBaseIismler : " + dateBaseIismler);

        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanmak istediginiz username i giriniz");
        String username= scan.nextLine().trim();

        boolean usernameVarmi=dateBaseIismler.contains(username);
        if(usernameVarmi){
            System.out.println("bu kullanici adi zaten alinmis");
        }else {
            System.out.println("bu kullanici adini kullanabilirsiniz");
            if (usernameVarmi){
                int randomSayi=new Random().nextInt(100);
                username+=randomSayi;
                System.out.println(username);
            }else{
                System.out.println("kullanici adiniz : "+username);
            }
        }







    }
}