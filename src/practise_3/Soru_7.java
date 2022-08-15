package practise_3;

import java.util.Scanner;

public class Soru_7 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dort harfli bir kelime giriniz");
        String str = scan.next();

        if(str.length()<=4){
            char bir=str.charAt(0);
            char iki=str.charAt(1);
            char uc=str.charAt(2);
            char dort=str.charAt(3);

            System.out.println(dort+uc+iki+bir);
        }else{
            System.out.println("kelime dort harf degil");
        }
    }
}
