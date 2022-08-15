package day26_constructor;

import day25_constractor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
        /*
        bibirgun onceki car classindan bir obje olusturalim
        farkli classlardan obje olusturdugumuzda access modifier larida dikkate almaliyiz
         */
        Car car1 = new Car();
        System.out.println(car1.fiyat);
        /*
        araba classindan bir obje olusturdugumda eger default consructor kullanildiysa
        tum ozellikler icin tek tek deger atamak zorunda kaliriz
         */
        Araba araba1 = new Araba();
        araba1.fiyat = 100000;
        araba1.marka = "mercedes";
        araba1.model = "c180";
        araba1.yil = 2010;

        System.out.println("araba 1 bilgiler \nmarka : " + araba1.marka + "\nModel : " + araba1.model
                + "\nYil : " + araba1.yil + "\nFiyat : " + araba1.fiyat);

        Araba araba2 = new Araba("bmv", "5.20", 2011, 15000);

        //eger bir objeji olusturuken bazi ozelliklerini argument
        // olarak belirtip o ozelliklerde bir objeolusturmak istersek java itiraz eder,
        // cunku her classta bir default costructor vardirama o parametresizdir bizim yeni ve
        // parametreli constructorlara ihtiyacimiz vazrdir

        System.out.println("araba 2 bilgiler \nmarka : " + araba2.marka + "\nModel : " + araba2.model
                + "\nYil : " + araba2.yil + "\nFiyat : " + araba2.fiyat);

        Araba araba3=new Araba("opel","astra",2015,78000);
        System.out.println("araba 3 bilgiler \nmarka : " + araba3.marka + "\nModel : " + araba3.model
                + "\nYil : " + araba3.yil + "\nFiyat : " + araba3.fiyat);

        Araba araba4=new Araba("audi","A5",2020,50000);
        System.out.println("araba 4 bilgiler \nmarka : " + araba4.marka + "\nModel : " + araba4.model
                + "\nYil : " + araba4.yil + "\nFiyat : " + araba4.fiyat);





    }}