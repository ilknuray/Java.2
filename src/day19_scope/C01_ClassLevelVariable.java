package day19_scope;

public class C01_ClassLevelVariable {
    /*
    class icerisinde heryerde kullanmak istediginiz variable lari
    class level da(classin icinde  ama methodlarin disinda)
    genellikle class level variablelar classin basinda olusturulur(sart degil)

    class levellardaki variable lar icin iki scope vardir

    1-static variable(class variablelari da denir
    2-instance(static olmayan)variables(obtect variable i da denir)
     */


    int instSayi=10;//static olmayip class levelda oldugu icin instance variabledir

    public static void main(String[] args) {
        //instance variables static olmadigi icin static olan main methodta direk kullanamayiz
        //instance variablelarin diger adi object variabledir
        //egere object olusturursak heryerden  kullanabiliriz
        int sayi=10;
        C01_ClassLevelVariable obje1=new C01_ClassLevelVariable();
        System.out.println(obje1.instSayi);//20
        obje1.instSayi=30;
        System.out.println(obje1.instSayi);//30

        C01_ClassLevelVariable obje2=new C01_ClassLevelVariable();
        System.out.println(obje2.instSayi);
        obje2.instSayi=25;
        System.out.println(obje2.instSayi);//25
        //her obje olusturuldugunda instance (obje) variable nin ilk atanan degerini alir

    }
    public static void staticMethod(){
        //System.out.println(sayi);
        /*bir methodun icerisinde olustururlan variable
        sadece o methodun icinde kullanilabilir
        (local variables)

         */
       // instSayi=30;instance variablelara main method disindaki diger static methodlardan da ulasilamaz
        //obje olusturarak ulasabiliriz

        C01_ClassLevelVariable obje4=new C01_ClassLevelVariable();
        System.out.println(obje4.instSayi);
    }

    public void staticOlmayanMethod(){
        System.out.println(instSayi);
//instance variable lar class icerisindeki static olmayan methodlardan direk ulasilabilir
        /*
        instance variablel  r class level da olusturulmalidir
        static degillerdir
        static methodlardan ulasmak icin obje yardimi ile ulasabiliriz
        static olmayanlardan direk ulasabilirim

         */

    }
}
