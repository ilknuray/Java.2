package practiceler;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen iki tamsayi giriniz");
        int sayi= sc.nextInt();
        int sayi2= sc.nextInt();

        int top=sayi+sayi2;
        System.out.println(top);
    }
}
