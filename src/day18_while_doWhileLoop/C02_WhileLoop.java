package day18_while_doWhileLoop;

import com.sun.source.tree.WhileLoopTree;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin ve bu sayinin rakamlari top yazdirin

        int input = 5432;
        int rakamlarToplami = 0;
        int birlerBasamagi = 0;


        while (input > 0) {
            birlerBasamagi = input % 10;
            rakamlarToplami += birlerBasamagi;
            input/= 10;

        }

        System.out.println(input +"sayisinin rakamlar toplami : "+rakamlarToplami);
    }
}
