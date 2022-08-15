package day14_methodCreation;

import day13_MethodCreation.C01_MethidCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilen 4 harfli bir stringi tersten yazdiran bir method olusturalim

            terstenYazdir("okan");
            C01_MethidCreation.topla(6,5);//11


    }

    public static void terstenYazdir(String input){
        String tersInput=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println("verilen kelimenin tersten yazilisi : " + tersInput);

    }
}
