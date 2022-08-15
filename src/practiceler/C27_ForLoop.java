package practiceler;

import java.util.Scanner;

public class C27_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1 'den buyuk tam sayi giriniz");
        int sayi= scan.nextInt();
        int top=0;

        for (int i = 1; i <sayi ; i++) {
            System.out.println(i*i);
            top+=(i*i);

        }
        System.out.println(top);
    }
}
