package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        System.out.println(l);

        buyukHarfleYazdir(l);
        System.out.println();
        // buyukHarfleYazdir02(l);
        uzunlugaGoreYazdir(l);
        System.out.println();
        tersSiralayipYazdir(l);
        System.out.println();
        sonKaraktereGoreTekrarsizSirala(l);
        System.out.println();
        uzunlukVeIlkharfeGoreYazdir(l);
        System.out.println();
        //uzunluguBestenBuyukOLaniSil(l);
      //  baslangiciAYadaSonuNolaniSil(l);
        uzunlugu8ile10arasiVeOileBiteniSil(l);
        System.out.println(uzunlugu12denAzMi(l));
        System.out.println(xIleBaslamiyorMu(l));
    }

    //1) Tüm elemanları büyük harf
    // ile yazdıran bir method oluşturun
    //1)1.yol
    public static void buyukHarfleYazdir(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    /* //2.yol
     public static void buyukHarfleYazdir02(List<String> list){
         list.replaceAll(String::toUpperCase);
         System.out.println(list);
     }
     */
    //2) Elemanları uzunluklarına göre
    // sıralayıp yazdıran bir method oluşturun
    public static void uzunlugaGoreYazdir(List<String> list) {

        list.stream().
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
        //
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp
    // yazdıran bir method oluşturun.
    public static void tersSiralayipYazdir(List<String> list) {
        list.stream().
                sorted(Comparator.comparing(String::length).
                        reversed()).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız
    // yazdıran bir method oluşturun.
    public static void sonKaraktereGoreTekrarsizSirala(List<String> list){
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);

        //liste ekleme sirasini da baza aldi java
    }
//5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp
// yazdıran bir method oluşturun.
    public static void uzunlukVeIlkharfeGoreYazdir(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
   /* //6) Uzunluğu 5'ten büyük olan elemanları
    // silen bir method oluşturun.
    public static void uzunluguBestenBuyukOLaniSil(List<String> list){

        list.removeIf(t->t.length()>5);
        System.out.println(list);
    }
    ==>list,mutable oldugu icin elemanlari islem sonrasi kalici degistiginden
    comment-out yapiyorum
    */
    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile
    // biten elemanları silen bir method oluşturun

   /* public static void baslangiciAYadaSonuNolaniSil(List<String> list){

        list.removeIf(t->t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n');
        System.out.println(list);
    }
    //2.yol
    public sta
    tic void baslangiciAYadaSonuNolaniSil02(List<String> list){
        list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
        System.out.println(list);
    }*/

    //8)uzunlugu 8 ile 10 arasi olan yada 'o' ile biten elemanlari silen bir method olusturun

    public static void uzunlugu8ile10arasiVeOileBiteniSil(List<String> list){

        list.removeIf(t->(t.length()>7 && t.length()<11) || t.endsWith("o"));
        System.out.println(list);
    }
    //tum elemanlarin uzunluklarinin 12 den az olup olmadigini kontrol eden bir method olusturun
    public static boolean uzunlugu12denAzMi(List<String>list){
        return list.stream().allMatch(t->t.length()<12);
    }
    //Hicbir elemanin 'X' ile baslamadigini kontrol eden bir method olusturun
    public static boolean xIleBaslamiyorMu(List<String>list){
        return list.stream().noneMatch(t->t.startsWith("X"));
    }
    //11)herhangi bir elemanin 'r' ile bitip bitmedigini kontrol eden method
    
    public static boolean rIleBitenVarMi(List<String>list){
     return    list.stream().anyMatch(t->t.endsWith("r"));
    }

}
