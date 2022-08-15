package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    /*
    verilen bir stringdeki kullanilan harfleri ve kullanilan harflerin tekrar sayisini
    H=20 seklinde yazdirin
     */
    public static void main(String[] args) {


        String str = "Heeeeeeelllllooooooo Wooooorrrrrllllldddddd";
        //spaceleri saymamasi icin once onlari yok edelim
        str=str.replaceAll("\\W","");
        String[] harflerArr = str.split("");

        System.out.println(Arrays.toString(harflerArr));
        //harfleri key kullanim adedini de value yapalim

        Map<String,Integer>harfKullanimSayilariMap=new HashMap<>();
        Integer harfKullanimSayisi;
        for (String each:harflerArr
             ) {
            if
            (!harfKullanimSayilariMap.containsKey(each)){
                harfKullanimSayilariMap.put(each,1);
            }else{
                harfKullanimSayisi=harfKullanimSayilariMap.get(each);

                harfKullanimSayilariMap.put(each,++harfKullanimSayisi);

            }
        }

        System.out.println(harfKullanimSayilariMap);
    }
}