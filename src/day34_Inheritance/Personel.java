package day34_Inheritance;

public class Personel {
    /*
    eger parent class olacak sekilde tasarladiginiz bir class varsa veya
    ilerde bu classi parent yapmak isteyen olabilir
    diyorsaniz variable ve methodlarin access modifierini protected
    secmelisiniz
     */
    protected int persNo;
    protected String isim="isim belirtilmedi";
    protected String departman="departman belirtilmedi";

    protected  void maas(){
        System.out.println("tum personelin maasi vardir");

    }
    protected  void mesai (){
        System.out.println("tum personel statusune gore mesai yapar");

    }
    protected void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir");

    }
}

