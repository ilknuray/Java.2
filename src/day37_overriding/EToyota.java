package day37_overriding;

public class EToyota extends Daraba{
   void marka(){
       System.out.println("Markamiz toyota");
       /*
       eger hem overridden hemde overriding methodun calismasini istersek
        ilk satira super().marka yazmaliyiz
        */
   }
   void motor(){
       System.out.println("Toyota araclar toyota marka motor kullanir");
   }
}
