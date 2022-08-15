package day14_methodCreation;

import day13_MethodCreation.C01_MethidCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //verilen uc basamakli bir sayinin rakamlari toplamini yazdiran bir method olusturun


        int input=423;


        rakamlariTopla(input);
        C01_MethidCreation.topla(4,8);
        C01_MethodCreation.terstenYazdir("meva");
    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;


        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;


        System.out.println("girdiginiz " + temp+ "sayisinin rakamlar toplami : " + rakamlarToplami);

    }
}
