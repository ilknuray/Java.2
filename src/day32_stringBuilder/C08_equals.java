package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("java");
        StringBuilder sb2=new StringBuilder("java");

        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true

        System.out.println(sb1.compareTo(sb2));//0 aradaki fark sifir diyor yani ayni

        StringBuilder sb3=new StringBuilder("jave");

        System.out.println(sb1.compareTo(sb3));//-4 a ile e arasina 4 karakter fark oldugu icin o faki dodurdu
        //bastan baslayarak harf harf karsilastirir ve ilk farkli olan harfe kadar gider farkli olani bulunca bu
        // ascii kodlari arasindaki farklari dondurur




    }
}
