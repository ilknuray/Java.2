package recap_2;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {
        //kullanicidan ismini ve soyismini girmesini isteyin,sonrasinda tam ismini
        //buyuk harfle yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= sc.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyIsim=sc.nextLine();

        System.out.println(isim.concat(" "+soyIsim).toUpperCase());

    }
}
//iki tane degeri altalta yaparsam multiple decleration yapilir