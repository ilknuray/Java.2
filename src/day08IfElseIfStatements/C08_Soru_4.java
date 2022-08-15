package day08IfElseIfStatements;

import java.util.Scanner;

public class C08_Soru_4 {
    public static void main(String[] args) {

        //kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
        //Teklif 80.000 in uzerinde ise "kabul ediyorum"
        //60 80.000 arasinda ise "konusabiliriz"
        //60.000 altinda ise "maalesef kabul edemem" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("maas teklifinizi giriniz");
       double odeme= scan.nextDouble();

        if (odeme>80000){
            System.out.println("kabul ediyorum");
        }
        else if (odeme>60000){
            System.out.println("dusunecegim");

        }

        else {
            System.out.println("kabul edemem");
        }

    }
}
