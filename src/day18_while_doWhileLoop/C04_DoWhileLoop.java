package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {


    public static void main(String[] args) {
        //kullanicidan tam sayilar aln kullanici cift sayi girdigi muddetce sayilari
        //yazdirin yek sayi girdiginde islemi bitirin


        Scanner sc = new Scanner(System.in);
        int sayi = 0;

        //while ile yapalim.

        while (sayi % 2 == 0) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = sc.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("girilen sayi cift : " + sayi);
            } else {
                System.out.println("girilen sayi tek");
            }

        }

        //do while ile
        //do while loop ta onceden olusturulan variable a hangi deger atandiginin hic bir onemi yok
        //kodumuz her durumda calisir


        do {
            System.out.println("Lutfen bir sayi giriniz");
            sayi=sc.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : " + sayi);
            }else{
                System.out.println("Girilen sayi tek, benden bu kadar");
            }
        }

            while (sayi % 2 == 0) ;



}}