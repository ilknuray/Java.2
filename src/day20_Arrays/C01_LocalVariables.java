package day20_Arrays;

public class
C01_LocalVariables {
    public static void main(String[] args) {

        int sayi = 10;

        for (int i = 0; i < 20; i++) {
            System.out.println(i);

        }
        //i loop ta olusturulmus local variabledir sadece loop icerisinde kullanilabilir

        // static int sayiStatic=20;static keyword sadece class level da kullanilabilir
        //baska bir yerde kullanilamaz
        //method larin icerisinde static variable kullanilamaz
    }

    public static void method1() {
        // System.out.println();sayi main method ta olusturulmus local bir variabledir
        //ve sadece main methodta gecerlidir

        int sayiMethod = 20;

    }
}
