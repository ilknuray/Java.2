package day38_exeptions;

public class C02_Exeptions {
    public static void main(String[] args) {
        int a=1000;
        int b=50;
        int sayac= 0;
        /*
        try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
        islemleri yazmak icin kullanilir
        catch den sonraki parantez karsilasmayi bekledigimiz
        exeption turunu javaya soylemek icin kullanir

        catch blogu:javaya soyledigimiz exeption gerceklesirse javanin
         yapmasini istedigimiz  islem

         catch blogunun onundeki paranteze karsilasmayi bekledigimiz
         exception i yazabilir veya herturlu exeption da devreye girmesini istiyorsak
         tum exceptionlarin parenti olan exception yazabiliriz
         */


        while (sayac<100){
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println("payda sifir oldu,dikkatli ol");
            }
            b--;
            sayac++;
        }

    }

}
