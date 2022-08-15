package recap_1;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {
        /*kullanicidan alacaginiz vize2 vize1 ve  final notlarini vize ortalamasinin %30 U
        final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("vize 1");
        double vize1= scan.nextDouble();
        System.out.println("vize 2");
        double vize2= scan.nextDouble();
        System.out.println("final notunuzu giriniz");
        double finl= scan.nextDouble();
        double vizeOrt=(vize1+vize2)/2;
        double gecmeNotu=(vizeOrt*30/100)+(finl*70/100);
        System.out.println("gecmeNotu = " + gecmeNotu);
    }
}
