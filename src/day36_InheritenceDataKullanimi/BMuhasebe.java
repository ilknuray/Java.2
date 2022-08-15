package day36_InheritenceDataKullanimi;

public class BMuhasebe extends APersone{

    protected  int saatUcreti=10;
    protected int gunlukMesai=8;


    protected void maas(){
        System.out.println("Personel minimum : " + (30*gunlukMesai*saatUcreti) + " maas alir");
    }
    protected void ozelSigort(){
        System.out.println("Isteyen calisanlar %50 indirimli ozel sigorta yapilir");

    }
}
