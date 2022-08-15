package practiceler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C50_HackerLanguage {
    public static void main(String[] args) {
        //kullanicinin yazdigi metni hacker diline ceviren bir method yaziniz
        /*
        s_5
        a 4
        e 3
        i 1
        o 0
        java ile hersey guzel
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle= scan.nextLine().toLowerCase();
        hackerDili(cumle);


    }

    public static void hackerDili(String cumle) {

        String []arr=new String[cumle.length()];
        for (int i = 0; i <cumle.length() ; i++) {
            arr[i]=cumle.substring(i,i+1);

            if(arr[i].contains("s")){
                arr[i]="5";
            }
            if(arr[i].contains("a")){
                arr[i]="4";
            }
            if(arr[i].contains("e")) {
                arr[i] = "3";
            }
            if(arr[i].contains("i")) {
                arr[i] = "2";
            }
            if(arr[i].contains("o")) {
                arr[i] = "0";
            }
            System.out.print(arr[i]);
        }
    }


}
