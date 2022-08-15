package day35_InheritanceConstructorKullanimi;

public class GToyota {
    GToyota(){
        System.out.println("Toyota parametresiz constructor");

    }
    GToyota(String isim){
        //super yapamam cunku extens keyword yok

        System.out.println("toyota parametreli constructor");
    }
}
