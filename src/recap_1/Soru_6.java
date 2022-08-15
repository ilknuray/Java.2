package recap_1;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
        /*bir iscinin isi bitirme suresini ve toplam isci sayisini alarak isin bitme suresini hesaplayan kodu
        yaziniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("bir isci isi kac gunde bitirmektedir :");
        double sure= sc.nextDouble();
        System.out.print("toplam isci sayisini giriniz :");
        double isciSayisi= sc.nextDouble();
        double bitmeSuresi=sure/isciSayisi;
       // sonuc=((1/sure*(isciSayisi))*bitmeSuresi==1);
       // System.out.println(bitmeSuresi==1/sure*);
        System.out.println("bitmeSuresi = " + bitmeSuresi);
    }
}