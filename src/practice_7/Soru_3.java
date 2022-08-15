package practice_7;

public class Soru_3 {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */
        String str="Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        str=str.replaceAll(" ","");
        System.out.println("str= "+ str);

        System.out.println("str.length : "+ str.length());


        String[]harf=str.split("");
        System.out.println(harf.length);


        String str1="Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String []kelime=str1.split(" ");
        int boslukSayisi= kelime.length-1;
        System.out.println("boslukSayisi = " + boslukSayisi);

        String charcter[]=str1.split("");
        System.out.println("Charcter sayisi= " +(charcter.length-boslukSayisi));

    }
}
