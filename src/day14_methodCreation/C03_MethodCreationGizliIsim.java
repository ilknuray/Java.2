package day14_methodCreation;

public class C03_MethodCreationGizliIsim {
    public static void main(String[] args) {

        //input olarak verilen isim ve soyisminizi ilk harfi buyuk geriye kalanlar
        //* olacak seklinde yazdiran bir method olusturun

        String isim="Enes";
        String soyIsim="Bozkurt";

        isimGizle(isim,soyIsim);
        C02_MethodCreation.rakamlariTopla(236);



    }

    public static void isimGizle(String isim, String soyIsim) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");

        System.out.println( "isim : " + isim +"\nsoyisim : "+ soyIsim);


    }
}
