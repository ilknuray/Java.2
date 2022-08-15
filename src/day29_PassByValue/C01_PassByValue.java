package day29_PassByValue;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        4elemanli bir array olusturalim sonra ayri bir methodta bu arryin ikinci ve dorduncu
        elemanlarini 100 den kucuk rastgele herhangi bir sayi ile degistirip  yeni halini
        yazdiralim
         */

        int[]arr={5,7,8,10};
        elemanDegistir(arr);
        System.out.println("main method icerisinde diger method calistiktan sonra : " +Arrays.toString(arr));
        //[5 6 8 64]beklenen

    }

    public static void elemanDegistir(int[] arr) {

        Random rnd=new Random();
        arr[1]= rnd.nextInt(100);
        arr[3]= rnd.nextInt(100);
        System.out.println("methodun icinde : " +Arrays.toString(arr));
    }
}
