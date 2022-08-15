package teamLeadSorulari;

import java.util.Scanner;

public class Soru_16 {
    public static void main(String[] args) {
      /*  Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.
​
        Test Data:
        java is fun
​
        Beklenen Çıktı:
        JAVA IS FUN*/
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen string bir ifade giriniz");
        String str= sc.nextLine();
        System.out.println(str = str.toUpperCase());
    }
}
