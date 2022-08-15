package teamLeadSorulari;

import java.util.Scanner;

public class Soru_12 {
    public static void main(String[] args) {
       /* Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

        Test Data:
        Java is fun

        Beklenen Sonuç:
        JAVA IS FUN*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String str= scan.nextLine();

        str=str.toUpperCase();
        System.out.println(str);

    }
}
