package day43_Interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterators {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);//[10,20,30]
        //listedeki tum elementleri index kullanmadan 3 artirin
        for (int each : liste) {
            each += 3;
            System.out.print(each + " ");

        }
        System.out.println("");
        System.out.println(liste);

        /*
        java index yapisi olmayan collectionlardaki elementlere ulasmak veya
        degistirmek icin iterator interface ini olusturmustur.

         */
        System.out.println(liste);//10 20 30
        Iterator it1 = liste.iterator();
        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
        //***bir kere daha yapamam cunku element  kalmadi rte verir
        //iterator da geri donus yok adima adim sona ulastiktan sonra basa gelmek
        //isterseniz yeniden bir iterator olusturmamiz gerekir
        //obje olustururken bazan new kullaniriz bazen de uygun bir method kullaniriz
        /*iterator interface old icin ondn obje uretmemiz
        mumkun degildirBUNUN yerine bize iterator donduren liste.iterator()
        methodunu kullaniyoruz
        */
        Iterator it2 = liste.iterator();
        //bunu kullanrark it1 in elementlerini silelim
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste);//iterator ile elementleri gezip remove yapinnca liste tamamen degisti.

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste : " + liste);
        Iterator it3 = liste.iterator();

        while (it3.hasNext()) {
            it3.next();
            it3.remove();
        }
        System.out.println("looptan sonra liste : " + liste);
        /*
        goruldugu gibi iterator kullanarak yapabildigim
        1-tum collection elementlerini yazdirmak
        2-tum collection elementlerini silmek
        bu da bize yetmez
         */


    }
}
