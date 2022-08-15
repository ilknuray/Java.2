package kodBloklari;

import java.util.Scanner;

public class AsallariBul {
    //Bu örnekte ana programda kullanıcıdan 2 adet sayı aldıktan sonra bu sayıları metoda göndereceğiz
    // . Bu metot da bu sayılar arasındaki asal sayıları ekrana yazdıracak.
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz");
        int sayi1 = sc.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int sayi2 = sc.nextInt();

        asallariBul(sayi1, sayi2);
    }

    public static void asallariBul(int sayi1, int sayi2) {

        int sayac=0;


            for (int i = sayi1; i <sayi2; i++) {
                for (int j = sayi1; j <i ; j++) {
                    if(i%j==0){
                        sayac++;
                    }

                }
                if(sayac==0){
                    System.out.println("asal sayi : " +i);
                }



            }
        }
    }
