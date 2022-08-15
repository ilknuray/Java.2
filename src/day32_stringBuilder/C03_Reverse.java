package day32_stringBuilder;

public class C03_Reverse {
    public static void main(String[] args) {
        //verilen bir imputu tersine cevirip bize
        // donduren bir method olusturun


        String input="Hey gidi for loop gunleri";
        String terInput=tersineCevir(input);
    }

    public static String tersineCevir(String input) {

        StringBuilder sb=new StringBuilder(input);
        return sb.reverse().toString();//string builder i string e cevirmek icin



    }
}
