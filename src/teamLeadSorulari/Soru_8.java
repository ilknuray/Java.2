package teamLeadSorulari;

import java.util.Scanner;

public class Soru_8 {
    public static void main(String[] args) {
      /*  8----
        Girilen String değerde tersten yazan Java kodunu yazınız.
        Test Data:
        java
                avaj*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str= scan.nextLine();






        for (int i =str.length()-1; i>=str.length() ; i--) {


            System.out.println(i);
        }


        }

    }

