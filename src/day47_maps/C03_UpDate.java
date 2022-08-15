package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_UpDate {
    public static void main(String[] args) {
        /*
        map.contains(key)==> verdigimiz key in map de olup olmadigini
        boolean olarka doner

        map.contains(value)==>bir butun olarak valuenin map te olup olmadigini doner

        ONEMLI NOT:map.contains(value)valuenin icindeki br parcayi bulmada ise yaramaz
        eger value icindeki ir parcayi aratmak istiyorsak map uzerinde manipulation
        yapmamiz lazim

        map.get(key)==>verilen key e ait degeri dondurur.


         */
        Map<Integer,String> sinifListesiMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListesiMap);


        System.out.println(sinifListesiMap.containsKey(104));//true
        System.out.println(sinifListesiMap.containsKey(114));//false

        System.out.println(sinifListesiMap.containsValue("Ali, Can, JDev"));

        System.out.println(sinifListesiMap.containsValue("JDev"));//false

        //verilen mapte jdev degerlerini javadeveloper olarak degistirelim
        //maplerde replace tum value i degistirmek istersk kullanilabilir
        //kismi degisikliklerde kullanamayiz


        ReusableMethods.tumValueSiraliYazdir(sinifListesiMap);
        Collection<String>valueCollection=sinifListesiMap.values();
        for (String each:valueCollection
             ) {
            each=each.replace("JDev","JavaDeveloper");
            //map te guncelleme yapmak icin key yenu degeri map e eklemeliyiz
            /*
            ornegin key 101 icin value ali can jdev
            guncelleme icin sinifListesiMap.put( ali can jdev)

            bunu yapabilmek ici herbir key e ve ona ait value a ihtiyacim var

             */
            String eachValue;
            Set<Integer> keySeti=sinifListesiMap.keySet();
            for (Integer each1:keySeti) {
                eachValue=sinifListesiMap.get(each1);
                eachValue=eachValue.replace("JDev","JavaDeveloper");
                sinifListesiMap.put(each1,eachValue);
                /*
                biz keylerin tamamoni aldik herbir jkey in value sini aldik
                get irdik value uzerinde degisikligi yapip yeni hallerini
                put(key,yenideger)ile map e koyduk
                 */

            }
            System.out.println(sinifListesiMap);



        }

    }}

