package day43_Interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {
    void motor();
    public void yakit();
    public abstract String aku();
    /*
    normal bir classda oldugumuzu dusunsek iki tane access modifier
    kullanma ihtimali olamaz
    asagidaki method da goreceginiz gibi interface de istisnai olarak body si
    olan methodlar olusturulabilir
     bu ozellik java8 den sonra kullanilmaya baslamistir bu ozellikten once bir interface e yeni bir method eklememiz
     gerektiginde eskiden beri bu interface i implement eden tum classlara gidip
     yeni eklenen methodu override etmemiz gerekirdi

     bu ozellik sayesinde basina static veya defazult keyword ekleyerek
     interface de yeni ve bodysi olan bir method olusturursak bu methodun
     child classlar tarafindan override edilme mecburiyeti olmaz.
     ve eskiden implement etmis classlari degistirmemiz gerekmez ve interface
     icin olusturulan genel kurallari bozmaz

     bu methodlarin bodysi olsada bunlara concrete denmez ama override edilme
     mecburiyetleri yoktur

     buradaki default kelimesi access modifier degil istisnai durumun belirtilmesi
     icindir

     o zaman nicin 2 keyword (static ve default) tanimlanmistir?
     bu iki farkli kelimenin amaci child classlardan bu methodlara nasil
     ulasilacagini belirlemek icindir
     static keyword kullanilirsa child classtan bu methoda erismek icin
     interfaceadi.methodadi yeterli olur

     default keyword kullanilirsa methoda erismek icin obje olusturulmalidir
     */

    public default void teker(){
        System.out.println("default...Tum arabalarin tekeri vardir");

    }
    public static void direksiyon(){
        System.out.println("static...Tum arabalarin direksiyonu vardir");
    }

}
