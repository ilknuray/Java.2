package day36_InheritenceDataKullanimi;

public class APersone {
    protected String isim="isim belirtilmedi";
    protected String soyIsim="soyisim belirtilmedi";
    protected String departmant="departmant belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelimiz maas alir");
    }
    protected void sigorta(){
        System.out.println("Tum personelimiz sigorta yapilir");
    }
}
