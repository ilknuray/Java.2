package replitSorular;

import java.util.Scanner;

public class Soru21 {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:
Ay Numarasi:
2
Yil :

2016
OUTPUT :
Subat 2016 29 Gundur.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ay numarasi giriniz");
        int ayNo = scan.nextInt();
        System.out.println("lutfen yil giriniz");
        int yil= scan.nextInt();

        switch (ayNo) {


            case 1:
                System.out.println("ocak"+"\n31 gundur");
                break;
            case 2:
                if(yil%4==0) {
                    System.out.println("subat" + "\n29 gundur");
                }else{
                    System.out.println("subat"+"\n28gundur");
                }
                break;
            case 3:
                System.out.println("mart"+"\n32 gundur");
                break;
            case 4:
                System.out.println("nisan"+"\n30 gundur");
                break;
            case 5:
                System.out.println("mayis"+"\n 31 gundur");
                break;
            case 6:
                System.out.println("haziran"+"\n30 gundur");
                break;
            case 7:
                System.out.println("temmuz"+"\n31 gundur");
                break;
            case 8:
                System.out.println("agustos"+"\n31 gundur");
                break;
            case 9:
                System.out.println("eylul"+"\n30 gundur");
                break;
            case  10:
                System.out.println("ekim"+"\n31 gundur");
                break;
            case  11:
                System.out.println("kasim"+"\n30 gundur");
                break;
            case 12:
                System.out.println("aralik"+"\n31 gundur");
                break;
            default:
                System.out.println("gecerli bir ay numarasi giriniz");






        }
    }
}