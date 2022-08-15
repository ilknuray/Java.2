package dataCasting;

public class DtaCasting {
    public static void main(String[] args) {
        //bos kova kullanmadan degerleri degistirin.

        int sayi1=10;
        int sayi2=20;
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("swaptan sonra sayi1 : " + sayi1);
        System.out.println("swaptan sonra sayi2 : " + sayi2);

    }
}
