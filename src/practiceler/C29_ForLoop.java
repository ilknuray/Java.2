package practiceler;

import java.util.Scanner;

public class C29_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen satir ve sutun olculerini giriniz");
        int satir= scan.nextInt();
        int sutun= scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print(" * ");

            }
            System.out.println("");//bunu yazmazsak hepsini yanyana yazar

        }
    }
}
