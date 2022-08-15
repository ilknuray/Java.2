package day12_StringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "1Bu2gu3n Ja*va- cok g3uz/el";

        //str i Bugun Java cok guzel haline getirin
        //replaceAll daki all un amaci ayni ozellikteki tum karakterleri kapsamasidir
        //butun sayilari sil
        //butun ozel karakterleri sil

        //tum ozel karakterleri sileleim dedigimizde space lerde silinir
        //space leri korumak icin en basta onlar yeine cumlede bulunmayacak
        //anlamsiz birsey koyalim

        str = str.replace(" ", "abc");
        System.out.println("str = " + str);
        str = str.replaceAll("\\W", "");
        System.out.println("str = " + str);
        str = str.replaceAll("\\d", "");
        System.out.println("str = " + str);
        str = str.replace("abc", " ");
        System.out.println("str = " + str);


    }
}
