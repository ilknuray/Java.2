package teamLeadSorulari;

import java.util.Scanner;

public class Soru_17 {
    public static void main(String[] args) {
     /*   Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
​
        Test data:
        12,24,34
​
        Beklenen Çıktı:
        12*/
        int enKucuk=0;
        enKucukSayiBul(enKucuk);
    }

    public static void enKucukSayiBul(int enKucuk) {

        Scanner sc=new Scanner(System.in);
        System.out.println("uc adet tam sayi giriniz");
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();
        int sayi3= sc.nextInt();

        int kucuk=sayi1;

        if(sayi2<sayi1&&sayi2<sayi3){
            kucuk=sayi2;
        }if(sayi3<sayi1&&sayi3<sayi2){
            kucuk=sayi3;
        }
        System.out.println(kucuk);
    }
}
