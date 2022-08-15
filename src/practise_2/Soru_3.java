package practise_2;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
  /*galo,nu litreye ceviren bir java prog yaziniz
        1galon=3.785litre
        litreyi gallona ceviren bir java prog yazdirin
        */

        int gallon=1000;
        double litre=gallon*3.785;
        String sonuc1=gallon +" galon degeri " + litre + "litreye esittir";
        System.out.println(sonuc1);

        int l=1000;
        double G=l/3.785;
        System.out.println(l +"litre degeri "+ litre + "litreye esittir");

        //sicakligi ceniren bir java prog yaziniz
        //c=(f-32)*5/9
        Scanner scan=new Scanner(System.in);
        System.out.println("fahrenayt degerini giriniz : ");
        double fh= scan.nextDouble();
        System.out.println("girdiginiz fahrenayt degeri : " + (fh-32)*5/9 + "santigrat derecedir");

    }
}
