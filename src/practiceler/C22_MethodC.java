package practiceler;

import java.util.Scanner;

public class C22_MethodC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 47 den kucuk bir tam sayi giriniz");
        int sayi = scan.nextInt();
        fibonaccim(sayi);


    }

    public static void fibonaccim(int sayi) {
        int sayi1 = 0;
        int sayi2 = 1;
        int say3;
        System.out.print(sayi1);
        System.out.print(sayi2);


        if (sayi < 47) {
            for (int i = 2; i < sayi; i++) {
                say3 = sayi1 + sayi2;
                System.out.print(say3 + " ");
                sayi1=sayi2;
                sayi2=say3;

            }

        } else
            System.out.println("47 den kucuk bir sayi giriniz");
    }
}
