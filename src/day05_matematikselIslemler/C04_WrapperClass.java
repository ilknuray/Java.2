package day05_matematikselIslemler;

import java.util.Locale;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String str="Java cok guzel";
        str.toUpperCase();//string de methodlar var primitive data type larda
                         // yok o yuzden wrapper class kullaniriz


        Integer sayi2=10;
        sayi2.intValue();
        System.out.println(sayi2);
    }
}
