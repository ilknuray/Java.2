package day15_overLoading_forLoop;

public class C03_Overloading {
    public static void main(String[] args) {

        rakamlariTopla(5, 7);
        rakamlariTopla(4.5,5.6);
        rakamlariTopla(4.5,4.5);

        /*
        java hangimethodun calisacagina karar verirken optimizasyon yapar
        eger hic cast yapmadan kullanacagi method varsa onu tercih eder
        eger cast yapmadan kullanacagi method yoksa en az  cast yaparak kullanacagi
        method u tercih eder
         */
    }

    public static void rakamlariTopla(int sayi1, int syi2) {
        System.out.println(sayi1 + syi2);

        // ayni class ta parametre sayisi ve parametre data turleri ayni olan iki method olusturamayiz


    }

    public C03_Overloading() {
    }

    public static void rakamlariTopla(double sayi1, int syi2) {
        System.out.println( "double int toplami : " +(sayi1 + syi2));
    }
    public static void rakamlariTopla(double sayi1, double syi2) {
        System.out.println("double double toplami : " +(sayi1 + syi2));
}}
