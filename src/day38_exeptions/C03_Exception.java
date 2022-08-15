package day38_exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {
    public static void main(String[] args) {
        /*
        marketteki tum urunleri bir arrayde
        tuttugumuzu varsayalim
        kullaniciya index sorup o indexteki urunu yazdiran bir program
        hazirlayalim
        kullanici urun sayisindan buyuk bir index girrese exception vermesinin
        onune gecelim
         */

        String [] urunler={"Nutella","Cokokrem","Sut","Cay","Findik"};


        System.out.println("Istediginiz urunun sira nosunu giriniz");
        int istenenIndex=0;
        boolean kontrol=true;
        while (kontrol){
        try {
            Scanner scan=new Scanner(System.in);
             istenenIndex= scan.nextInt();
             kontrol=false;

        } catch (InputMismatchException deneme) {
            System.out.println("Urun indexi icin bir tam sayi girmeiz gerekli");

            /*
            catch blogunun onundeki parantezde exception classinin
            ismi ve yanin da da yakalanan exception i atadigimiz
            variablein ismi olur (e)

            Eger yakalanan exception ile ilgili bilgileri kullaniciya
            vermek istersiniz bu objeyi kullanabilirsiniz
            EGER exception ile ilgili kullaniciya bilgi verme
             ihtiyaci yoksa e kullanilmasada olur
             */
        }
        }
        try {
            System.out.println("Aradiginiz urun : " + urunler[istenenIndex-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                    "\nsira numarasi en fazla : " +urunler.length + "olabilir");

        }


    }
}
