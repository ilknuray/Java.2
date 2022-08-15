package teamLeadSorulari;

public class Soru_4 {
    public static void main(String[] args) {
       /* 4----1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

        Beklenen çıltı:

        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910*/

        int bas=0;
        int bitis=10;

        for (int i = bas; i <=bitis ; i++) {
            for (int j = bas; j <=i ; j++) {
                System.out.print(i+j);

            }
            System.out.println("");

        }
    }
}
