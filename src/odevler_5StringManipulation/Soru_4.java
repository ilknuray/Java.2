package odevler_5StringManipulation;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {
        /*kullanicidan bir cumle isteyin
        cumle buyuk kelimesi iceriyorsa tum cumleyi buyuk harf olarak
        kucuk kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin
        iki kelimeyi de icermiyorsa cumle kucuk yada buyuk kelimesi icermiyor
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = sc.nextLine();


        if (cumle.contains("buyuk")&&cumle.contains("kucuk")) {
            System.out.println("kara ver buyuk mu kucuk mu ?");
        }else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        }else if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else{
            System.out.println("kucuk yada buyuk kelimesi icermiyor");
        }
    }
}



