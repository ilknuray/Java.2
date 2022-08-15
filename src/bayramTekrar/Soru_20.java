package bayramTekrar;

import java.util.Scanner;

public class Soru_20 {
    public static void main(String[] args) {
    /*    * Problem tanimi :
     *
     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
                *
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
                * indirim yapin

               */
        Scanner scan=new Scanner(System.in);
        System.out.println("kac adet urun aldiniz" );
        int urunAdet= scan.nextInt();
        System.out.println("urun liste fiyatini giriniz");
        int urunListe= scan.nextInt();
        int odenecekMiktar1=(urunListe-urunListe*(15/100))*urunAdet;
        int odenecekMiktar2=(urunListe-urunListe*(20/100))*urunAdet;
        int odnecekMiktar3=(urunListe-urunListe*(10/100))*urunAdet;

        if(urunAdet>10){
            System.out.println("magaza kartiniz oldugu icin :" +odenecekMiktar2);
        }else if(urunAdet<10){
            System.out.println("10urunden az aldiginiz icin : "+odnecekMiktar3);

        }else {
        System.out.println("magaza kartiniz olmadigi icin : " +odenecekMiktar1);


        }
    }
}
