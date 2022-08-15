package teamLeadSorulari;

import java.util.Scanner;

public class Soru_10 {
    public static void main(String[] args) {
       /* 10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.

        Test Data:
        Java is easy

        Aranan String: is

        Bektenen Çıktı:
        True

        Aranan String: and

        Beklenen Çıktı:False*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String str= scan.nextLine();

        str="java is easy";

        if(str.contains("java")){
            System.out.println("true");
        }else if(str.contains("is")){
            System.out.println("true");
        }else if(str.contains("easy")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }












    }
}
