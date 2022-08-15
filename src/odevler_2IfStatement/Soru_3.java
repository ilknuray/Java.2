package odevler_2IfStatement;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        //gun isimlerinden birirnin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir gun isminin ilk harfini giriniz");
        String ilkHarf = scan.next().toUpperCase();

        if (ilkHarf.equals("P")) {
            System.out.println("pazartesi  \npersembe \npazar");
        }
        if (ilkHarf.equals("S")) {
            System.out.println("sali");
        }
        if (ilkHarf.equals("C")) {
            System.out.println("carsamba \ncuma \ncumartesi");
        }
    }
}
