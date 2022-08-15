package AA;

import java.util.Scanner;

public class Soru_15 {
    public static void main(String[] args) {
           /*
        Kullanıcıdan (negatif bir sayı girinceye kadar) pozitif sayılar alarak bu
        sayıların ortalamasını ekrana yazdıran bir program yazınız.

         */
        Scanner scan=new Scanner(System.in);

        int top=0;
        int sayi;
        do {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            if(sayi>0){
                top+=sayi;
            }

        }while (sayi>0);
        System.out.println("negatif sayi girdiniz program durdu,sayilarin toplami :  " +top);
    }
}
