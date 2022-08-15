package teamLeadSorulari;

import java.util.Scanner;

public class Soru_18 {
    public static void main(String[] args) {
       /* Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.

        Test Data:
        java is fun
        Beklenen Çıktı:
        Stringdeki sesli harf sayısı: 4
*/     String kelime="";
        sesliHarfiBul(kelime);
    }

    public static void sesliHarfiBul(String kelime) {
        Scanner sc=new Scanner(System.in);
        System.out.println("string bir ifade giriniz");
        String str= sc.nextLine();
        String aranacakHarfler="aeio";
        int sayac=0;
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j <aranacakHarfler.length() ; j++) {
                if(str.charAt(i)==aranacakHarfler.charAt(j)){
                    sayac++;

                }
            }

        } System.out.println(sayac);

    }
}
