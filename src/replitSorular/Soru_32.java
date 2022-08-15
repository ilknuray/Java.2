package replitSorular;

public class Soru_32 {
    public static void main(String[] args) {
        /*
        1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.

OutPut:

Sayilarin Toplami : 5050
         */
        int bas=1;
        int son=100;
        int top=0;
        for (int i = bas; i <=son ; i++) {
            top+=i;


        } System.out.println("sayilarin toplami : " + top);
    }
}
