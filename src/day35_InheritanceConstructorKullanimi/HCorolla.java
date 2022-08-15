package day35_InheritanceConstructorKullanimi;

public class HCorolla extends GToyota{
    HCorolla(){
        System.out.println("Corolla parametresiz constructor");
    }
    HCorolla(String isim){
        super(isim);
        System.out.println("Corolla parametreli constructor");
    }
}

