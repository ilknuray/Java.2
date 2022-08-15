package day24_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
        /*
        icinde ikiyuz tane binden kucuk pozitif tam sayi olan  ir list olusturun
        kullanicidan bir sayi isteyip listede
        varolup olmadigini kullaniciya yazalim
         */
        Random rnd=new Random();
        int sayi=0;
        List<Integer>sayiListesi=new ArrayList<>();

        while (sayiListesi.size()<200){
            sayi= rnd.nextInt(1000);
            if(!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);

        boolean bildiMi=false;
        int tahminSayisi=1;
        Scanner sc=new Scanner(System.in);

        while (!bildiMi){//bildiMi==false diyede yazilabilir

            System.out.println("lutfen bir sayi tahmininde bulunun");
            sayi=sc.nextInt();

            if(sayiListesi.contains(sayi)) {
                System.out.println("tebrikler : " + tahminSayisi +" " +"adet tahminde listeden bir sayi buldunuz");
                bildiMi = true;
            }else {
                System.out.println(tahminSayisi+ " adet ayi soylediniz ama listede yok" );
                tahminSayisi++;
            }

        }
    }
}
