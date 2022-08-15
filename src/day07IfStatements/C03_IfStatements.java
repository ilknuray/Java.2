package day07IfStatements;

public class C03_IfStatements {
    public static void main(String[] args) {
        int sayi = 12;
        if (sayi > 0)
            System.out.println("sayi pozitif");//sarta baglidir
        System.out.println("sayi pozitif kalacaktir");//her zaman calisir

        if (sayi % 2 == 0)
            System.out.println("sayi cift");//sarta baglidir
        System.out.println("cift kalacaktir");//her zaman calisir

        if (sayi % 5 == 0)//sarta baglidir
            System.out.println("sayi 5'in tam kati");//sarta baglidir

        /*bir if statements da }kullanilmazsa java ilk satiri
        sart ile baglar;sonraki satirlar bagimsiz olur
        eger birden fazla satir ayni anda if statementa baglanmissa mutlaka } kullanmaliyiz.
         */

    }
}
