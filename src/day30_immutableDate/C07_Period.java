package day30_immutableDate;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        //iki tarih arasindaki sureyi bulma

        LocalDate tarih=LocalDate.of(1988,1,27);
        LocalDate bugun=LocalDate.now();


        Period period=Period.between(tarih,bugun);

        System.out.println(period);

        System.out.println(period.getYears());



    }
}
