package day10_StringManipulation;

public class C05_length {
    public static void main(String[] args) {

       // String str="java candir";// length 11 cunkun saymaya  1 den baslanir.
                                //index ise 0 dan saymaya baslanir.
                                // en buyuk index=str.length()-1.

        String str="Java ogren, isi kap";
        System.out.println(str.length());

        System.out.println(str.charAt(str.length()-1));//son karakteri yazdiralim

        System.out.println(str.charAt(str.length()-3));//sondan ucuncu karakter

        String str2="";//str2 ye bir deger atanmis ve deger hicliktir

        String str3=null;//str3 e bir deger atanmamistir null bunu isaret eder

        System.out.println(str2.length());

       // System.out.println(str3.length()); bir deger atanmadigi icin uzunlugunu bulamaz ve calistirinca hata verir
        //null bir esitligin karsisinda olsa bile bu bir deger atamasi anlamina gelmez.bu ozel bir yazimdir.


    }
}
