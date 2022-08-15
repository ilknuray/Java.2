package practise_3;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String str= sc.nextLine();

        System.out.println(str.contains(" "));
        System.out.println("baska bir string giriniz");
        String str2= sc.next();
        str2=" ";
        System.out.println(str.isEmpty());




    }

}

