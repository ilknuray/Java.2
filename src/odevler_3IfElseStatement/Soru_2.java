package odevler_3IfElseStatement;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
        //kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");

        char harf=scan.next().charAt(0);

        if ((harf>='a' && harf<='z') ||(harf>='A' && harf<='Z')) {
            System.out.println("Girilen karakter bir harftir");
        }else {
            System.out.println("Girilen karakter bir harf degildir");
        }


}}
