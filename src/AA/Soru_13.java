package AA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_13 {
    public static void main(String[] args) {
           /*
        Bir dizi sayı girerek ortalamalarını bulunuz. Girilen ilk sayı, ortalaması alınacak sayıların adedini versin
        . Örneğin;
Girilen veri :
3
1
2
3
olduğunda, algoritmayı, 3 değer alacak ve bunların ortalamalarını bulacak şekilde geliştiriniz

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("kac tane sayi girmek istiyorsunuz");
        int n= scan.nextInt();
        int sayi=0;
        int top=0;


        List<Integer> sayilar=new ArrayList<>();

        do {
            System.out.println("lutfen tamsayilar giriniz");
            sayi= scan.nextInt();
            sayilar.add(sayi);
            top+=sayi;

            if(sayilar.size()==n){
                System.out.println("sayi girisi bitti ortalamayi alabilirsiniz");
                break;

            }

        }while (sayilar.size()==n);
        System.out.println(top/n);


    }
}
