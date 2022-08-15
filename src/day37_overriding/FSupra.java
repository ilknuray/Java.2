package day37_overriding;

public class FSupra extends EToyota {
     {
        System.out.println("Supra benzin kullanir");
    }

    @Override
   void motor(){
        System.out.println("supra benzin kullanir");
        /*
        @override notasyonu javaya bir gorev verir
       java bu notasyonla birbirine bagli olan iki methodu surekli
       kontrol eder
       eger parent classtaki overridden methodu silerseniz CTE verir.

       overide notastonu kullanmak zorunlu degildir
       eger overriding method silinirse kodun cte vermesini istersek
       override notasyonu kullanmaliyiz
         */
    }

    @Override
    void yakit() {

    }
}
