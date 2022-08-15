package day36_InheritenceDataKullanimi;

public class CMemur extends BMuhasebe{
    protected int saatUcreti=12;
    protected int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar : "+ (30*saatUcreti*gunlukMesai) + "maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("Memurlara %60 indirimli sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);
        System.out.println(mmr1.saatUcreti);
        mmr1.maas();
        mmr1.ozelSigorta();
        mmr1.sigorta();
        System.out.println(mmr1.isim);
        System.out.println(mmr1.soyIsim);
        System.out.println(mmr1.departmant);

        BMuhasebe mhsb=new BMuhasebe();
        /*
        her ne kadar memur classinda olsamda olusturdugum obje Muhasebe classin dan cunku
        data turu ve constructor BMuhasebe

        String str="murat";
        BMuhasebe classi obje olusturulabilen bir classtir yani data turudur
        obje olusturdugumuz her class aslinda bir data turudur
         */


        System.out.println(mhsb.gunlukMesai);
        System.out.println(mhsb.saatUcreti);
        mhsb.maas();
        mhsb.ozelSigort();
        mhsb.sigorta();
        System.out.println(mhsb.isim);
        System.out.println(mhsb.soyIsim);
        System.out.println(mhsb.departmant);
    }
}
