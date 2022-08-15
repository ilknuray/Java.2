package practiceler;

import java.util.Scanner;

public class C19_MethodCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println("yapmak istediginiz islemin numarasini seciniz\n1-toplama \n2-cikarma \n3-carpma \n4-bolme");
        char islem = scan.next().charAt(0);

        hesaplaMakinesi(islem, sayi1, sayi2);


    }

    public static void hesaplaMakinesi(char islem, int sayi1, int sayi2) {

        if (islem == '1' || islem == '2' || islem == '3' || islem == '4') {
            switch (islem) {
                case '1':
                    System.out.println(sayi1 + sayi2);
                    break;
                case '2':
                    System.out.println(sayi1 - sayi2);
                    break;
                case '3':
                    System.out.println(sayi1 * sayi2);
                    break;
                case '4':
                    System.out.println(sayi1 / sayi2);
                    break;
                default:
                    System.out.println("yanlis secim yaptiniz");
            }
        }


    }
}
