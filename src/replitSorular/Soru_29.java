package replitSorular;

public class Soru_29 {
    public static void main(String[] args) {
       /* Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı
        olarak bilinir.
        Input :
        6
        Output:
        6 Mukemmel Sayidir.

======================

        Input
        7
        Output:*/
        int sayi=7;
        int pBolentop=0;
        for (int i = 1; i <sayi ; i++)
           if( sayi%i==0) {
               pBolentop += i;
           }if(sayi==pBolentop){
               System.out.println("mukemmel sayidir");
           }else{
               System.out.println("mukemmel sayi degildir");



        }

    }
}
