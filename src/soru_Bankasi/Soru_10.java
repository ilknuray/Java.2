package soru_Bankasi;

import java.util.Scanner;

public class Soru_10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen uc tane sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();

       int enBuyuk=sayi1;
       int enKucuk=sayi2;

       if (sayi2>enBuyuk){
           sayi2=enBuyuk;
       }if(sayi3>enBuyuk){
            sayi3=enBuyuk;
        }if(sayi1<enKucuk){
            sayi1=enKucuk;
        }if (sayi3<enKucuk){
            sayi3=enKucuk;
        }
        System.out.println("girilen sayilarin en buyugu : " +enBuyuk +"girilen sayilarin en kucugu : " +enKucuk);
    }
}
