package day21_Arrays;

public class C01_ArraysMaxSayiyiBulma {
    public static void main(String[] args) {
        // verilen bir int array deki en buyuk sayiyi yazan bir method olusturun

        int []sayilar={3,5,7,4,9,5,2};
        maxSayiYazdir(sayilar);
    }

    public static void maxSayiYazdir(int[] sayilar) {

        int maxSayi=sayilar[0];{
            for (int i = 1; i <sayilar.length ; i++)
                if(sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }
        }

            System.out.println(maxSayi);


    }
}
