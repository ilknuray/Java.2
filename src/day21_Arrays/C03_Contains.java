package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        //verilen bir arrayin istene bir elemani icerip icermedigini kontrol edip
        //bize true yada false cevabi donen bir method olusturun


        String[]isimler={"basak","nurullah","fatih","adem","enes"};
        Scanner scan=new Scanner(System.in);
        System.out.println("aradiginiz ismi giriniz");
        String arananIsim= scan.nextLine();

        boolean sonuc=contains(isimler,arananIsim);
        if (sonuc) {
            System.out.println("girilen isim listede var");
        }else{
            System.out.println("girilen isim listede yok");
        }

    }

    public static boolean contains(String[] isimler, String arananIsim) {
        boolean sonucMethod=false;

        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].equalsIgnoreCase(arananIsim)){
                sonucMethod=true;
            }

        }



        return sonucMethod;
    }
}
