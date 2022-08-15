package practiceler;

import java.util.Scanner;

public class C26_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String harf= scan.next().toLowerCase();

        String sesliHarf="aeiou";
        String sessizHarf="bcdfghjklmnpqrstvwyxz";

        if(harf.length()==1){//tek karakter almasini sagladi char gibi
            for (int i = 0; i < sesliHarf.length(); i++) {
                if(sesliHarf.contains(harf)){
                    System.out.println("sesli harf");
                    break;
                }else if(sessizHarf.contains(harf)){
                    System.out.println("sessiz harf");
                    break;
                }else
                    System.out.println("yanlis karakter girdiniz");
                break;

            }

        }else
            System.out.println("tek karakter giriniz");




    }
}
