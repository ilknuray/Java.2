package replitSorular;

public class Soru_34 {
    public static void main(String[] args) {
        /*
        Array deki sayıları tolpayan Java kodunu yazınız.

array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Beklenen Çıktı:
Array toplamı: 55
         */
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int top=0;

        for (int each:arr) {
            top+=each;


        }
        System.out.println(top);


    }
}
