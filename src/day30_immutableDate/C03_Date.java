package day30_immutableDate;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);

        System.out.println(tarih.getDayOfYear());//yilin kacinci gunu
        System.out.println(tarih.getDayOfWeek());//haftanin hangi gunu
        System.out.println(tarih.getMonthValue());//7 kacinci aydayiz
        System.out.println(tarih.isLeapYear());//false

        LocalDate tarih2=LocalDate.of(1988,1,27);
        System.out.println(tarih2);//yazdiriyor

        LocalDate tarih3=LocalDate.of(1990, Month.FEBRUARY,11);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100));//100gun sonra hangi tarih

        System.out.println(tarih.plusYears(5));//5 yil sonra tarih

        System.out.println(tarih.minusWeeks(20));//20 hafta once

        System.out.println(tarih.minusDays(100).minusMonths(5));

        System.out.println(tarih.isAfter(tarih2));

        //iki farkli dogum gunu girildiginde hangisinde doganin daha buyuk oldugunu bulunuz

        if(tarih2.isAfter(tarih3)){
            System.out.println("tarih 3 te dogan daha buyuk : " +tarih3);

        }else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2 + "tarihinde dogan daha buyuk");
        }else{
            System.out.println("iki tarih birbiri ile ayni");
        }
        System.out.println(tarih.lengthOfYear());





    }
}
