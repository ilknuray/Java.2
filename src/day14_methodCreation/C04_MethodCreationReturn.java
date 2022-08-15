package day14_methodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {

        //verilen isim ve soyismi ilk harfi buyuk geriye kalan harfler * olacak sekilde
        //I***** Y***** seklinde yazdiran bir method olusturun
        //Not:programin ilerleyen kisimlarinda methodu bu sekilde kullanmak istiyoruz

        String isim="Enes";
        String soyIsim="Bozkurt";

        String gizliIsim=isimGizle(isim,soyIsim);
        System.out.println(isim+" "+soyIsim);
        System.out.println(gizliIsim);

    }

    public static String isimGizle(String isim, String soyIsim) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");

        System.out.println( "isim : " + isim +"\nsoyisim : "+ soyIsim);

        return isim+" " +soyIsim;
    }
}
