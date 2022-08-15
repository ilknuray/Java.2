package recap_2;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        //girilen uc haneli bir sayinin okunusunu sayi ile yazdiriniz

        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen uc basamakli bir sayi giriniz :");
        int sayi= sc.nextInt();

        int birlerBasamagi=sayi%10;
        int onlarBasamagi=(sayi/10)%10;
        int yuzlerBasamagi=sayi/100;

        if(sayi>99&& sayi<1000){
            switch (yuzlerBasamagi){
                case 0:
                case 1 :
                case 2 :
                case 3 :
                case 4 :
                case 5 :
                case 6 :
                case 7 :
                case 8 :
                case 9 :


            }

        }
    }
}
