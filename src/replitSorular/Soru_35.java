package replitSorular;

public class Soru_35 {
    public static void main(String[] args) {
        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

Array = [20, 30, 25, 35, -16, 60, -100 ]

Beklenen Çıktı:
Array Sayılarının ortalaması: 7.0
         */
        double []arr={20, 30, 25, 35, -16, 60, -100 };
        double ort=0;
        double top=0;

        for (double each:arr) {
            top+=each;

        }
        ort=top/arr.length;
        System.out.println(ort);
    }
}
