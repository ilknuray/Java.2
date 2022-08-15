package practiceler;

public class C44_MDArrays {
    public static void main(String[] args) {
        //verilen bir cumledeki bosluklar haric karakter sayisini bulunuz

        String str="verilen bir cumledeki bosluklar haric karakter sayisini bulunuz";

        str=str.replace(" ","");
        System.out.println(str.length());

        String[]harf=str.split("");
        System.out.println(harf.length);






    }
}
