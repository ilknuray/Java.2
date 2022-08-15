package AlpSonmezSorulari;

import java.util.*;

public class DizideEncokTekrar {//Dizi içinde en çok tekrar eden kelimeyi bulma

    public static void main(String[] args) {
        String str="Java da java java";
        String []arr=str.split("");
        System.out.println(Arrays.toString(arr));
       Map<String,Integer> harf=new HashMap<>();
        int sayac=0;
        String enCok="";
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    sayac++;

            }
            }


        }System.out.println(sayac);


    }
}
