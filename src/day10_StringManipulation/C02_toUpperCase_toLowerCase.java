package day10_StringManipulation;

import java.util.Locale;

public class C02_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str="Beni psikopata baglamayin";

        System.out.println(str.toUpperCase());//BENI PSIKOPATA BAGLAMAYIN

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

    }
}