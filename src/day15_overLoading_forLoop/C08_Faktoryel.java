package day15_overLoading_forLoop;

public class C08_Faktoryel {
    public static void main(String[] args) {

        /*input olarak verilen bir tamsayi icin faktoryel hesaplayip yazdiran
        bir method olusturun

        verilen sayi negatif veya 20 den buyuk olursa "girilen sayinin faktoriyeli hesaplanmaz "yazdirin
           */
        int sayi = 10;
        faktoryelAl(sayi);
    }

    public static void faktoryelAl(int sayi) {

        int faktoryel = 1;


        if (sayi < 0 || sayi > 20) {
            System.out.println("girilen sayinin faktoriyeli hesaplanmaz");
        } else if (sayi == 0) {
            System.out.println("0! = 1 dir");
        } else {
            for (int i = 1; i <= sayi; i++) {
                faktoryel *= i;
            }
            System.out.println("faaktoryel degeri : " + faktoryel);
        }
    }
}