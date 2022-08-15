package practiceler_2.okulProjesi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<Kisi>ogretmenList=new ArrayList<>();
    static List<Kisi>ogrenciList=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static String kisiTuru;
    //sttc olmasinin sebebi tum methodlardan ulasmak icin

    public static void girisPaneli(){
        System.out.println("===================================");
        System.out.println("OGRENCI VE OGRETMEN YONETIM PANELI");
        System.out.println("===================================");
        System.out.println("1 - OGRENCI ISLEMLERI \n2- OGRETMEN ISLEMLERI \nQ- CIKIS ");
        String secim= scan.nextLine().toUpperCase();


        switch (secim){
            case "1":
                kisiTuru="OGRENCI";
                islemlerMenusu();
                break;
            case "2":
               kisiTuru="OGRETMEN";
               islemlerMenusu();
                break;
            case "Q":
                System.out.println("CIKIS");
                break;
            default:
                System.out.println("hatali giris :(");
                girisPaneli();
                break;

        }



    }

    private static void islemlerMenusu() {
        System.out.println("sectigim kisi turu : " +kisiTuru +"Lutfen asagidaki islemleri seciniz");



        System.out.println("***********ISLEMLER***********" +
                "\n1-EKLEME" +
                "\n2-ARAMA" +
                "\n3-LISTELEME" +
                "\n4-SILME" +
                "\n5-ANA MENU" +
                "\n0-CIKIS");
        System.out.println("islem tercihinizi giriniz :");

        int secilenIslem= scan.nextInt();
        switch (secilenIslem){
            case 1:
                ekle();
                islemlerMenusu();
                break;
            case 2:
                ara();
                islemlerMenusu();
            case 3:
                listele();
                islemlerMenusu();
                break;
            case 4:
                sil();
                islemlerMenusu();
                break;
            case 5:
                girisPaneli();
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("dogru giris yapiniz");
                islemlerMenusu();
                break;


        }


    }

    private static void cikis() {

    }

    private static void sil() {

    }

    private static void listele() {

    }

    private static void ara() {

    }

    private static void ekle() {
        System.out.println("**** " + kisiTuru + " ****");
        System.out.println("isim ve soyisim gir");
        String adSoyad= scan.nextLine();
         scan.nextLine();
        System.out.println("kimlik gir");
        String kimlikNo= scan.nextLine();

        System.out.println("yas giriniz");
        int yas= scan.nextInt();

        if(kisiTuru.equals("OGRENCI")){

        }else{
            System.out.println("brans gir");
            String bolum= scan.nextLine();
            scan.nextLine();
            System.out.println("sicil no gir");
            String sicilNo=scan.nextLine();

            Ogretmen ogretmen=new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogretmenList.add(ogretmen);
        }
    }

}
