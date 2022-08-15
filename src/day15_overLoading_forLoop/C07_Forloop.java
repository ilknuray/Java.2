package day15_overLoading_forLoop;

public class C07_Forloop {
    public static void main(String[] args) {

        C06_StrinTerseCevirme.tersYazdir("ilknur");

        //100 den 1 e kadar 8 ile bolunebilen sayilari yazdirin

        for (int i = 1; i <= 100; i++) {
            if (i % 8 == 0) {

                System.out.print(i + " ");

            }
        }
    }
}