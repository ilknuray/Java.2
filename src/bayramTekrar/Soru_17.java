package bayramTekrar;

import java.util.Scanner;

public class Soru_17 {
    public static void main(String[] args) {
        /*
         * Kullanicidan 3 tene pozitif tam sayi alniz. bu uc sayinin ucgen olusturma
         * durumunu kontrol ediniz eger ucgen olabiliyor ise, es kenar ucgen olma
         * durumunu da kontrol edniz
         *
         * üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
         * herhangi iki kenar farkı diger kenardan büyük olmali a+b>c>a-b a+c>b>a-c
         * b+c>a>b-c a=b=c ise es kenar ucgen
         *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 3 tane pozitif tamsayi giriniz");
        int ken1= scan.nextInt();
        int ken2= scan.nextInt();
        int ken3= scan.nextInt();

        if( ken1==ken2&&ken2==ken3&&ken1==ken3){
            System.out.println("eskanar ucgen");
        }else if((ken1+ken2>ken3&&ken3>ken1-ken2)&&(ken1+ken3>ken2&&ken2>ken1-ken3)){
            System.out.println("ucgen olusturulabilir");
        }else {
            System.out.println("gecerli sayilar giriniz");
        }
    }
}
