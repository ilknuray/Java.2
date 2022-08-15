package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        split() bir array methodu degil string methodudur ancak array dondurdugu icin
        burada anlattik

        split()
        ile herhangi bir String i istedigimiz sekilde parcalara bolup bir array haline
        getiriyoruz
         */
        String str="java,ne kadar guzel.";

        String [] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        String[]kelimeNe=str.split("ne");
        System.out.println(Arrays.toString(kelimeNe));

        String[]hiclik=str.split("");
        System.out.println(Arrays.toString(hiclik));


    }
}
