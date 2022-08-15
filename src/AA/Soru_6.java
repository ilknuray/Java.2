package AA;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
          /*
        Bir öğrenciye bir soru sorulsun ve öğrenciden cevap alınsın. Öğrencinin verdiği cevap doğru değilse,
        bir defa daha sorunun sorulduğu durumun akış şemasını çiziniz ve Java programını yazınız.
         */
        Scanner sc=new Scanner(System.in);
        boolean ogrenciCevabi=true;
        while (ogrenciCevabi){
            System.out.println("lutfen sorulara cevap veriniz");
            ogrenciCevabi= sc.nextBoolean();
            if(ogrenciCevabi==true){
                System.out.println("tesekkurler dogru cevap");


            }else{
                System.out.println("tekrar cevap veriniz");
                ogrenciCevabi= sc.nextBoolean();
                if (ogrenciCevabi==false){
                    break;
                }

            }

        }
    }
}
