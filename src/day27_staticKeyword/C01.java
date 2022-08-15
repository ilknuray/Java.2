package day27_staticKeyword;

public class C01 {

        static int sayi=10;
        int rakam=5;

    public static void main(String[] args) {

        /*
        class levelda iki tip variable olusturabiliriz

        static variable(class)
        instance variable(obje)

        static variable lar tum classtan kullanilabilirken
        instance olanlari static olmayan mmethodlar kullanabilir
        instance variable lara staticlerden ulasmak icin obje olusturmaliyiz


        instance variablelar obje variable i oldugu icin herhangi bir satirda
         instance variablein degerinin ne oldugunu bulmak icin OBJE OLUSTURULAN
        satirdan itibaren kod incelenmelidir

        static vriable lar class variable i oldugu icin herhangi bir satirda
        static variable in degerini bulmak icin
        classin basindan itibaren kod incelenmelidir
         */

        C01 obje1=new C01();

        System.out.println("obje1 in rakam degeri : " +obje1.rakam);//  5
        System.out.println("obje 1 in sayi degri : " + sayi);//static oldugu icin direk yazilir 10

        obje1.rakam+=1;
        sayi+=1;

        System.out.println("obje1 in rakam degeri : " +obje1.rakam);//  6
        System.out.println("obje 1 in sayi degri : " + sayi);//11

        C01 obj2=new C01();

        System.out.println("obje2 in rakam degeri : " +obj2.rakam);//  5
        System.out.println("obje 2 in sayi degri : " + sayi);//11


        obj2.rakam++;
        sayi++;

        System.out.println("obje1 in rakam degeri : " +obj2.rakam);//  6
        System.out.println("obje 1 in sayi degri : " + sayi);//12


    }
}
