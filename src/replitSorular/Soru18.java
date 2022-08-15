package replitSorular;

import java.util.Scanner;

public class Soru18 {
    public static void main(String[] args) {
        /*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak
        verilen formata ceviren java kodunu yaziniz.

Input :
John White
1234234534561478
Output : Name :
J*** W****
CCN : **** **** **** 1478
Ilk Harfler Buyuk harf ile baslamalidir.

         */

        Scanner sc=new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String isim= sc.nextLine();
        System.out.println("soyadinizi giriniz");
        String soyIsim= sc.nextLine();
        System.out.println("kart numaranizi giriniz");
        String kartNo= sc.nextLine();

        String iisim=isim.substring(0,1).toUpperCase();
        String isimK=isim.substring(1).replaceAll("\\w","*");

        String ssoyIsim=soyIsim.substring(0,1).toUpperCase();
        String sisimK=soyIsim.substring(1).replaceAll("\\w","*");

        String kkartNo=kartNo.substring(15,19);


        System.out.println(iisim+isimK+" \n"+ssoyIsim+sisimK+" "+"\n**** **** **** "+kkartNo);


    }
}
