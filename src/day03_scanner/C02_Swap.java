package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /*verilen saayi1 ve sayi2 degerlerinidegistiren (swap)
        bir program yaziniz.
        Orn:sayi1=15
       sayi2=30;

       kod calistiktan sonra
       sayi1=20 ve
       sayi2=10
         */
        int sayi1 = 15;
        int sayi2 = 30;
        int sayi3 = 0;// Gecici kova
        sayi3 = sayi2;//30
        sayi2 = sayi1;//15
        sayi1 = sayi3;//30

        System.out.println("swaptan sonra sayi1 : " + sayi1);
        System.out.println("swaptan sonra sayi2 :" + sayi2);


    }
}
