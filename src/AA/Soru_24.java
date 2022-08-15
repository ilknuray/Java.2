package AA;

import java.util.Scanner;

public class Soru_24 {
    public static void main(String[] args) {
            /*

Klavyeden girilen herhangi bir yılın, gene klavyeden girilen herhangi
 bir ayının kaç gün çektiğini hesaplayan bilgisayar programını Java programlama dilinde yazınız.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil = scan.nextInt();
        System.out.println("lutfen ay numarasi giriniz");
        int ayNo = scan.nextInt();

        if (ayNo % 2 == 0) {
            System.out.println("ay 30 gundur");
        } else {
            System.out.println("ay 31 gundur");
        }
    }
}