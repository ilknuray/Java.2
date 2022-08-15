package AA;

import java.util.Scanner;

public class Soru_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % sayi == 0 && sayi % 1 == 0) {
            System.out.println(sayi + " : sayisi asal sayidir");
        } else {
            System.out.println("asal sayi degildir");
        }
    }
}
