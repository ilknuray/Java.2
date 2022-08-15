package replitSorular;

import java.util.Scanner;

public class Soru25 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
char ch1= 'a' ;
	String name =“John came late"
	Expected Output:
Number of a = 2
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim = scan.nextLine();
        System.out.println("lutfen bir karakter giriniz");
        String karakter = scan.next();
        int top = 0;


        for (int i = 0; i < isim.length(); i++) {
            for (int j = i+1; j < isim.length(); j++) {
                if(isim.contains(isim.substring(i,i+1))){
                    top++;
            }







            } System.out.println(top);
        }

    }
}