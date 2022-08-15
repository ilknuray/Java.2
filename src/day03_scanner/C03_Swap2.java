package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        // bos variable kullanmadan yapalim.

        int sayi1=10;
        int sayi2=20;
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("swap oncesi sayi1 :"+sayi1);System.out.println("swap oncesi sayi2 :"+sayi2);
    }
}
