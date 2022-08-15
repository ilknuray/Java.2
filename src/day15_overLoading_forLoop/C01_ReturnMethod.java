package day15_overLoading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        //verilen iki sayiyi carpip sonucu bize donduren bir method olusturun

        int sayi1 = 10;
        int sayi2 = 5;

        int sonuc=carpma(sayi1, sayi2);
        System.out.println(sonuc);


    }

    public static int carpma(int sayi1, int sayi2) {
        int sonuc=sayi1*sayi2;
        return sonuc;
    }
}
