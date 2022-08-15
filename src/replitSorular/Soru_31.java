package replitSorular;

import java.util.Scanner;

public class Soru_31 {
    public static void main(String[] args) {
       /* Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

        Input :1238

        Output :Girilen Numananin Tersi: 8321*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        int birlerBasamagi=0;


      for (int i = 0; i <=sayi ; i++) {
          birlerBasamagi = sayi % 10;


          sayi /= 10;
          System.out.print(birlerBasamagi);


      }


/*
        while (sayi>0){
            birlerBasamagi=sayi%10;
            System.out.print(birlerBasamagi);
            sayi/=10;
        }*/


    }
}
