package recap_1;

import java.util.Scanner;

public class Soru_8 {
    public static void main(String[] args) {
        /*kullanicidan yasini ve kilosunu aliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindan buyuk ve 50 kilodan hafif ise kan bagisi yapamaz
        18yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen yasinizi girin");
        int yas= sc.nextInt();
        System.out.println("lutfen kilonuzu giriniz");
        int kilo=sc.nextInt();

        if (yas>0&&yas<18) {
            System.out.println("kan bagisi yapamaz");
        }else if (yas>18&&kilo<50) {
            System.out.println("kan bagisi yapamaz");
        }else if (yas>18&&kilo>50) {
            System.out.println("bagis yapabilir");
        } else{
            System.out.println("gecerli verileri giriniz");

        }
    }}