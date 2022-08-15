package day17nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan toplamak uzere sayilar alin sayilarin toplami 500u
        gecince sayilarin toplamini yazdirin
         */
        int toplam=0;
        int sayi=0;
        int sayac=0;
        Scanner scan=new Scanner(System.in);


        while(toplam<500){
            System.out.println("lutfen toplamak icin sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println(sayac +" sayi girdiniz ve toplamlari : " +toplam);
    }
}
