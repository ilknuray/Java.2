package day34_Inheritance;

public class Isci extends Personel {
    /*
    normal hayatimizda parent cocuk sahibi olmaya karar verir
    javada ise child classlar ozelliklerii inherit etmek icin
    istedikleri classi kendilerine parent edinirler


    mesela isci  classi ni olusturunca nelere ihtiyaci oldugunu
    dusunursek personel classindaki tum variable ve methodlara ihtiyaci
    oldugunu gorebiliriz
    bu durumda yeniden o variable ve methodlari olusturmak yerine personel
    classini kendimize parent ediniriz

    bir classi parent edinmek icin extends keyword kullaniir

    bir class baska bir classi parent edindiginde
    1-parent classtaki tum ozelliklere otomatik olarak sahip olur
    2-parent classtaki ozelliklerin bazilarini kendine uyarlayabilir
    3-parent classta olmayan bazi yeni ozellikler olusturabilir

    NOT:parent classtaki ozelliklerden hic birini reddedemez ama degistirebilir
     */
    int personelNo=1001;
    public static void main(String[] args) {
        Isci isci1=new Isci();
        System.out.println(isci1.isim);//isim belirtilmedi
        //kendi classinda isim variable i yok parentsa gider
        isci1.isim="selim";
        System.out.println(isci1.personelNo);//1001 yazar cunku kendi classindda varsa onu kullanir
        isci1.maas();//tum personelin maasi var
    }
    public void maas(){
        System.out.println("isciler gunluk 15€ saat ucreti alir");
    }
}
