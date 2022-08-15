package recap_2;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
        /*kullanicidan ilk uc buyuk harften biri secildiginde cumle yazdiran kod yaziniz
        ornek:
        kullanici A B C harflerinden birini secsin
        A yi secmis ise=java is easy
        B yi secmis ise=java is fun
        C yi secmis ise=i need to study :)
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("a b veya c harflerinden birini buyuk seklinde giriniz");
        char harf=sc.next().toUpperCase().charAt(0);

        switch (harf){
            case 'A' :
                System.out.println("java is easy");
                break;
            case 'B' :
                System.out.println("java is fun");
                break;
            case 'C' :
                System.out.println("i need to study");
                break;
            default:
                System.out.println("gecerli bir harf giriniz");
        }
    }
}
