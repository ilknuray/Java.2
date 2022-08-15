package practiceInterviewQuestions;

import java.util.Scanner;

public class Soru_1 {
    /*
    birden baslayarak girilen sayiya kadar herbir tamsayinin amstrong
    sayi olup olmadigini gosteren program yaziniz

    armstrong sayi:herhangi bir uc basamakli sayinin rakamlari kupleri toplami
    o sayiya esitse bu armstrong sayidir
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        armstrongSayi(sayi);




    }

    private static void armstrongSayi(int sayi) {
        int sayininKuplerToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=sayi;
        while (sayi>0){
            basamaktakiSayi=sayi%10;
            sayininKuplerToplami+=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            sayi/=10;

        }
        if (girilenSayi==sayininKuplerToplami){
            System.out.println("girilen sayi armstrong sayidir : " + girilenSayi);
        }else {
            System.out.println("girilen sayi armstrong sayi degildir : " +girilenSayi );
        }

    }


}