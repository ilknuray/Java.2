package day35_InheritanceConstructorKullanimi;

public class LOgretmen {
    LOgretmen(){
        System.out.println("OGRETMEN parametresiz constructor");
    }
   LOgretmen(String isim){
        this();
        System.out.println("Ogretmen parapetreli constructror");
    }
}
