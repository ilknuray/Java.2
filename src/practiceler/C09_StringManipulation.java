package practiceler;

public class C09_StringManipulation {
    public static void main(String[] args) {
        String str1="fatih";
        String str2="ilknur";
        System.out.println(str1.concat(str2));
        str1=str1.substring(1);
        str2=str2.substring(1);
        System.out.println(str1.concat(str2));
    }
}
