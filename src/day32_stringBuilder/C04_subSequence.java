package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Fatih");

        sb.substring(0,3);//string dondurdugu icin string builderin eski halini degistirmez
        System.out.println(sb);

        sb.subSequence(0,3);//fatih yazdiriyor degistirmiyor
        System.out.println(sb);
    }
}
