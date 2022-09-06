package lambda_functional_programming;

import java.util.List;

public class Utils {
    public static void ayniSatirdaBosluklaYazdir(Object obj) {
        System.out.print(obj + " ");
    }

    public static boolean ciftElemanlariSec(int x) {


        return x % 2 == 0;

    }

    public static boolean tekElemanlariSec(int x) {


        return x % 2 == 1;


    }
    public static  int karesiniAl(int x){
        return x*x;

    }
    public static int kupAl(int x){
        return x*x*x;
    }
    public static boolean ciftAl(int x){
        return (x%2==0);
    }
    public static double yarisiniAl(int x){
        return x/2.0;
    }
    public static char sonKarakteriAl(String str){

        return str.charAt(str.length()-1);

    }
    public static char ilkKarakteriAl(String str){

        return str.charAt(0);

    }
    public static int rakamlarToplaminiAl(int x){
        int top=0;
        while ((x>0)){
            top+= x%10;
            x/=10;
        }
        return top;
    }
}