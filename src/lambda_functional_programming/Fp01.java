package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {
        /*
        labmda fonctional programming java8 ile kullanilmaya baslanmistir
        2)Fp de ne yapilacagi uzerinde durulur(scructured programming)
        nasil yapilacak uzeine yogunlasir
        3)Fp arrays ve collections ile kullanilir
        4)Entryset() methodu ile map set e donusturulerek Fp de kullanilabilir


         */

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


        //  1)ardisik list elementlerini ayni satirda aralarinda bosluk birakarak
        //  yazdiran bir method olusturun(structured)

        listElemanlariniYazdirStructered(l);
        System.out.println();
        listElemanlariniYazdirFunctional(l);
        System.out.println();
        tekrarsizCiftElemanlarinKuplerininCarpimi(l);
        System.out.println();
        enBuyukDegeriBul(l);
        System.out.println();
        enBuyukDegeriBul2(l);
        System.out.println();
        getYedidenBuyukEnBuyukCiftMin(l);
        System.out.println();
        enKucukElemaniBul(l);
        System.out.println();
        getYedidenBuyukEnBuyukCiftMin2(l);
        System.out.println();
        getYedidenBuyukEnBuyukCiftMin3(l);
        System.out.println();
        getTersSiralamaylaTekrarsizElemanlarinYarisi(l);
        System.out.println();
        ciftListElemanlariniYazdirStructured(l);
        System.out.println();
        ciftElemanlariYazdirFunctional(l);
        System.out.println();
        tekElemanlariYazdir(l);

    }

    public static void listElemanlariniYazdirStructered(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");

        }

    }

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }
    //2)Ardasik cift list elemanlarini ayni satirda aralarinda
    // bosluk birakarak yazdiran bir method olusturun(Structured)
    public static void ciftListElemanlariniYazdirStructured(List<Integer> list){
        for (Integer w:list) {
            if(w%2==0){
                System.out.println(w+" ");
            }

        }
    }
    //2)cift sayi olan cift list elemanlarini ayni satirdz bosluk birakarak yazdiran method olusturn
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }
    //3)ardisik tek list elemanlarinin karesini aynisatirda aralarinda bosluk birakarak yazdiran method olusturun
    public static void tekElemanlariYazdir(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t -> System.out.print(t + " "));
    }
    //4)ardisik list elemanlarinin kuplerini tekrarsiz olarak aralarinda boslukla ayni satirda
    public static void tekrarsizTekElemanlarinKupunuYazdi(List<Integer> list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
    //5)tekrarsiz



    //6)tekrarsiz cift elemanlarin kupunun carpimini hesaplayan bir method
    public static void tekrarsizCiftElemanlarinKuplerininCarpimi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(carpim);
    }
    //7)list elemanlari arasindzn en buyuk degeri bulan bir method olusturun 1.yol
    public static void enBuyukDegeriBul(List<Integer> list){

        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t : u);
        System.out.println(max);


    }
    //2.Yol
    public static void enBuyukDegeriBul2(List<Integer> list){

        Integer max=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println(max);

    }
    //8)list elemanlari arasindan en kucuk degeri bulan bir mthod olusturun iki yol ile
    public static void enKucukElemaniBul(List<Integer> list){
        Integer enKucuk= list.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t<u ? t : u);
        System.out.println(enKucuk);

        System.out.println(list.stream().distinct().sorted().reduce(Integer.MAX_VALUE,(t,u)->t));
    }

    //9)list elemanlari arasindan 7 den buyuk cift en kucuk degeri bulan bir method olusturun
    //1.yol
    public static void getYedidenBuyukEnBuyukCiftMin(List<Integer> list){
       Integer min= list.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)->t<u ? t:u);
        System.out.println(min);
    }
    //10)2.yol
    public static void getYedidenBuyukEnBuyukCiftMin2(List<Integer> list){
        Integer min=list.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println(min);

    }
    //3.yol
    public static void getYedidenBuyukEnBuyukCiftMin3(List<Integer> list){
        Integer min=list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println(min);
    }
    //10)ters siralama tekrarsiz ve 5'ten buyuk elemanlarin yari degerlerini
    //elemanlarin ikiye bolum sonucunu bulan bir method olusturun

    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){

        List<Double>sonuc=list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);
    }

}
