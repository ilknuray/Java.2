package day05_matematikselIslemler;

public class C05_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = sayi1 + 1;

        sayi2 += 5;

        /*pre veya post sadece ++ veya --icin decerlidir
        bu iki islem sayidan once veya sora yazilmasina gore farkli iki islem olur

         */
        int sayi3 = sayi2++;//
        System.out.println("sayi3 = " + sayi3);
        System.out.println("sayi2 = " + sayi2);

        int sayi4 = ++sayi1;

        System.out.println("sayi4 = " + sayi4);
        System.out.println("sayi1 = " + sayi1);
    }
}
