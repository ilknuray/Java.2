package odevler1;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
        //kullanicidan ismini alip isminin bas harfini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");

        char ilkHarf= scan.next().charAt(0);
        System.out.println("isminizin ilk harfi : " + ilkHarf);
    }
}
