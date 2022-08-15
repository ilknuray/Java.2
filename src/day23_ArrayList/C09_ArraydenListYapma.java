package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapma {
    public static void main(String[] args) {



    //list ile calisirken en kotu ozelligi urunleri tek tek eklemek


    Integer[]arr={1,2,5,7,9,9,8,6,6,3};

    //bukadar cok elemenli bir listeyi tek tek girmrk
    // yerine array olusturup for loop ile olusturdugumuz liste tasiyabiliriz
        List<Integer>sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);
        // bunu icin javann olusturdugu bir method var anacak cok yan etkisi var

        List<Integer>sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2);

        sayilar.add(5);
        System.out.println(sayilar);

       // sayilar2.add(5);
        //System.out.println(sayilar2);
        // 1 -busekilde olusturulan listede add remove
        // gibi size degistiren methodlar kullanilamaz

        //2- aslist methodu ile olusturulan liste ve kaynak olan array
        // ile iliskili olarak hayatlarini devam ettirirler birinde olan degisiklik otomatik olarak digerinide etkiler



        arr[0]=20;
        System.out.println(Arrays.toString(arr));
        System.out.println("array de degisiklik yapinca : " +sayilar2);


}}
