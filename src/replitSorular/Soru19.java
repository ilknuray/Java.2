package replitSorular;

public class Soru19 {
    public static void main(String[] args) {
        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan
        ve yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan
        fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:
INPUT :
25
46
OUTPUT :
Numaralarin Toplami:
71
         */

        int sayi1=15;
        int sayi2=30;

        if(sayi1>=0 && sayi2>=0){
            System.out.println(sayi1+sayi2);
        }else if(sayi1>10&&sayi2>10||(sayi1+sayi2>10)){
            System.out.println("OwerFlow");
        }else{
            System.out.println("gecerli sayilar giriniz");
        }
    }
}
