package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        /*
        verilen bir arraydeki tekrar eden elementleri
        silip tekrarsiz halini arraye atayan kod yaziniz
         */
        int []arr={3,3,4,5,6,7,8,9,2,3,4,7,6,8,5};
        Set<Integer>tekrarsiz=new HashSet<>();
        for (int each:arr
             ) {
            tekrarsiz.add(each);

        }
        System.out.println(tekrarsiz);

        int[]tekrarsizArr=new int[tekrarsiz.size()];
        System.out.println(Arrays.toString(tekrarsizArr));
        int i=0;
        for (Integer each:tekrarsiz
             ) {
            tekrarsizArr[i]=each;
            i++;


        }
        arr=tekrarsizArr;
        System.out.println(Arrays.toString(tekrarsizArr));


    }
}
