package practiceler_2;

import java.util.Scanner;

public class interviewQuestions2 {
    public static void main(String[] args) {
        /*
        string olan pin kodunuzu kontrol eeden bir kod yaziniz
        bunu kart sifre kontrolde de kullanabilirsiniz
         */
        Scanner scan=new Scanner(System.in);

        String sifre="ilknur.hanim123";
        int girisSayisi=3;

        System.out.println("lutfen sifre giriniz");


        while (true){
            System.out.println("sifre gir");
            String girilenSifre= scan.nextLine();
            if(sifre.equals(girilenSifre)){
                System.out.println("code bon");
                break;
            }else{
                System.out.println("sifre yanlis");
                girisSayisi--;
                System.out.println("kalan giris sayisi : " +girisSayisi);
            }if(girisSayisi==0){
                System.out.println("giris hakkiniz bitti kartiniz bloke oldu : " +girisSayisi );
                break;
            }
        }

    }
}
