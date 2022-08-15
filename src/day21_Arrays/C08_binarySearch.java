package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        //binary search java da eleman aramanin kisa yoludur ama once siralama yapmak gereklidir
        //siralama yapmadan binary search yapilirsa sonucu bulamayabilir
        //yada yanlis bulur

        String[] harfler={"a","b","y","h","e"};

        String arananHarf="y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        //binarysearch bize aradigimi elemanin index ini dondurur
        //array sirali olmadigi icin bize dogru sonuc dondurmeyebilir
        //emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));

    }
}
