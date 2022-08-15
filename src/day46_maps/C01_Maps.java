package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String> sinifList=new HashMap<>();
        sinifList.put(101,"Ali, Can, JDev ");
        sinifList.put(102,"Enes, Cem, QA");
        sinifList.put(103, "Taha, Emre, Java");
        sinifList.put(104, "Derya, Deniz, QA");

        System.out.println(sinifList);//{101= Ali, Can, JDev , 102=Enes, Cem, QA, 103=Taha, Emre, Java, 104=Derya, Deniz, QA}
        System.out.println(sinifList.keySet());//[101, 102, 103, 104]
        System.out.println(sinifList.values());//[ Ali, Can, JDev , Enes, Cem, QA, Taha, Emre, Java, Derya, Deniz, QA

        System.out.println(sinifList.values().size());//4
       //tum ogrencilerin bilgilerini altalta yazdirin.
        System.out.println(sinifList.get(101));
        System.out.println(sinifList.get(102));
        System.out.println(sinifList.get(103));
        System.out.println(sinifList.get(104));

        for (Object each:sinifList.values()
             ) {//burada isim ve soyisimler ayrilmaz
            System.out.println(each);

        }
       Collection<String> tumValueColl =sinifList.values();

        String[]eachArr;
        int sira=1;

        for (String each:tumValueColl
           ) {
            eachArr=each.split(", ");
            System.out.println(Arrays.toString(eachArr));
            System.out.println(sira+ "- " + eachArr[0] + " "+ eachArr[1]);
            sira++;
            //buradaki each bize her bir ogrenciye ait ayni yapidaki
            //isim, soyisim, brans bilgilerini getiren stringler getiriyor


        }
        //mapte bulunan ogrencilerin isim ve soisimlerini birlesztirerek
        //bir sinif listesi olusturun
        List<String>sinifIsimSoyisimList=new ArrayList<>();

        for (String each:tumValueColl
             ) {
            eachArr=each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);


        }
        System.out.println(sinifIsimSoyisimList);




    }
}
