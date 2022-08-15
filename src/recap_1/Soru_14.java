package recap_1;

import java.util.Scanner;

public class Soru_14 {
    public static void main(String[] args) {
        /*ternary kullanarak bir kod yaziniz
        fiyat isminde bir variable tanimlayin
        eger fiyat < 10ise ucuz
        10 ile 20 arasinda ise normal
        20 ve 20 den buyukse pahali olsun
         */
       // Scanner scan=new Scanner(System.in);
       // System.out.println("lutfen fiyat giriniz");
        int miktar =10;


      String sonuc= miktar<10?("ucuz" ) : ((miktar<=10||miktar<20) ? "normal" : "pahali");
      System.out.println(sonuc);



        if (miktar<10) {
            System.out.println("ucuz");
        } else if (miktar<20) {
            System.out.println("normal");
        }else{
            System.out.println("pahali");
        }


        }

        }


