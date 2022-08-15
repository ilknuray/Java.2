package practice_6;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
//kullanicidan x girilene kadar program caliisyor yazan ve x girildiginde ise program bitti yazan programi yaziniz

        Scanner scan=new Scanner(System.in);
        String okunan="";
        do{
            System.out.println("harf giriniz");
            okunan= scan.next();
            System.out.println("program calisiyor");
        }while (!okunan.equalsIgnoreCase("x"));
        System.out.println("program bitti");
    }
}
