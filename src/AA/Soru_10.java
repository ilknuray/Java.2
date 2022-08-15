package AA;

import java.util.Scanner;

public class Soru_10 {/*Sınıftaki her öğrenci için isim ve notları giriniz.
    Veri girişi “SON” isimli öğrenci ismi ile sonlandırılsın.
    Her öğrenci için, isim ve harf notu çıkarınız.
    Bütün öğrenciler işlendikten sonra, “not dağılımını çıkarınız”: A’ların adedi,
m*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String isim="";
        String isimler="";
        int notToplam = 0;

        do {



            System.out.println("lutfen ogrenci ismini giriniz");
           isim = sc.nextLine();
            isim +=isimler;

            System.out.println("lutfen ogrenci notunu giriniz");
            int ogrenciNotu = sc.nextInt();
            if (ogrenciNotu > 80) {
                System.out.println("A");
            } else if (ogrenciNotu > 50) {

                System.out.println("B");
            } else {
                System.out.println("C");
            }
            notToplam += ogrenciNotu;


        }while ( !isim.equals("SON"));
        System.out.println("program bitti");
        System.out.println(isim+ " ");
        System.out.println(notToplam);
    }
}