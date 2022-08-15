package recap_2;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
        //scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestirin
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime1= sc.nextLine();
        System.out.println("lutfen ikinci bir kelime giriniz");
        String kelime2= sc.nextLine();


        System.out.println(kelime1.concat(" " +kelime2));
        System.out.println(kelime1.substring(1)+" " +kelime2.substring(1));


    }
}
