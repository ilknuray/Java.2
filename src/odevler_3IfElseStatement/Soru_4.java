package odevler_3IfElseStatement;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {
        // kullanicidan ucgenin kenar uzunluklarini isteyin ve hepsp esitse es kenae degilse eskenar deil yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen BIRINCI kenar uzunlugunu girin");
        int kenar1 = scan.nextInt();
        System.out.println("lutfen ikinci kenari giriniz");
        int kenar2 = scan.nextInt();
        System.out.println("lutfen ucuncu kenari giriniz");
        int kenar3 = scan.nextInt();

        if (kenar1 == kenar2 && kenar1==kenar3 && kenar2==kenar3)
        {
            System.out.println("Es kenar ucgendir");

        } else {
            System.out.println("es kenar ucgen degildir");
        }
    }
}
