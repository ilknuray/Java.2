package soru_Bankasi;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();
        System.out.println("lutfen yapmak istediginiz islemi seciniz");
        System.out.println("1- Toplama \n2-cikarma \n3-carpma \n4-bolme");
        System.out.println("lutfen yapmak istediginiz islemi giriniz");
        int islem=scan.nextInt();
        
        if(islem==1){
            System.out.println("toplam : " +(sayi1+sayi2));
        }else if(islem==2){
            System.out.println("cikarma : " +(sayi1-sayi2));

        }else if(islem==3){
            System.out.println("carpma : " +(sayi1*sayi2));
        }else if(islem==4){
            System.out.println("bolme : " +(sayi1/sayi2));
        }else{
            System.out.println("lutfen gecerli bir secim yapiniz");
        }
    }
}