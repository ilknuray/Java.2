package odevler_5StringManipulation;

import java.util.Scanner;

public class Soru_1 {


    public static void main(String[] args) {

        //kullanicidan bir cumle ve bir harf isteyin
        //harfin cumlede var olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz");
        String str=scan.nextLine();
        System.out.println("lutfen bir harf yaziniz");
        char harf=scan.next().toUpperCase().charAt(0);

        int srt=str.indexOf("harf");




    }
}
