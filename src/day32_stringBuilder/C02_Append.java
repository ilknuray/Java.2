package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java daha ne yapsin");
        sb.append("?");

        System.out.println(sb);
        //append istedigimiz stringi en sona ekler.

        sb.insert(4,"her seyi dusunmus");
        System.out.println(sb);
        //araya ekleme yapmak icin append degil insert kullanmaliyiz

        sb.insert(22,"valla valla",5,11);
        System.out.println(sb);




    }
}
