package day41_abstractClass_Interface;

import java.util.*;

public class HA160 extends FMercedes {
    public static void main(String[] args) {



    /*
    abstract parent silsilesinden gelen ilk concrete class parent i
    olan tum classlardaki abstract methodlari concrete hale donusturmek
    yani override etmek zorundadir

    bu kuralin istisnasi parent classlardan herhangi birinde cocrete
    hale donusturulmus abstract methodlardir


     */
        HA160 arb1 = new HA160();
        //concrete bir classtn istedigimiz objeyi uretebiliriz

        FMercedes arb2 = new FMercedes();
        //mercedesde concrete

        // EToyota arb3=new EToyota() ;
        EToyota arb4 = new GCorolla();

        //abstract classlar constructur barindirir ama obje uretemezler
        //toyota classi abstract class oldugundan obje uretilemez

  /*
    List<String> list1=new List<String>() ;
    List<String>list2=new ArrayList<>();

    abstract bir classin ozelliklerini tasiyan bir obje
    olusturmak istedigimizde data turunu istedigimiz abstract class
    constructor i ise child i olan
    bir classdan seceriz.
     */
    }


}
