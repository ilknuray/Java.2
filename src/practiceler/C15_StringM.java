package practiceler;

import java.util.Scanner;

public class C15_StringM {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str= scan.nextLine();
        char ortancaK=str.charAt((str.length()-1)/2);


        if(str.length()%2==1&&str.length()>=3){
            System.out.println(ortancaK);
        }
    }
}
