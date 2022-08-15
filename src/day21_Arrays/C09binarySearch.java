package day21_Arrays;

import java.util.Arrays;

public class C09binarySearch {
    public static void main(String[] args) {
        /*
        binarysearch methodu siralanmis arrayde aradigimiz elementin index ini dondurur

        ya aradigimiz element arrayde yoksa
        string de indexof bize olmayan elementler icin -1 dondururdu


        aradigimiz element arrayde yoksa java hem olmadigini hemde olsaydi nerede olacagini bize dondurur
        ancak index ini degil siralamasini dondurur VE olmadigini gostermek icin basina - koyar
        //VARSA INDEX YOKSA - SIRA
         */
        int[]sayilar={3,5,1,4,7,0};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.binarySearch(sayilar,4));
        System.out.println(Arrays.binarySearch(sayilar,9));
    }
}
