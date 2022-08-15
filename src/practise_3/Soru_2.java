package practise_3;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {

     /*   String input="abxyc";
       if (input.contains("xyz")){
           System.out.println("true");
       }else{
           System.out.println("false");
       }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen  bir string giriniz");
        String str = sc.nextLine().toLowerCase();
        xyzVarMi(str);
        System.out.println(xyzVarMi(str));

    }

    private static boolean xyzVarMi(String str) {
        if(str.contains("xyz")){
            return true;
        }else
            return false;


    }


}
/*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

