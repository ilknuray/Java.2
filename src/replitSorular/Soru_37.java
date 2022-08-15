package replitSorular;

import java.util.Arrays;

public class Soru_37 {
    /*
    yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]

Aranan Değer:2020
Beklenen Çıktı:**True**
Aranan Değer:2010
Beklenen Çıktı :**False**
     */
    public static void main(String[] args) {
        int[] arr = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        int arananSayi =2020;
        boolean sayiVarmi=false;
        if (!sayiVarmi) {
            System.out.println(Arrays.binarySearch(arr, arananSayi));


        }else{
            System.out.println("false");
        }
    }
}