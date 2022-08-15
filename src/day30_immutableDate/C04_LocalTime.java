package day30_immutableDate;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1=LocalTime.now();
        System.out.println(time1);

        /*
        bizim olusturdugumuz date veya time canli saat veya tarih degildir.
        LocalTime.now(); kullandigimiz satirda o anki tarih veya saati alip bizim variable imiza store eder
        time1 variable in degeri sabittir
         */

        Thread.sleep(3000);//kodumuzu girdigimiz sn kadar bekletir

        time1=LocalTime.now();
        System.out.println(time1);

        System.out.println(time1.plusSeconds(1000));
        System.out.println(time1.getSecond());

        System.out.println(time1.minusMinutes(200));

        System.out.println(time1.withHour(3));
    }
}
