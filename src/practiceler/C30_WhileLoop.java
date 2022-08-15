package practiceler;

public class C30_WhileLoop {
    public static void main(String[] args) {
        int sayi=2562;
        int rakamlarTop=0;



        while(sayi!=0){
            rakamlarTop+=sayi%10;
            sayi/=10;

        }  System.out.println(rakamlarTop);






    }
}
