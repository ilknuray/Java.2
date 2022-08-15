package practiceler;

import java.util.Scanner;

public class C17_StringM {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str= scan.nextLine();

        int bosluk=str.indexOf(' ');

        if(bosluk==-1&&!(str.isEmpty())){
            System.out.println("bosluk yoktur");
        }else
            System.out.println("bosluk vardir");

    }
}
