package replitSorular;

public class Soru_41 {
    /*
    Array içerisindeki tek ve çift sayıların kaçar tane
     olduğunu bulan Java Kodu yazınız.

Array: [1,2,3,4,5,6,7,8,9]

Beklenen Çıktı:
Tek Sayilar: 5
Cift Sayilar: 4
     */
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int cift=0;
        int tek=0;
        for (int each:arr) {
            if (each % 2 == 0) {
                cift++;

            }

        }
        System.out.println("cift sayilar : " + cift + "tane");
        for (int each2:arr) {
            if(each2%2==1){
                tek++;
            }

        }
        System.out.println("tek sayilar : " + tek +"tane");
    }
}
