package day11_StringManipulation;

public class C03_endsWith {
    public static void main(String[] args) {
        String str="Ah be Java";
        System.out.println(str.endsWith("ava"));//true
        System.out.println(str.endsWith("be Java"));//true
        System.out.println(str.endsWith("Ah be Java"));//true
        System.out.println(str.endsWith(""));//true
    }
}
