package practiceler;

import java.util.Scanner;

public class C11_StringM {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str= scan.nextLine();

        if(str.length()>=3){
            System.out.println(str.substring(1).concat(str.substring(1).concat(str.substring(1))));
        }else{
            System.out.println(str);
        }
    }
}
