package day17nestedForLoop;

public class C02_NestedForLoopCarpTablo {
    public static void main(String[] args) {
        //verilen sayiya gore carpim tablosunu olusturun

        int input=3;
        for (int i = 1; i <=3 ; i++) {

            for (int j = 1; j <=3 ; j++) {

                System.out.print(i*j +" ");
            }
            System.out.println("");
        }
    }
}
