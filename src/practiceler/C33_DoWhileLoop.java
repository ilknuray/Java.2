package practiceler;

import java.util.Scanner;

public class C33_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str="";

        do {
            System.out.println("lutfen bir kelime giriniz");
            str= scan.nextLine();
            if (str.length()%2==1){
                System.out.println(str.charAt(str.length()/2));
            }

        }while (str.length()%2==1);

    }
}
