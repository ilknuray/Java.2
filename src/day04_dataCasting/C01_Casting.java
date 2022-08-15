package day04_dataCasting;

public class C01_Casting {
    public static void main(String[] args) {

        char harf='a';
        char yeniHarf=(char)(harf+1); //char bir variable 98 olamayacagi icin java hata verir
                                       // yani dedim ki 98 i char olarak kabul et dedim
        System.out.println(yeniHarf);  // b yaziyorduk char aliyordu simdi biz 98 yazdik bize ascii degerini verdi
                                      //matematiksel olanlari casting yapmaz

        int sayi=(int)78.5;
        int sayi3='c';
        System.out.println("sayi3 : "+ sayi3);

        char harf2=98;
        System.out.println("harf2 : " + harf2);


    }
}
