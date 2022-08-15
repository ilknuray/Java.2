package day19_scope;

public class C03_ClassVariables {
    public static void main(String[] args) {
       //farkli bir classta calisirken herhangibir class adini yazip noktaya basarsak adini
        // yazdigimiz classtaki tum statik class uyelerini gorup kullanabiliriz


        C02_StaticVariables.staticMethod();//once bu methoda gider ve orada
        //static sayinin
        // degeri icin taa ilk atanan sayiya gider onu yazdirir//10

        System.out.println(C02_StaticVariables.staticSayi);//10

        System.out.println(C02_StaticVariables.dgersizStaticVar);//0
        //class level variablelara deger atayip atamamak bize kalmostir eger deger atamossak java kabul eder
        //deger atamazsak java bu variablelara default deger atar
        //int =0 string=null
        //char='' boolean=false


        /*
        baska classtaki variablelara obje olusturarak ulasabiliriz
         */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//10
        System.out.println(obje1.isim);//mehmet
        System.out.println(obje1.degersizInstanceVar);//0
        System.out.println(C02_StaticVariables.staticSayi);//20
        /*
        farkli bir classtan c02 classindan method ve variablelari kullandigimda C02 classinin
        tamami degil sadece benim cagirdigim class uyeleri calisir
         */

    }
}
