package bayramTekrar;

import java.util.Scanner;

public class Soru_12 {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vIZE1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen vize1 notunuzu giriniz");
        int not1=scan.nextInt();
        System.out.println("lutfen vize2 notunuzu giriniz");
        int not2= scan.nextInt();
        System.out.println("lutfen final notunuzu giriniz");
        int not3= scan.nextInt();



        int ort1=((not1+not2)/2)*30/100;
        int ort2=not3*70/100;
        int ort=(ort1+ort2);
        System.out.println(ort);
    }
}
