package AlpSonmezSorulari;

import java.util.Scanner;

public class AraliktaMi {
    /*
    Bir sayının 10 ile 100 arasında olup olmadığını bulma

     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        if(sayi>10 && sayi<100){
            System.out.println(sayi +" sayisi bu aralik icindedir");
        }else{
            System.out.println("Aralik icinde degildir");
        }
    }
}