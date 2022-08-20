package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1)t-> "logic" , (t,u)->t "logic"
    bu yapiya "Lambda expession" denir.

    2)Functional_programming kapsaminda labdanexpession kullanilabilir
    ama onerilmez.bunu yerine "Method Reference" tercih edilir.

    3)Method Reference kullanimi "Class Name :: Method Name"

    Ayni zamanda kendi classlarinizi da kullanabilirsiniz.
    ornegin bir Animal classi var ve bu classin bir methodu var
    "eat()"methoduna sahip ==>"Animal ::eat"
     */
    public static void main(String[] args) {


        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        System.out.println(l);
        listElemanlariniYazdirStructered(l);
        System.out.println();
        ciftElemanlariYazdirFunctional(l);
        System.out.println();
        tekElemanlarinKareleriniYaz(l);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdi(l);
        System.out.println();
        tekrarsizCiftElemanlarinKuplerininCarpimi(l);
        System.out.println();
        getMaxEleman(l);
        System.out.println();
        yedidenBuyukEnBuyukCiftMin3(l);
        System.out.println();
        tersSiralamaylaTekrarsizElemanlarinYarisi(l);


    }

    //  1)ardisik list elementlerini ayni satirda aralarinda bosluk birakarak
    //  yazdiran bir method olusturun(structured)
    public static void listElemanlariniYazdirStructered(List<Integer> list) {
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //2)Ardasik cift list elementlerini ayni satirda aralarinda bosluk
    //birakarak yazdiran bir method olusturun(functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //3)ardisik tek list elemanlarinin karelerini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun
    public static void tekElemanlarinKareleriniYaz(List<Integer> list) {
        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4)ardisik tek list elemanlarinin kuplerini tekrarsiz olarak aralarinda boslukla yazdirin
    public static void tekrarsizTekElemanlarinKupunuYazdi(List<Integer> list) {
        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //5)tekrarsiz cift elemanlarin karelerinin toplamini hesaplayan bir method olusturun

    public static void tekrasizCiftElemanlarinKareleriToplami(List<Integer> list) {

        Integer cift = list.stream().distinct().filter(Utils::ciftAl).map(Utils::karesiniAl).reduce(Math::addExact).get();
    }

    //6)tekrarsiz cift elemanlarin kupunun carpimini hesaplayan bir method olusturun
    public static void tekrarsizCiftElemanlarinKuplerininCarpimi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(Utils::ciftAl).map(Utils::kupAl).reduce(1, Math::multiplyExact);
        System.out.println(carpim);
    }
    //7)List elemanlari arasindan en buyuk degeri bulan bir method olusturun

    public static void getMaxEleman(List<Integer> list) {

        Integer max = list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }
    //8)list elemanlari arasindan en kucuk degeri bulan bir method olusturun


    //9)list elemanlari arasindan 7 den buyuk cift,en kucuk degeri bulan bir
    public static void yedidenBuyukEnBuyukCiftMin3(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t > 7).filter(Utils::ciftElemanlariSec).reduce(Math::min).get();
        System.out.println(min);

    }

    //10)Ters siralama ile tekrarsiz ve 5'ten buyuk elemanlarin yari degerlerini
    public static void tersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list) {
        List<Double> sonuc = list.stream().distinct().filter(t -> t > 5).
                map(Utils::yarisiniAl).sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(sonuc);
    }
}
