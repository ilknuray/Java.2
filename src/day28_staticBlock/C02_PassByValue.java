package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati=100;
        System.out.println(indirimliFiyat(satisFiyati));
        System.out.println(satisFiyati);
        System.out.println(indirimliFiyat(satisFiyati));

    }
    public static double indirimliFiyat(double orjinalFiyat) {
        //method %50 indirim yapip yeni fiyati main methoda dondursun
        double satisFiyati=orjinalFiyat*0.9;

        return orjinalFiyat;
    }
}
