package day24_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UnicArrayOlusturma {
    public static void main(String[] args) {
        //verilen bir arraydeki unic elementleri yeni bir array olarak donduren bir method olusturalim
        // tekrar eden elementleri tek bir defa barindiran

        int[]arr={2,3,5,6,3,4,1,9,6,3,5,5};
        int[] unuqueArray=unuqueArrayOlustur(arr);
        System.out.println(Arrays.toString(unuqueArray));
    }

    public static int[] unuqueArrayOlustur(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer>benzersizList=new ArrayList<>();
        //yanindaki elemente esit olmayanlari listeye ekliyor

        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]!=arr[i+1]){
                benzersizList.add(arr[i] );
            }

        }//son elementi kontrol edip tooksa liste ekliyoruz
        if(!benzersizList.contains(arr[arr.length-1])){
            benzersizList.add(arr[arr.length-1]);

        }//benzersiz listedeki tum elemanlari listeye ekledik
        int[]tekrarsizArr=new int[benzersizList.size()];
        for (int i = 0;  i< tekrarsizArr.length; i++) {
            tekrarsizArr[i]=benzersizList.get(i);

        }
        return tekrarsizArr;

    }


}
