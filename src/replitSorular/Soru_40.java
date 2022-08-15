package replitSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_40 {
    /*
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu
    yazınız.

Array: [1232,2345,5467,678,3454,2312,3451]
     */
    public static void main(String[] args) {
       int [] sayilar={1232,2345,5467,678,3454,2312,3451};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(sayilar[sayilar.length-2]);

    }
}
