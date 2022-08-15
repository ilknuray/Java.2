package odevler_7stringManipulation;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        /*
        kullanicidan isim isteyin eger isim
        "a" harfi iceriyorsa "girdiginiz isim  a harfi iceriyor"
        isim "z" harfi iceriyorsa"girdiniz isim z harfi iceriyor"
        ikisi de "yoksa girdiginiz isim "a" yada "z" icermiyor "yazdirin
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir isim isteyin");
        String isim=sc.nextLine();

        if (isim.contains("a")) {
            System.out.println("girdiginiz isim  a harfi iceriyor");
        }else if(isim.contains("z")) {
            System.out.println("girdiniz isim z harfi iceriyor");
        }else{
            System.out.println("girdiginiz isim a yada z icermiyor");
        }
    }
}
