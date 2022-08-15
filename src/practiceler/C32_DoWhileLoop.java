package practiceler;

import java.util.Scanner;

public class C32_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String k="";
        do {
            System.out.println("lutfen bir karakter giriniz");
            k=scan.next();
            System.out.println("program calisiyor");
        }while (!k.equalsIgnoreCase("x"));
        System.out.println("prigram bitti");
    }
}
