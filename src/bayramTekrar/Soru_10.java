package bayramTekrar;

import java.util.Scanner;

public class Soru_10 {
    public static void main(String[] args) {
          /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gideceginiz mesafeyi giriniz");
        double mesafe= scan.nextDouble();
        System.out.println("lutfen hizinizi giriniz");
        double hiz= scan.nextDouble();


        double sure=0;
        sure=mesafe/hiz;
        System.out.println(sure);

    }
}
