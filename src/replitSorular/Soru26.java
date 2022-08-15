package replitSorular;

import java.util.Scanner;

public class Soru26 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen)
        ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :

30
40
Beklenen Cikti:
30 ve 40 icin GCD = 10
30 ve 40 icin LCM = 120
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int ekok=0;
        int ebob=0;

        for (int i = 1; i <=sayi1*sayi2 ; i++) {
            if(sayi1%i==0&&sayi2%i==0){
                ebob=i;
            }
            for (int j = sayi1*sayi2; j>0 ; j--) {
                if(sayi1*sayi2%j==0 && j%sayi1==0 && j%sayi2==0 ){
                    ekok=j;
                }

            }
            System.out.println(ebob);
            System.out.println(ekok);
        }

    }
}
