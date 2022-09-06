package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {
        System.out.println(get7den100eToplam());
        System.out.println(get2den11eCarpim());
        System.out.println(faktoriyelHesapla(5));
        System.out.println(verilenIkiSayiArasindakiCiftSayilarinToplami(2,5));
        System.out.println(ikiSayiArasindakiTumSayilarinRakamlariToplami(23,32));
        //1) 7 den 100 kadar integer degerlerinin toplamini bulan bir method olusturun
    }
        public static int get7den100eToplam(){
            return IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();

    }
    //2)2den 11 e kadar integer degerleeinin carpimi bulan bir method olusturun

    public static int get2den11eCarpim(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }
    //3)verilen bir sayinin faktoriyelini hesaplayan bir method olusturun

    public static int faktoriyelHesapla(int x){
        if(x>0) {


            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0'dan buyuk bir deger giriniz");

        return  0;
    }
    //4)verilen iki sayi arasindaki cift sayilarin toplamini bulan bir method olusturun

    public static int verilenIkiSayiArasindakiCiftSayilarinToplami(int x,int y){
        int z=0;

        if(x>y){
            z=x;
            x=y;
            y=z;

        }

        return IntStream.rangeClosed(x,y).filter(Utils::ciftAl).sum();
    }
    //5)verilen iki sayi arasindaki tum sayilarin rakamlarinin toplamini hesaplayan bir method olisturun

    public static int ikiSayiArasindakiTumSayilarinRakamlariToplami(int x,int y){
        int z=0;

        if(x>y){
            z=x;
            x=y;
            y=z;

        }
        return IntStream.rangeClosed(x,y).map(Utils::rakamlarToplaminiAl).sum();
    }

}
