package AlpSonmezSorulari;

import java.util.Scanner;

public class KarakterSayisi {
    //u örneğimizde Dışarıdan Girilen Cumledeki Karakter Sayısını Bulacağız.
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String str= sc.nextLine();
        int karakterSayisi=0;

        for (int i = 0; i <str.length() ; i++) {
            karakterSayisi++;

        }
        System.out.println(karakterSayisi);


    }
}