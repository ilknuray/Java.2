package practise_4;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {


        //kullanicidan alinan bir tam sayi kadar (47 den kucuk) fibonacci dizisini olusturun
        //0-1-1-2-3-5-8-13....


        Scanner scan=new Scanner(System.in);
        System.out.println("47 den kucuk bir sayi girniz");
        int sayi= scan.nextInt();

       fibonacci(sayi);


        }

    public static void fibonacci(int sayi) {
        int sayi1=0;
        int sayi2=1;
        int sayi3;
        System.out.println(sayi + " ");
        System.out.println(sayi2 + " ");

        if(sayi<47){
            for (int i = 2; i <sayi ; i++) {
                sayi3=sayi1+sayi2;
                System.out.println(sayi3 + " ");
                sayi1=sayi2;
                sayi2=sayi3;

            }
    }else {
            System.out.println("47 den kucuk bir sayi giriniz");
        }

}
}