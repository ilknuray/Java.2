package day36_InheritenceDataKullanimi;

public class EYanhizmetliler extends BMuhasebe {
    protected int saatUcreti=9;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Yan hizmetliler : " +(30*saatUcreti*gunlukMesai));


    }
    protected void issizlikSigorta(){
        System.out.println("Yan hizmetliler %30 indirimli issizlik sigortasi yaptirabilir");
        /*
        overriding child classtaki bir methodun parent
         classtaki ayni isimdeki methodu
        methodu etkisiz hale getireek kendisinin spesifik
        ozelligini ortaya cikarmasidir
        overridingi nerede dikkatae aliyoruz

        bir obje olusturuken data turu ve obje
        farkli ise
         */
        BMuhasebe yh1=new EYanhizmetliler();
        System.out.println(yh1.gunlukMesai);//M
        System.out.println(yh1.saatUcreti);//M
        yh1.maas();//YH
        yh1.ozelSigort();//M
        yh1.sigorta();//P
        System.out.println(yh1.isim);//P
        System.out.println(yh1.soyIsim);//P
        System.out.println(yh1.departmant);//P
        //aramaya muhasebeden basladigimizdan issizlik sigortasi bulamadikve
        //CTE VERDI.
    }

}
