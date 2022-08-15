package recap_1;

import java.util.Scanner;

public class Soru_7 {
    public static void main(String[] args) {
        /*kullanicidan boyunu cm kilosunu kg olarak alip BMI (VKI)
        hesaplayiniz
        BMI=kilo(kg)/boy*boy
        bmi<=20 oldukca zayifsiniz
        20<bmi<=25 normal sinirlardasiniz
        25<bmi<=30 sisman kategorisindesiniz
        30<bmi==> obez gurubundasiniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen boyunuzu cm olarak giriniz :");
        double boy = scan.nextDouble();
        System.out.println("lutfen kilonuzu kg olarak giriniz :");
        double kilo = scan.nextDouble()/ 100;

        double bmi = kilo / (boy * boy);

        if (bmi <= 20) {
            System.out.println("bmi indexiniz" + bmi + "oldukca zayifsiniz");
        } else if (bmi <= 25) {
            System.out.println("bmi indexiniz" + bmi + "normal sinirlardasiniz");
        } else if (bmi <= 30) {
            System.out.println("bmi indexiniz" + bmi + "sisman kategorisindesiniz");
        } else if (bmi > 30) {
            System.out.println("bmi indexiniz" + bmi + "obez gurubundasiniz");

        }
    }
}
