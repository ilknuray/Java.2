package day29_PassByValue;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        immutable:degistirilemez
        mutable:degistirilebilir

        en meshur immutable class string dir
         */

        String str="yildiz bank";
        System.out.println(str.toUpperCase());

        str.toLowerCase();
        System.out.println(str);

        str.substring(3,5);
        System.out.println(str);

        //java da string gibi metin ifadelerde kullanacagimiz string builder classi da vardir

        StringBuilder sb=new StringBuilder("java bank");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.append(".");
        System.out.println(sb);



    }
}
