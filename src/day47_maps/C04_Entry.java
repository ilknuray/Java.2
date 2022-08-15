package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        Map<Integer,String>sinifListMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);
        //herbir elementi altalta yazdirin
        Set<Map.Entry<Integer,String>>sinifEntrySet=sinifListMap.entrySet();
        for (Map.Entry <Integer,String> each:sinifEntrySet
             ) {
            System.out.println(each);


        }
        //Map icerisindeki tester kurs ismini QA olarak degistirelim
        String eachValue;

        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
           eachValue=each.getValue();
           eachValue=eachValue.replace("QA","Tester");
           each.setValue(eachValue);

        }
        System.out.println(sinifListMap);
                /*
                java entry <k,v>mapin icerisinde bulunan herbir kaydi k=v seklinde
                tutar
                dolayisiyla herhangi bir entry e ulastitigimizda hem key e hem de value ya
                ulasabilir ve istedigimiz islemleri yapabiliriz

                entry.getKey()bize key i getirir
                entry.getValue()bize value yu getirir

                 */
    }
}
