package recap_2;

import java.util.Scanner;

public class Soru_8 {
    public static void main(String[] args) {
        /*kullanicidan bir kelime isteyin eger kelime uc veya daha fazla harften
        olusuyorsa son iki harfini 3 kere yazdirin
        degil ise girilen kelimeyi yazdirin

        input=ali
        output=lilili

        input=el
        output=el
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str= sc.nextLine();

        if(str.length()>=3) {
            String str1 = str.substring(str.length() - 2);
            System.out.println(str1 + str1 + str1);
        }else {
            System.out.println(str);
        }

    }
}
