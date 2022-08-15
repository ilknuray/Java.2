package teamLeadSorulari;

public class Soru_9 {
    public static void main(String[] args) {
       /*9----2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

        Test Data:
        str1: Java is
        str2: fun

        Beklenen Çıktı:
        java is fun*/
        String str1="java is";
        String str2="fun";

        System.out.println(str1.replaceAll("\\s","")+str2);
    }
}
