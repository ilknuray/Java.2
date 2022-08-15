package day18_while_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
/*
kullanicidan baslangic ve bitis harflerini alin ve baslangic harfinden
baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin
 */

        char ilkHarf='f';
        char sonHarf='i';

        char temp=ilkHarf;
        String buyult="";

        while (temp<=sonHarf){

            buyult=(temp+"").toUpperCase();
            System.out.println(buyult+ " ");
            temp+=1;
        }
    }
}
