package day10_StringManipulation;

public class C01_CharAt {
    public static void main(String[] args) {
        String str="Java ogrenmek ne guzel";
        System.out.println(str.charAt(0));

        System.out.println(str.toUpperCase().charAt(7));//buyuk R yazdirir

        System.out.println(str.charAt(21));//l

        System.out.println(str.charAt(22));// calistirmaz sinirlarin disinda kalir.Son harfi bulmak icin str
        // uzunlugunun 1 eksigini index olarak gireriz.EGER INDEX OLARAK uzunlugu veya daha farkli bir sayiyi
       // girersek java exception verir

        //charat() kullandigimizda sonuc char olacagi icin artik manipulasyon yapamayiz
        //string methodlarindan kullanmamiz gereken varsa charAt demeden once yapmaliyiz





    }
}
