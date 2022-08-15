package bayramTekrar;

import java.util.Scanner;

public class Soru_9 {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


        Scanner scan=new Scanner(System.in);
        System.out.println("dik ucgenin iki dik kenarinin uzunlugunu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

       double hipotenus=Math.sqrt(kenar1*kenar1+kenar2*kenar2);
        System.out.println(hipotenus);



    }
}
