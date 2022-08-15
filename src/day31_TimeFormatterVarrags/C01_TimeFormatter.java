package day31_TimeFormatterVarrags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : "+ tarihSaat);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yyyy hh:mm");
        System.out.println(dtf.format(tarihSaat));


        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat));





    }
}
