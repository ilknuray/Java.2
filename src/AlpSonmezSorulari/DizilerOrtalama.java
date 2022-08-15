package AlpSonmezSorulari;

import java.util.ArrayList;
import java.util.List;

public class DizilerOrtalama {
    /*
    Bu örneğimizde Dizilere  Dısarıdan Girilen
   Sayıların Toplamını ve Ortalamasını Bulacağız
'
     */
    public static void main(String[] args) {
        Integer []arr={2,4,6,8,3};
        List<Integer>sayilar=new ArrayList<>();
        int top=0;
        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
            top+=arr[i];


        }
        System.out.println(sayilar);
        System.out.println(top);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(8);
        int top2=0;
        for (int i = 0; i <sayilar.size() ; i++) {
            top2+=i;


        }
        System.out.println(sayilar);
        System.out.println(top2);




    }
}
