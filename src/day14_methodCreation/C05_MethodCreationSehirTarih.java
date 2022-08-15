package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationSehirTarih {
    public static void main(String[] args) {
        //kullanicidan sehir ismini ve dogum tarihini alip
        //bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        //sehir ismini buyuk ay olarak tarihi ise 2022-06-30
        //seklinde kullanmak istiyoruz


        //eger bir classin icerisinde herhangi bir hesaplama yapip bunu saklamak istersek kodumuzu
        //sade ve anlasilir tutmak icin sonucu main methodda yapip sonucunu main methoda
        //dondurebiliriz.return type i void olmayan bir methodun sonucunu main methodda bir variable a atama
        //yaparsak programin geri kalaninda bu yeni methodu kullanma sansimiz olur


        String sehir=sehirAl();
        String tarih=tarihAl();
        System.out.println(tarih + " " +sehir);
    }

    public static String tarihAl() {
        String tarih = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil = sc.nextInt();
        if (yil > 1900 && yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("yil icin gecerli bir sayi yazmalisiniz(1900-2100)");
        }
        System.out.println("kacinci ay oldugunu tamsayi olarak yaziniz");
        int ay = sc.nextInt();

        if (ay <= 0 || ay > 12) {
            System.out.println("ay no 1-12 arasinda olmalidir");
        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";
        } else {
            tarih = tarih + ay + "-";
        }
        System.out.println("lutfen ayin kacinci gunu oldugunu tam sayi olarak giriniz");
        int gun = sc.nextInt();

        if (gun <= 0 || gun > 34) {
            System.out.println("gun no olark 1-31 arasinda sayi girilmelidir");
        } else if (gun < 10) {
            tarih = tarih + "0" + gun;

        } else {
            tarih = tarih + gun;
        }
            return tarih;

    }


    public static String sehirAl(){
            Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sehir adi giriniz");
        String sehir= scan.next().toUpperCase();
        return sehir;
        }

    }

