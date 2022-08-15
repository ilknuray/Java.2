package day10_StringManipulation;

public class C06_IndexOf {
    public static void main(String[] args) {
        String str ="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf("t"));


        String str5="wzpdozd ckzopdkokdzl;,x:;asllpzd";//str 5 te p var midir

        if (str5.indexOf("p")==-1) {
            System.out.println("str5 de istenile harf kullanilmamistir");
        }else{
            System.out.println("str5 te istenen harf kullanilmistir");
        }
    }
}
