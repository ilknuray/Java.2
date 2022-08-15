package practiceler;

import java.util.Scanner;

public class C28_MethodCreationForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str= scan.nextLine();

        tersStr(str);
    }

    public static void tersStr(String str) {
        String ters="";
        for (int i = str.length()-1; i >=0 ; i--) {
            ters+=str.charAt(i);

        }
        System.out.println(ters);






    }
}
