package practiceler;

import java.util.Scanner;

public class C14_StringM {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tane isim giriniz");
        String name1= scan.nextLine();
        String name2= scan.nextLine();

        if(name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2).concat(name2).concat(name1.substring(name1.length()/2)));

        }else{

        }
            System.out.println("name1 cift karakterli olmadigi icin ortasina yazamadik");
    }
}
