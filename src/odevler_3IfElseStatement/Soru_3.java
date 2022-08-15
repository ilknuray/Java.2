package odevler_3IfElseStatement;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        //kullanicidan yasini alin eger 65 ten kucuk ise emekli olamzsin,
        //calismalisin,65 e esit veya buyukse emekli olabilirsin yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas<65){
            System.out.println("emekli olamazsin, "+(65-yas)+" yil daha calismalisin");
        }
        else {
            System.out.println("Emekli olabilirsin");
        }
    }
}
