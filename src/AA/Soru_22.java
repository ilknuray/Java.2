package AA;

public class Soru_22 {     /*
        Girilen Satır Sayısına Göre Aşağıdaki çıktıyı verecek programı Java dilinde yazınız?

Satir Sayisini Giriniz :
5
*
**
***
****
*****
         */
    public static void main(String[] args) {
        int satirSayisi=5;
        for (int i = 1; i <=satirSayisi ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");


        }
    }
}
