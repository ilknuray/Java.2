package practiceler;

import java.util.Scanner;

public class C08_StringManipulation {
    public static void main(String[] args) {
        //kullanicidan isim soyisim alip buyuk harfle yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        isim=isim.toUpperCase();
        soyisim=soyisim.toUpperCase();

        System.out.println(isim+" "+soyisim);
    }
}
