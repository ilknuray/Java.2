package bayramTekrar;

import java.util.Scanner;

public class Soru_18 {
    public static void main(String[] args) {
       /*
         *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
         *
        BMI = kilo(kg) /(boy*boy)(cm)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen boyunuzu cm olarak giriniz");
        double boy= scan.nextDouble();
        System.out.println("lutfen kilonuzu kg olark giriniz");
        double kilo= scan.nextDouble();


        double vke=(kilo/(boy*boy));

        if(kilo/(boy*boy)<=20){
            System.out.println("oldukca zayifsiniz");
        }else if(20<kilo/(boy*boy)&&kilo/(boy*boy)<=25){
            System.out.println("normal sinirlardasiniz");
        }else if(25<kilo/(boy*boy)&&kilo/(boy*boy)<=30){
            System.out.println("sisman kategorisindesiniz");
        }else{
            System.out.println("gecerli sekilde giris yapiniz");
        }
    }
}
