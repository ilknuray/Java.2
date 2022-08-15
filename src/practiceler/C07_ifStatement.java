package practiceler;

import java.util.Scanner;

public class C07_ifStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        String isim= scan.nextLine();
        System.out.println("lutfen yasiniz giriniz");
        int yas= scan.nextInt();
        System.out.println("lutfen memleketinizi giriniz");
        String memleket= scan.nextLine();

       boolean yasadigiYer=true;

       if (yasadigiYer){
           System.out.println("memleketimi seviyorum");

       }else {
           System.out.println("memleketimi sevmiyorum");
       }

    }
}
