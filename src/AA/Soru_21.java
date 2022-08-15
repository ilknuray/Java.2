package AA;

import java.util.Scanner;

public class Soru_21 {
    public static void main(String[] args) {
         /*
        Klavyeden okunan bir string ifadenin palindrome(tersten okununca da aynı)
        olup olmadığını kontrol eden bilgisayar programını Java dilinde yazınız.

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen string bir ifade giriniz");
        String str= scan.nextLine();
        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
           tersStr+=str.charAt(i);

        }
        if(str.equalsIgnoreCase(tersStr)){
            System.out.println("girdiginiz kelime palindromdur");
        }else {
            System.out.println("palindrom degildir");
        }
    }
}
