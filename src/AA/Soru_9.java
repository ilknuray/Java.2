package AA;

import java.util.Arrays;

public class Soru_9 {
     /*
        Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki
        tum elemanlarin toplamini  birer birer bulan ve herbir sonucu
        yeni bir array’in elemani yapan ve yeni array’i  ekrana  yazdiran
        bir program yaziniz.
        Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
         */
     public static void main(String[] args) {
         int [][]arr={ {1,2,3}, {4,5}, {6,7} };
         int top=0;
         System.out.println(Arrays.toString(arr));
         for (int i = 0; i < arr.length ; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                top+=arr[i][j];

             }

         }
         System.out.println(top);
     }
}
