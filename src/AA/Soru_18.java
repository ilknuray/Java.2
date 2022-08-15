package AA;

import java.lang.reflect.Array;
import java.util.*;

public class Soru_18 {
    public static void main(String[] args) {
          /*
        Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        100 girildiğinde veri girişi sonlandırılsın. Bu değerleri girdikten sonra,
         günün en sıcak ve soğuk değerlerini ekrana yazdırınız.
          (Eğer bu değerleri birisi bilgisayara kaydedecek olsaydı zaten bir bakışta en yüksek ve
          en soğuk değerleri görürdü ve bu program gereksiz olurdu. Fakat elektrikli termometre bir
           bilgisayara bağlı olabilir. Veya geçmiş yıllarda veri kütüklerine kaydedilen kayıtları analiz
            ediyor olabiliriz. Bu durumda program kullanımı daha mantıklı olur).

         */
        List<Integer>liste=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        int sicaklik=0;
        while (sicaklik!=100){
            System.out.println("lutfen sicaklik degerini giriniz");
            sicaklik=scan.nextInt();
            liste.add(sicaklik);
        }
        Collections.sort(liste);
        System.out.println("En buyuk sicaklik : " +liste.get(liste.size()-1));
        System.out.println("En dusuk sicaklik : " +liste.get(0));
    }
}
