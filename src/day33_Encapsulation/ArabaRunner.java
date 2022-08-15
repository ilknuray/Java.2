package day33_Encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka variable ina
        // ulasabildim,degistirebildim(yazma/set) ve yazdirabildim(okuma/get)
        arb1.marka="toyota";
        System.out.println(arb1.marka);
        //access modifier kullanarak marka variable ina ulasimi tamamen
        // serbestlestirebilir veya tamamen engelleyebilirim
        //privite yaptigimiz modele ise hic ulasamayiz
        //yani access modifier ya hep ya hic diyor

        //mODELi degistirelim ama goremeyelim
        //yakiti gorelim ama degistiremeyelim
        //set ve get yetkilerini ozel olarak tanimlamak isterseniz
        /*
        1.adim  ozel yeki tanimlayacaginiz variablelari privite yapiniz
                 privite bir data ya baska classlardan ulasmak mumkun olmadigi icin
        2.adim  set yetkisi icin setter get yekisi icin getter methodu kullanmamiz gereklidir

         */
        arb1.setModel("supra");//model olarak supra
        //modeli yazdirma imkani yok cunku getter atamadik
        System.out.println(arb1.getYakit());//yakit olarak elekrikli bilgisini yazdirabildik
        //yakiti degistiremeyiz cunku setter methodu yok

    }
}
