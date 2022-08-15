package practiceInterviewQuestions;

import java.util.Scanner;

public class Soru_2 {
    /*
    stringi ters cevirmek icin bir java programi yaziniz
    1 string builder
    2 string classi
    3 bir method olusturun ve methodu main methodtan cagirin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String cumle= scan.nextLine();

        StringBuilder str=new StringBuilder();
        str.append(cumle);
        System.out.println(str);
        String tersCumle=str.reverse().toString();
        System.out.println(tersCumle);


        System.out.println("2.yol");
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(cumle.charAt(i));

        }
    }

}
