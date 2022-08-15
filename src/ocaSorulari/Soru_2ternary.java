package ocaSorulari;

public class Soru_2ternary {
    public static void main(String[] args) {

        int x=5;
        System.out.println((x>2)? (x<4? 10:8):7);
        //verilen bir sayini tek veya cift oldugunu yazdiran bir kod yazdirin

        int sayi=20;
        if(sayi%2==0){
            System.out.println("cift sayi");

        }else{
            System.out.println("tek sayi");
        }
        System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
    }
}
