package odevler_7stringManipulation;

public class Soru_1 {
    public static void main(String[] args) {
        //string methodlarini kullanarak " Java ogrenmek123 Cok guzel@ "
        //stringini "Java ogrenmek cok guzel." sekline getirin

        String str=" Java ogrenmek123 Cok guzel@ ";

        str=str.replace("@",".");
        str=str.replaceAll("\\d","");
        str=str.replace("C","c");
        str=str.replaceAll("\\s","ABC");
        str=str.replaceAll("ABC"," ");
        System.out.println(str);
    }
}
