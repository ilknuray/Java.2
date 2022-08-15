package day12_StringManipulation;

public class C03_substringSifre {
    public static void main(String[] args) {
        String isim="Suleyman";
        String soyIsim="Karanfil";
        String kartNo="1234 6589 7458 9658";
        System.out.println(isim.substring(3));//eyman
        System.out.println(soyIsim.substring(soyIsim.length()-3));//fil

        System.out.println(isim.substring(2,4));//le

        //isim ve soy ismin ilk harfi buyuk harf geriye kalan *
        //kredi kartinin ilk 4 rakami gorunsun geriye kalan * olsun


            String  ilkHarf=isim.substring(0,1).toUpperCase();
            String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");

            String soyIsimIlkHarf=isim.substring(0,1).toUpperCase();
            String soyIsimGeriyeKalanlar=soyIsim.substring(1).replaceAll("\\w","*");

            String kkIlkDort=kartNo.substring(0,4);
            String kkGeriyeKalanlar=" **** **** ****";

        System.out.println(ilkHarf +isimGeriyeKalanlar +" " +soyIsimIlkHarf +soyIsimGeriyeKalanlar + " "+
                "\n"+kkIlkDort
                +kkGeriyeKalanlar);



    }
}
