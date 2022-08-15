package day34_Inheritance;

public class ToyotaCorolla extends Toyota{
    public static void main(String[] args) {
        /*
        child classtan parent classa erisimde access modifier kurallarini
        bypass edemeyiz
        ornegin parent classteki privite class uyelerini
         child classtan kullanamayiz
         ayni sekilde parent ve child farkli package larda iseler
         parent classtaki default access modifier i olan class
         uyelerini child classtan kullanamayiz
         */
        ToyotaCorolla arb1=new ToyotaCorolla();
        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.model);//model belirtilmedi



    }
}
