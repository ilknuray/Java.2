package day36_InheritenceDataKullanimi;

public class DIsci extends BMuhasebe {
    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Isciler : "+ (30*saatUcreti*gunlukMesai) + "maas alir");
    }
    protected void ozelSigortaIsci(){
        System.out.println("Iscilere %70 indirimli sigorta yaptirabilir");


    }

    public static void main(String[] args) {
        BMuhasebe  isc1=new DIsci();//isci olusturuyoruz
        System.out.println(isc1.gunlukMesai);//muhasebe
        System.out.println(isc1.saatUcreti);//muhasebe
        isc1.maas();//M
        isc1.ozelSigort();//M
        isc1.sigorta();//Personel
        System.out.println(isc1.isim);//P
        System.out.println(isc1.soyIsim);//P
        System.out.println(isc1.departmant);//Personel
        /*
        bir obje olusturuken data turu ve costructor ayni classtan ise direk
        o classa gidiyorduk varsa var yoksa parenta gidiyorduk

        eger data turu ve cons farkli ise obje constructorin oldugu classin objesidir
        ancak bizden istenen isci classin daki spesifik ozellikler degil
        bir iscinin muhasebe classindaki tum calisanlarla beraber sahip oldugu genel
        ozellikleri yazdirir

         */
        APersone isc2=new DIsci();

       // System.out.println(isc2.gunlukMesai);
       // System.out.println(isc2.saatUcreti);
        isc2.maas();
        //isc2.ozelSigorta();
        isc2.sigorta();
        System.out.println(isc2.isim);
        System.out.println(isc2.soyIsim);
        System.out.println(isc2.departmant);

        /*
        eger data turu olan classta aradigimiz ozellik yoksa varsa onun parent ina
        gidilebilir
        ama childa donus olmaz aradigi ozelligi bulamazsa CTE verir.
         */

    }
}
