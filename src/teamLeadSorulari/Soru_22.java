package teamLeadSorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_22 {
    public static void main(String[] args) {
       /* 29----
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
        Test Data:
        sentence -> "Java is fun"
        reversed -> "fun is Java"*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen string bir ifade girnz");
        String str= scan.nextLine();
        String ters="";

        List<String>arr=new ArrayList<>();
        arr.add(str);
        str.split(" ");
        System.out.println(str);
        for (int i =str.length()-1 ; i >=0 ; i--) {
            ters+=str.charAt(i);


        }
        System.out.println(str);



    }
}
