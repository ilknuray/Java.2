package day35_InheritanceConstructorKullanimi;

public class AGrandParent {
    protected String isim="Grandpa ismi belirtilmedi";

    /*
    her classta gorunmese bile bir constructor vardir
    bu classtan obje olusturmak istedigimizde default constructor
    devreye gireciktir

    default constructori gozlemleyecegimiz icin onun yerine kullanilabilecek
    constructor olusturalim
     */
    protected String grandpaKulupAdi="Grandpa klubu";

    AGrandParent(){
        System.out.println("grandpa costructor calisti");
    }
}
