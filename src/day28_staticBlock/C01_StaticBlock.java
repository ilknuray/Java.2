package day28_staticBlock;

public class C01_StaticBlock {
    static int sayi;
    static {
        System.out.println("static block calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);

    }
    static {
        System.out.println("main method altindaki static block calisti");
    }
}
