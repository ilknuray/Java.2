package AA;

import java.util.Scanner;

public class Soru_17 {
    public static void main(String[] args) {
           /*
        Klavyeden okunan bir integer sayıyı basamak basamak ve tersten ekrana yazdıran bilgisayar programını yazınız.

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int birlerBasamgi=0;

       while (sayi>0){
           birlerBasamgi=sayi%10;
           sayi/=10;
           System.out.print(birlerBasamgi);
       }
    }
}
