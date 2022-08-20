package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {
        System.out.println(get7den100eToplam());
        System.out.println(get2den11eCarpim());
        System.out.println(faktoriyelHesapla(5));
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
    //4)
}
