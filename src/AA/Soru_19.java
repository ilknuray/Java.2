package AA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Soru_19 {
    public static void main(String[] args) {
          /*
        Ekrandan n tane satıcının isminin ve aylık satışlarının girildiğini düşünelim.
        Satışları 10000 ’nin üzerindeki ödül alacak satıcının ismini ekrana yazdıran Java programı yazınız.

         */
        List<String>isimler=new ArrayList<>();
        List<Integer>maas=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String isim="";
        int aylikSatis=0;
        while (aylikSatis!=10000){
            System.out.println("isminizi giriniz");
            isim= sc.nextLine();
            System.out.println("");
            System.out.println("aylik satisinizi giriniz");
            aylikSatis= sc.nextInt();
            sc.nextLine();
            if(aylikSatis<10000){
                System.out.println("odul alan yok");

            }if (aylikSatis>10000){
                System.out.println("odul alan kisi : "+isim);
                break;

            }
        }
    }
}
