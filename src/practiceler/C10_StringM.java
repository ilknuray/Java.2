package practiceler;

public class C10_StringM {
    public static void main(String[] args) {
        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replace("$", "");
        str2 = str2.replace("$", "");
        System.out.println(str1+str2);

        double sayi1=Double.parseDouble(str1);
        double sayi2=Double.parseDouble(str2);

        System.out.println("$"+(sayi1+sayi2));

    }
}