package day19_scope;

public class C02_StaticVariables {


    static int staticSayi=10;
    String isim="mehmet";

    static int dgersizStaticVar;
    int degersizInstanceVar;
    //class levellardaki variable lara deger atamasakta java kabul eder

    public static void main(String[] args) {
        /*
        bir variable static olusturulduysa objeler icin degil class icin
        gecerlidir
         */
        System.out.println(staticSayi);//10
        staticMethod();
        staticSayi=12;
        System.out.println(staticSayi);//12

C02_StaticVariables obje1=new C02_StaticVariables();
obje1.staticOlmayanMethod();
        System.out.println(staticSayi);//20

    }
    public static void staticMethod(){
        System.out.println(staticSayi);//10
    }
    public void staticOlmayanMethod(){
        /*
        static variable lara class icerisinde heryerden ulasilabilir
        static olsun veya olmasin tum methodlar static variablelari gorebilir ve degistirebilir
        farkli methodlarda static variable in hangi degeri alacagini bilmek istiyorsak
        classin basindan itibaren takip etmaliyiz
        method ne zaman cagirilirsa o anki static variable degerini methodda kullanabiliriz
         */
        System.out.println(staticSayi);//12
        staticSayi=20;
        /*
        instance bir variablein degerini bulmak icin objenin olusturulmasindan itibaren
        istenen satira kadar kodu takip etmeliyiz

        static variable da ise clasin en basindan baslayarak istene satira kadar kodu takip edip
        static variable in son degerini bulmamiz gerekir
         */


    }

}
