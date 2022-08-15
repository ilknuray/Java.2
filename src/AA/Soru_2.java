package AA;

import java.util.Scanner;

public class Soru_2 {
    /*
     Ekrandan okunan 3 karakter verinin (String) en büyüğünü
      bularak ekrana yazdıran bilgisayar programını Java programlama dilinde yazınız.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("uc ayri string giriniz");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();


        String enUzunKelime = "";
        if (str2.length() > str1.length() && str2.length() > str3.length()) {
            enUzunKelime = str2;
            System.out.println(enUzunKelime);
        }
        if (str3.length() > str1.length() && str3.length() > str2.length()) {
            enUzunKelime = str3;
            System.out.println(enUzunKelime);

        }
        if (str1.length() > str2.length() && str1.length() >str3.length() ) {
            enUzunKelime=str1;
            System.out.println(enUzunKelime);

        }


    }
}

