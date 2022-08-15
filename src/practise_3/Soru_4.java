package practise_3;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {
       /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str= scan.nextLine();
        char ortancaKarakter=str.charAt((str.length()-1)/2);
        if(str.length()%2!=0 && str.length()>=3){
            System.out.println(ortancaKarakter);
        }



    }
    }

