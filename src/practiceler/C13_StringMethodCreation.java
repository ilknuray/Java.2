package practiceler;

import java.util.Scanner;

public class C13_StringMethodCreation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str= scan.nextLine().toLowerCase();
        xyzVarMi(str);
        System.out.println(xyzVarMi(str));


    }

    public static boolean xyzVarMi(String str) {
        if(str.contains("xyz")){
            return true;
        }else
            return false;
        }
    }

