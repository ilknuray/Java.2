package day35_InheritanceConstructorKullanimi;

public class FMemur extends Emuhasebe {
    /*
    extends keyword kullanilan classlarda ister default cons bulunsun
    istersekte biz yeni coslar olusturalim java consun ilk satirina super constructor call
    yazar super constructor call default cons a benzer
    gorunmesede orada vardir ve calisir ancak biz ilk satira farkli bir cons call yazarsak
    java super cons u siler
     */
    FMemur(){
        System.out.println("Memur parametresiz constructor");

    }
    FMemur(String isim){
        System.out.println("Memur parametreli constructor");
    }

    public static void main(String[] args) {
        FMemur mmr1=new FMemur();

    }
}
