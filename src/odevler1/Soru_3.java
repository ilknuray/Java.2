package odevler1;

import java.util.Scanner;

public class Soru_3 {

    /*kullanicidan yaricap isteyip cemberin cevresini vedairenin alanini
    hesaplayin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cemberin yaricapini giriniz");
        double r=scan.nextDouble();
        System.out.println("cemberin cevresi = " +2*3.14*2*r);
        System.out.println("dairenin alani = " + 3.14*r*r);
    }
}
