package odevler_7stringManipulation;

public class Soru_2 {
    public static void main(String[] args) {
        //string seklinde verilen asagidaki fiyatlarin toplamini bulunuz
        //string str1=$13.99
        //string str2=$10.55
        //IPUCU:Double.parseDouble() methodunu kullanablirsiniz
        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D","");
        double sayi1=Double.parseDouble(str1);

        str2=str2.replaceAll("\\D","");
        double sayi2=Double.parseDouble(str2);

        System.out.println("$" +(sayi1+sayi2)/100);
    }
}
