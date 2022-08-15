package day35_InheritanceConstructorKullanimi;

public class Emuhasebe extends Dpersonel{
    Emuhasebe(){
        System.out.println(" muhasebe parametresiz costructor");
    }
    Emuhasebe(String isim){
        System.out.println("muhasebe parametreli constructor");
    }
}
