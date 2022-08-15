package AA;

import java.util.Scanner;

public class Soru_7 {
    /*Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
     Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
    Ornek:
    INPUT :
            25
            46
    OUTPUT :
    Numaralarin Toplami:
            71*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        int sayi1= sc.nextInt();
        int sayi2=sc.nextInt();

        if(sayi1+sayi2>100){
            System.out.println("OverFlow");
        }else if(sayi1>=0||sayi2>=0){
            System.out.println("sayilarin toplami : " +(sayi1+sayi2));
        }else{
            System.out.println("gecerli sayilar giriniz");
        }

    }
}
