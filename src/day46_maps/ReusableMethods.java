package day46_maps;

import java.util.*;

public class ReusableMethods {
    public static Map<Integer,String> mapOlustur(){
        Map<Integer,String> sinifMap=new HashMap<>();
        sinifMap.put(101,"Ali, Can, JDev ");
        sinifMap.put(102,"Enes, Cem, QA");
        sinifMap.put(103, "Taha, Emre, Java");
        sinifMap.put(104, "Derya, Deniz, QA");
        sinifMap.put(105, "Enes, Can, QA");
        sinifMap.put(106, "Taha, Deniz, JDev");
        sinifMap.put(107, "Derya, Cem, QA");

        return sinifMap;

    }

    public static void tumValueSiraliYazdir(Map<Integer,String>ogrenciMap) {
        int sira=1;
        for (String each: ogrenciMap.values()
             ) {
            System.out.println(sira+ " "+ each);
            sira++;

        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        List<String> methoddakiList = new ArrayList<>();


        return methoddakiList;
    }

    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListMap) {
        //brans =branstakiOrenciSayisi
        Map<String,Integer> bransOgrSayiMap=new TreeMap<>();

        Collection<String> valuesCollection=sinifListMap.values();
        String  [] valueArr;
        String brans;
        Integer branstakiOrenciSayisi;
        for (String each:valuesCollection
             ) {
            valueArr=each.split(", ");
            brans=valueArr[2];

            //bransin bransOgrSayiMapayisi mapinde daha onceden
            // eklenip eklenmedigini kontrol etmeliyiz

           if(!bransOgrSayiMap.containsKey(brans)){
               bransOgrSayiMap.put(brans,1);
           }else{
               branstakiOrenciSayisi=bransOgrSayiMap.get(brans);
               bransOgrSayiMap.put(brans,++branstakiOrenciSayisi);
           }




        }System.out.println(bransOgrSayiMap);

    }
}