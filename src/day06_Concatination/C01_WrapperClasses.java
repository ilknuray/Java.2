package day06_Concatination;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        String str="Java ile hayat ";
        System.out.println(str.toUpperCase());
        boolean guzelMI=true;

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String telefonNumarasi="123456";
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bes basamakli bir sayi giriniz");

        String sifre=scan.nextLine();
        Integer sifreSayi=Integer.parseInt(sifre);
        System.out.println("girilen sifre =" +sifre);
        System.out.println("integer sifre =" + sifreSayi);

    }
}
