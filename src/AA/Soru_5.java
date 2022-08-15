package AA;

import java.util.Scanner;

public class Soru_5 {
    /*
        Negatif bir sayı girilene kadar klavyeden girilen öğrenci
        notlarını alarak bunların ortalamasını ekrana yazdıran bilgisayar programını yazınız?
         */
    public static void main(String[] args) {
        int not=0;
        int top=0;
        int ogrenciSayisi=0;
        int ort=0;
        Scanner sc=new Scanner(System.in);


        do {
            System.out.println("lutfen notunuzu giriniz");
            not= sc.nextInt();
            if (not>0){
                top+=not;
                ogrenciSayisi++;
            }else {
                System.out.println("negatif sayi girdiniz islem bitti");

            }
        }
        while (not>0);
        System.out.println(top/ogrenciSayisi);

        }




    }

