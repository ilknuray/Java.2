package AA;

import java.util.Arrays;

public class Soru_8 {
    /*
         Verilen String bir dizideki elemanları karakter uzunluğuna göre büyükten küçüğe doğru sıralayın.
         input : String sehirler[] = {"Trabzon", "Ankara", "Mus", "Agri", "Hatay", "Canakkale", "Istanbul",
         "Van", "Sanliurfa", "Rize", "Izmir"};
         output: [Canakkale, Sanliurfa, Istanbul, Trabzon, Ankara, Hatay, Izmir, Rize, Agri, Van, Mus]
      */
    public static void main(String[] args) {
        String[] str = {"Trabzon", "Ankara", "Mus", "Agri", "Hatay", "Canakkale", "Istanbul",
                        "Van", "Sanliurfa", "Rize", "Izmir"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {

        }
    }
}
