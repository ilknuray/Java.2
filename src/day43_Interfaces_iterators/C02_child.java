package day43_Interfaces_iterators;

public class C02_child implements I01_InterfaceBodyOlanMethod {
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }

    /*
    parent interface de abstract olan uc methodu implement ettigimizde
    java itirazini durdurur sonradan ekledigimiz default veya static keyword ile
    tanimladigimiz methodlari implement etmememiz sorun olusturmaz.
     */
    public static void main(String[] args) {

        I01_InterfaceBodyOlanMethod.direksiyon();

        C02_child obj=new C02_child();
        obj.teker();
    }
}