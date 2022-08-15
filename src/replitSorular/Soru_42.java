package replitSorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_42 {
    /*
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak
     için kod yazın ve tersine ters çevrilmiş String'e atayın.

Test Data:
sentence -> "Java is fun"
reversed **-> "**fun is Java**"**
     */
    public static void main(String[] args) {
        List<String>str=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String str1= scan.nextLine();

        str1.split(" ");
        System.out.println(str1);



    }
}
