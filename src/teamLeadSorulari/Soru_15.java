package teamLeadSorulari;

import java.util.Scanner;

public class Soru_15 {
    public static void main(String[] args) {
     /*   15----
        Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.
        Test Data:
        Java is fun
        Beklenen Çıktı
        0. pozisyondaki karakter : J
        5. pozisyondaki karakter : i
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String str= sc.nextLine();

        for (int i = 0; i <str.length() ; i++) {
            System.out.println("bulmak istediginiz index i giriniz");
            String harf=sc.next();

            System.out.println(str);


        }



    }
}
