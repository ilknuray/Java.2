package practiceler;

public class C21_MethodCreation {
    public static void main(String[] args) {
        double sayi=50;

        birimDegistir(sayi);
    }

    public static void birimDegistir(double sayi) {
        double m=0;
        double km=0;


        m=sayi/100;
        System.out.println(m);
        km=sayi/10000;
        System.out.println(km);

    }


}
