package day29_PassByValue;

public class C05_Immutable {
    public static void main(String[] args) {
        String isim="mine";
        isim=isim.toUpperCase();
        System.out.println(isim);//MINE

        isim="mevlut";
        System.out.println(isim);//mevlut

        for (int i = 0; i <100 ; i++) {
            isim+=" . ";

        }
        System.out.println(isim);

    }
}
