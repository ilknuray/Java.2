package day38_exeptions;

public class C01_Exeptions {
    public static void main(String[] args) {
        /*
        bir sorunla karsilasmayi bekledigimiz noktalarda
        if else ile sorunu yakalayip onunla ilgili cozum uretebiirsiniz


        ama java sorunu herzaman if else ile cozemeyecegimizden
        java try-catch block lari olusturmustur
         */
        int a = 1000;
        int b = 50;
        int sayac = 1;

        while (sayac < 100) {
            if(b==0){
                System.out.println("islem yapilirken payda sifir oldu dikkat etmelisiniz");
            }else {

                System.out.println(a / b);
            }
            b--;
            sayac++;

        }
    }
}