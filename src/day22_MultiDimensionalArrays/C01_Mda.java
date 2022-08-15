package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*
        tek katli arraylerde arrayi direk yazdiramiyoruz cunku array non primitive data turudur
        ve her non primitive data direk yazdirilamaz

        ancak arrayin icerisindeki elementleri direk yazdirabiliyorduk
        cunku genelde primitive data turu veya string elementler kullaniliyordu

        multi dimensional arraylerde en dikkat edecegimiz konu ulasmak istedigimiz elementin
        bir araymi yoksa primitive mi oldugudur

         */

        int[][]sayilar={{1,2,3,4},{5,6}};

        /*
        burada sayilar arrayini dusunursek icinde iki tane inner array var
        sayilar[0]==> [1 2 3 4]

        ancak en icerdeki arraylere ulasirsak direk yazdirabiliriz
         */
        System.out.println(sayilar[0]);//bize referans yazdirir
        System.out.println(Arrays.toString(sayilar[0]));

        System.out.println(sayilar[0][1]);// 2 sayilarin 0 inci indexinin icerisindeki 1 inci index i yazdirir
        System.out.println(sayilar[1][0]);//5

        System.out.println(Arrays.toString(sayilar));//buda bize referas dondurur

        System.out.println(Arrays.deepToString(sayilar));

        /*
        arrayi iki sekilde deklare edebiliriz
        1- elemenlari direk yazabiliriz
        int [][]sayilar={{1 2 3 4},{5 6}}


        2- outer ve inner arraylerin uzunluklarini belirterek olusturabiliriz

        int[][]sayilar=new int[4][6]

        ancak 2.yontemle yaptigimizda inner arraylerin farkli uzunlukta olma ihtimalleri olmaz
        bu ornekte outer arrayin 4 tane inner arrayi vardir ve herbir inner arrayin de 6 tane elemani vardir

        eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
        mecburen 1.yontemi kullanmalisiniz
         */















    }
}
