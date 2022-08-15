package AlpSonmezSorulari;

import java.util.Scanner;

public class BelirliSicaklikSeviyesi {
    /*
    Bu örneğimizde  Sıcaklık Belirli Bir Sıcaklığa Gelene Kadar Çalışan Program Yazdıracağız.mesela 100 OLSUN

     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int sicaklikSeviyesi = 0;
        do {

            System.out.println("lutfen bir sicaklik degeri giriniz");
            sicaklikSeviyesi = scan.nextInt();
            if (sicaklikSeviyesi < 100){
                System.out.println("henuz kaynama seviyesine ulasmadiniz");
            }


        } while (sicaklikSeviyesi <100);

        if (sicaklikSeviyesi == 100) {
            System.out.println("kaynama seviyesine ulastiniz");

        }

    }}