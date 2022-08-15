package replitSorular;

import java.util.Arrays;

public class Soru_38 {
    /*
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

Array: [12,15,43,23,56,76,78,90,77,43]

Aranan değer:56
Beklenen Çıktı:
56 sayısı arrayin 4. elemanı
     */
    public static void main(String[] args) {
        int [] arr={12,15,43,23,56,76,78,90,77,43};
        int arananSayi=56;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,arananSayi));
    }
}
